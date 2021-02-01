const { injectBabelPlugin } = require('react-app-rewired');
const rewireLess = require('react-app-rewire-less');
const { override, addLessLoader } = require('customize-cra');
const path = require('path');
module.exports = override(
  // 使用less-loader对源码重的less的变量进行重新制定，设置antd自定义主题
  addLessLoader({
    javascriptEnabled: true,
    modifyVars:{'@primary-color':'#1DA57A'},
  })
);
