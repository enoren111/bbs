package space.kordegi.forumcore.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import space.kordegi.forumcore.dao.LoginMapper;
import space.kordegi.forumcore.entity.User;

@Service
public class LoginService {
    @Resource
    private LoginMapper loginMapper;

    public boolean validateLogin(String userName, String password){
        return loginMapper.existsByUsername(userName) && loginMapper.findPasswordByUserName(userName).equals(password);
    }

}
