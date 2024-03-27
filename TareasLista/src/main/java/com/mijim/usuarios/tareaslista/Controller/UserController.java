package com.mijim.usuarios.tareaslista.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/login")
@CrossOrigin
@RestController
public class UserController {

    @PostMapping(path = "/save")
    public String SaveUsuarios(@RequestMapping UserDto userDto){
        Stringid = userService.addUser(userDto);
        return id;
    }
}
