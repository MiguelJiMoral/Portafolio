package com.mijim.usuarios.tareaslista.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usersId;

    @Column(name = "username", length = 255)
    private String username;

    @Column(name = "password", length = 255)
    private String password;

    public User(int usersId, String username, String password) {
        this.usersId = usersId;
        this.username = username;
        this.password = password;
    }

    public User() {
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
        return "User{" +
                "usersId=" + usersId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
