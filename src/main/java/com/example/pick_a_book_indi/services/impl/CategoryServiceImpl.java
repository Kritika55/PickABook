package com.example.pick_a_book_indi.services.impl;
import com.example.pick_a_book_indi.entity.Category;
import com.example.pick_a_book_indi.repo.CategoryRepository;
import com.example.pick_a_book_indi.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
