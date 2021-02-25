package com.sujan.task.service;

import com.sujan.task.dto.UserDto;
import com.sujan.task.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User addUser(UserDto user);
    User updateUser(User user);

}
