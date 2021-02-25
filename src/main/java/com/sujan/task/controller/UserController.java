package com.sujan.task.controller;

import com.sujan.task.dto.UserDto;
import com.sujan.task.model.User;
import com.sujan.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController (UserService userService)
    {
        this.userService=userService;
    }


    @GetMapping()
    public ResponseEntity<User> getUserList()
    {
        return new ResponseEntity(userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<User> saveUser(@RequestBody UserDto userDto)
    {
        return new ResponseEntity(userService.addUser(userDto),HttpStatus.CREATED);
    }
}
