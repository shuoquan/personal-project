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

  sendQueueMsg(queueName, msg, errCallBack) {
    const self = this;

    self.open
      .then((conn) => conn.createChannel())
      .then((channel) => channel
        .assertQueue(queueName)
        .then((ok) => channel.sendToQueue(queueName, new Buffer(msg), {
          persistent: true,
        }))
        .then((data) => {
          if (data) {
            errCallBack && errCallBack('success');
            channel.close();
          }
        })
        .catch(() => {
          setTimeout(() => {
            if (channel) {
              channel.close();
            }
          }, 500);
        }))
      .catch(() => {
        const num = self.index++;

        if (num <= self.length - 1) {
          self.open = amqp.connect(self.hosts[num]);
        } else {
          self.index = 0;
        }
      });
  }
}
const mq = new RabbitMQ();
mq.sendQueueMsg('testQueue', 'my first message', (error) => {
  console.log(error);
});
