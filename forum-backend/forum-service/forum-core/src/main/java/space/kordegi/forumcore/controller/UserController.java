package space.kordegi.forumcore.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.kordegi.forumcore.entity.User;
import space.kordegi.forumcore.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
  @Resource
  private UserService userService;

  @GetMapping("/getUser")
  public User getUser(){
    return userService.getUser();
  }


}
