package com.couse.projetoSpring.repositories;

import com.couse.projetoSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{}

