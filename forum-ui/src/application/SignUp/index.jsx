import {useState} from "react";
import { reactLocalStorage } from 'reactjs-localstorage';
import {Button, Form, Input, message} from "antd";

const RegistrationForm = () => {
    const [loading, setLoading] = useState(false);

    const onFinish = (values) => {
        setLoading(true);
        const userList = reactLocalStorage.get('userList') || [];
        const userFrontEnd = userList.find(user => user.username === values.username);
        const userBackEnd = null;
        if (userFrontEnd || userBackEnd) {
            message.error('Replicated');
        } else {
            userList.push({
                username: values.username,
                password: values.password,
            });
            // axios backend
            reactLocalStorage.set('userList', userList);
            message.success('success');
        }
        setLoading(false);
    };

    return (
        <Form
            name="registration-form"
            onFinish={onFinish}
            style={{ maxWidth: '300px', margin: 'auto', marginTop: '100px' }}
        >
            <Form.Item
                name="username"
                rules={[{ required: true, message: 'plz enter username' }]}
            >
                <Input placeholder="username" />
            </Form.Item>

            <Form.Item
                name="password"
                rules={[{ required: true, message: 'plz enter password' }]}
            >
                <Input placeholder="password" />
            </Form.Item>
            <Form.Item
                name="confirm"
                dependencies={['password']}
                hasFeedback
                rules={[
                    { required: true, message: 'plz confirm password' },
                    ({getFieldValue}) => ({
                        validator(_, value) {
                            if (!value || getFieldValue('password') === value) {
                                return Promise.resolve();
                            }
                            return Promise.reject(new Error("different passwords"));
                        }
                    })
                ]}
            >
                <Input placeholder="confirm password" />
            </Form.Item>
            <Form.Item>
                <Button type="primary" htmlType="submit" loading={loading} style={{ width: '100%' }}>
                    Register
                </Button>
            </Form.Item>
        </Form>
    );
};

export default RegistrationForm;