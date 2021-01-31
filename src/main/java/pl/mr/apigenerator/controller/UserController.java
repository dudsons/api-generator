package pl.mr.apigenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.mr.apigenerator.model.User;
import pl.mr.apigenerator.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/test")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> sendUsersList() {
        List<User> users = userService.getUsers();
        if (users.size() > 0) {
            return ResponseEntity.ok(users);
        } else {
            return ResponseEntity.badRequest().body(new String("Empty user list"));
        }
    }
}

