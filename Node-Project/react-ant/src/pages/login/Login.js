import React, { Component } from "react";
import { Form, Input, Button, Checkbox } from "antd";
import { UserOutlined, LockOutlined } from "@ant-design/icons";
import "./Login.less";

export default class Login extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    const onFinish = values => {
      console.log("Received values of form: ", values);
      this.props.history.push('/home');
    };
    return (
      <>
        <div className="container">
          <div className="center-box">
            <Form
              name="normal_login"
              className="login-form"
              initialValues={{
                remember: true
              }}
              onFinish={onFinish}
            >
              <Form.Item
                name="username"
                className="form"
                rules={[
                  {
                    required: true,
                    message: "请输入用户名!"
                  }
                ]}
              >
                <Input
                  prefix={<UserOutlined className="site-form-item-icon" />}
                  placeholder="Username"
                />
              </Form.Item>
              <Form.Item
                name="password"
                rules={[
                  {
                    required: true,
                    message: "请输入密码!"
                  },
                  {
                    min: 4,
                    message: "密码至少为4位"
                  },
                  {
                    validator: (rule, value, callback) => {
                      if ((value || '').length > 6) return Promise.reject("密码必须小于7位");
                      return Promise.resolve()
                    }
                  }
                ]}
              >
                <Input
                  prefix={<LockOutlined className="site-form-item-icon" />}
                  type="password"
                  placeholder="Password"
                />
              </Form.Item>
              {/*<Form.Item>*/}
              {/*  <Form.Item name="remember" valuePropName="checked" noStyle>*/}
              {/*    <Checkbox>Remember me</Checkbox>*/}
              {/*  </Form.Item>*/}

              {/*  <a className="login-form-forgot" href="">*/}
              {/*    Forgot password*/}
              {/*  </a>*/}
              {/*</Form.Item>*/}

              <Form.Item style={{ textAlign: "center" }}>
                <Button
                  type="primary"
                  htmlType="submit"
                  className="login-form-button"
                >
                  Log in
                </Button>
                {/*Or <a href="">register now!</a>*/}
              </Form.Item>
            </Form>
          </div>
        </div>
      </>
    );
  }
}
