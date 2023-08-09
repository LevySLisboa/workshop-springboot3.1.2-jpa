package com.couse.projetoSpring.repositories;

import com.couse.projetoSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{}
