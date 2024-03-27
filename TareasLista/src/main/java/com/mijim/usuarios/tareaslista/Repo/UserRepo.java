package com.mijim.usuarios.tareaslista.Repo;

import com.mijim.usuarios.tareaslista.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository <User, Integer> {

}
