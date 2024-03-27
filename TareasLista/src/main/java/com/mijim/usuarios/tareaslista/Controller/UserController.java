package com.mijim.usuarios.tareaslista.Controller;


import com.mijim.usuarios.tareaslista.DTO.UserDTO;
import com.mijim.usuarios.tareaslista.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RequestMapping("api/v1/login")
@CrossOrigin
@RestController


public class UserController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String SaveUsuarios(@RequestBody UserDTO userDto){
        /*String id = userService.addUser(userDto);*/
        String id = userService.addUser(userDto);
        return id;
    }


}
