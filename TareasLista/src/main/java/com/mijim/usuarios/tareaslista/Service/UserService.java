package com.mijim.usuarios.tareaslista.Service;

import com.mijim.usuarios.tareaslista.DTO.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {

    String addUser(UserDTO userDto);
}
