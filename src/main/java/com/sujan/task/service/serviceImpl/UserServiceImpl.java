package com.sujan.task.service.serviceImpl;

import com.sujan.task.dto.UserDto;
import com.sujan.task.model.User;
import com.sujan.task.repo.UserRepo;
import com.sujan.task.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    private final UserRepo userRepo;
//
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepo userRepo)
    {
        this.userRepo=userRepo;
    }


    @Override
    public List<User> getUsers() {
        List <User> users = userRepo.findAll();
        return users;
    }

    @Transactional
    @Override
    public User addUser(UserDto userdto) {
        User user=new User();
     user.setUsername(userdto.getUsername());
     user.setPassword(passwordEncoder.encode(userdto.getPassword()));
     user.setRole(userdto.getRole());
     user.setEnabled(1);

      return   userRepo.saveAndFlush(user);
    }

    @Transactional
    @Override
    public User updateUser(User user) {
       return userRepo.saveAndFlush(user);
    }
}
