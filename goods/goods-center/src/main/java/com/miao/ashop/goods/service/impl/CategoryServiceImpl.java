package com.miao.ashop.goods.service.impl;

import com.miao.ashop.goods.common.dto.CategoryDTO;
import com.miao.ashop.goods.common.qto.CategoryQTO;
import com.miao.ashop.goods.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public long addCategory(CategoryDTO categoryDTO) {
        return 0;
    }

    @Override
    public int deleteCategory(Long id) {
        return 0;
    }

    @Override
    public int updateCategory(CategoryDTO categoryDTO) {
        return 0;
    }

    @Override
    public CategoryDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CategoryDTO> listCategory(CategoryQTO categoryQTO) {
        return null;
    }

    @Override
    public long countCategory(CategoryQTO categoryQTO) {
        return 0;
    }
}
