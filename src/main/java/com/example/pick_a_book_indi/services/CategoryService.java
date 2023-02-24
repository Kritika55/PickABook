package com.example.pick_a_book_indi.services;


import com.example.pick_a_book_indi.entity.Category;

import java.util.List;

public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
