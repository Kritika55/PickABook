package com.example.pick_a_book_indi.repo;

import com.example.pick_a_book_indi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String name);
}
