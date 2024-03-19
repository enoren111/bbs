import { useState } from 'react';
import {Form, Input, Button, message, Layout} from 'antd';
import { reactLocalStorage } from 'reactjs-localstorage';
import {LoginTitle} from "./style.jsx";
import {useNavigate} from "react-router-dom";

const LoginForm = () => {
    const [loading, setLoading] = useState(false);
    let navigate = useNavigate();
    const onFinish = async (values) => {
        setLoading(true);
        if (values.username === 'admin' && values.password === 'admin') {
            reactLocalStorage.set('token', values);
            //navigate
            navigate('/home');
            message.success('Login success!');
        } else {
            message.error('Username or Password Error');
        }
        setLoading(false);
    };

    return (
        <Layout>
            <Form
                name="login-form"
                onFinish={onFinish}
                initialValues={{remember: true}}
                style={{
                    maxWidth: '300px',
                    margin: 'auto',
                    padding: '10px 50px',
                    marginTop: '100px',
                    border: '1px solid #000000'
                }}
            >
                <LoginTitle>Login</LoginTitle>
                <Form.Item
                    name="username"
                    rules={[{required: true, message: 'Please enter username'}]}
                >
                    <Input placeholder="Username"/>
                </Form.Item>

                <Form.Item
                    name="password"
                    rules={[{required: true, message: 'Please enter password'}]}
                >
                    <Input.Password placeholder="Password"/>
                </Form.Item>

                <Form.Item>
                    <Button type="primary" htmlType="submit" loading={loading} style={{width: '100%'}}>
                        Login
                    </Button>
                </Form.Item>
            </Form>
        </Layout>
    );
};

export default LoginForm;
