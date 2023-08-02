package com.couse.projetoSpring.repositories;

import com.couse.projetoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{}
