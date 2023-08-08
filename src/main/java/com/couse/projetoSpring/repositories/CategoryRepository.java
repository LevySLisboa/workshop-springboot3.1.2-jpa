package com.couse.projetoSpring.repositories;

import com.couse.projetoSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long>{}
