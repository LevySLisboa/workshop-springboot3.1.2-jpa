package com.couse.projetoSpring.repositories;

import com.couse.projetoSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{}
