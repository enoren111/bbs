package space.kordegi.forumcore.controller;

import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.kordegi.forumcore.dto.LoginRequest;
import space.kordegi.forumcore.service.LoginService;

import java.util.Objects;

@RestController
@CrossOrigin
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginValidation(@RequestBody LoginRequest loginRequest){
        System.out.println("Username: " + loginRequest.getUsername());
        System.out.println("Password: " + loginRequest.getPassword());

        if(loginService.validateLogin(loginRequest.getUsername(),loginRequest.getPassword())){
            System.out.println("Welcome to the bbs");
            return ResponseEntity.ok().body("welcome");
        } else if (loginRequest.getUsername().isEmpty() || loginRequest.getPassword().isEmpty()) {
            return ResponseEntity.badRequest().body("Your input is incomplete!");
        } else {
            System.out.println("Invalid username or password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }


}
