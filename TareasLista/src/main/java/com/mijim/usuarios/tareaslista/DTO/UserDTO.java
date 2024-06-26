package com.mijim.usuarios.tareaslista.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDTO {

    private int usersId;
    private String username;
    private String password;

    public UserDTO(int usersId, String username, String password) {
        this.usersId = usersId;
        this.username = username;
        this.password = password;
    }

    public UserDTO() {
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "usersId=" + usersId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
