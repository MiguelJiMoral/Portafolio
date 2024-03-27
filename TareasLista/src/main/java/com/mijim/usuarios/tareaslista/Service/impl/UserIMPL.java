package com.mijim.usuarios.tareaslista.Service.impl;

import com.mijim.usuarios.tareaslista.DTO.UserDTO;
import com.mijim.usuarios.tareaslista.Entity.User;
import com.mijim.usuarios.tareaslista.Repo.UserRepo;
import com.mijim.usuarios.tareaslista.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserIMPL implements UserService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserRepo userRepo;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUser(UserDTO userDto) {

        User user = new User(
                userDto.getUsersId(),
                userDto.getUsername(),
                this.passwordEncoder.encode(userDto.getPassword())
        );

        userRepo.save(user);
        return user.getUsername();
    }
}
