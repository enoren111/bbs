import { useState } from 'react';
import {Form, Input, Button, message, Layout} from 'antd';
import {LoginTitle} from "./style.jsx";
import {useNavigate} from "react-router-dom";
import axios from 'axios';

const LoginForm = () => {
    const [loading, setLoading] = useState(false); //This is a param and function to control the state
    let navigate = useNavigate();
    const onFinish = async (values) => {
        setLoading(true);
        
        const response = await axios.post('http://localhost:8088/login',{
            username:values.username,
            password:values.password,
        }, {
            headers: {
                'Content-Type': 'application/json',
            },
        }).then(response => {
                message.success('welcome to the bbs!');
                navigate('/home');
        }).catch(error => {
            console.error('Login failed', error);
            if (error.response && error.response.status === 401) {
                message.error('Invalid username or password');
            } else {
                message.error('');
            }
        });
        setLoading(false);
    }

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
