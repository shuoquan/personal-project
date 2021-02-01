/**
 * 对RabbitMQ的封装
 */
const amqp = require('amqplib');

class RabbitMQ {
  constructor() {
      this.hosts = [];
      this.index = 0;
      this.length = this.hosts.length;
      this.open = amqp.connect(this.hosts[this.index]);
  }

  receiveQueueMsg(queueName, receiveCallBack, errCallBack) {
    const self = this;

    self.open
      .then((conn) => conn.createChannel())
      .then((channel) => channel.assertQueue(queueName).then((ok) => channel
        .consume(queueName, (msg) => {
          if (msg !== null) {
            const data = msg.content.toString();
            channel.ack(msg);
            receiveCallBack && receiveCallBack(data);
          }
        })
        .finally(() => {
          setTimeout(() => {
            if (channel) {
              channel.close();
            }
          }, 500);
        })))
      .catch(() => {
        const num = self.index++;
        if (num <= self.length - 1) {
          self.open = amqp.connect(self.hosts[num]);
        } else {
          self.index = 0;
          self.open = amqp.connect(self.hosts[0]);
        }
      });
  }
}
const mq = new RabbitMQ();
mq.receiveQueueMsg('testQueue', (msg) => {
  console.log(msg);
});
