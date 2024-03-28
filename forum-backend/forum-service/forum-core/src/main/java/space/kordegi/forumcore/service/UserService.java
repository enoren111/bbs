package space.kordegi.forumcore.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import space.kordegi.forumcore.dao.LoginMapper;
import space.kordegi.forumcore.dao.UserMapper;
import space.kordegi.forumcore.entity.User;

@Service
public class UserService {
  @Resource
  private UserMapper userMapper;

  /**
   * this function is used to find the login username*/
  public User getUser(){
    return userMapper.getUser();
  }

  public String getPassword(){return  userMapper.getPassword();}
}

