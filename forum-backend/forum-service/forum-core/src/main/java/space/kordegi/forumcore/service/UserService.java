package space.kordegi.forumcore.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import space.kordegi.forumcore.dao.UserMapper;
import space.kordegi.forumcore.entity.User;

@Service
public class UserService {
  @Resource
  private UserMapper userMapper;

  public User getUser(){
    return userMapper.getUser();
  }
}
