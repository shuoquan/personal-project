const Sequelize = require('sequelize');

const { Op } = Sequelize;

const sequelize = new Sequelize('gbox_manager', 'root', 'reload123', {
  host: 'localhost',
  dialect: 'mysql',
});

const box = sequelize.define('boxes', {
  id: {
    type: Sequelize.INTEGER,
    primaryKey: true,
  },
  code: {
    type: Sequelize.STRING,
  },
  company_id: {
    type: Sequelize.INTEGER,
  },
}, {
  freezeTableName: true,
  timestamps: false,
});
(async () => {
  const boxes = await box.findAll({
    where: {
      code: { [Op.in]: ['gbox-19', 'zkb-18'] },
    },
  });
  console.log(boxes[0].getDataValue('code'));
})();
// sequelize
//   .authenticate()
//   .then(() => {
//     console.log('Connection has been established successfully.');
//   })
//   .catch(err => {
//     console.error('Unable to connect to the database:', err);
//   });
