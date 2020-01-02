package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.exception.DbException;
import com.miao.ashop.goods.common.dto.CategoryDTO;
import com.miao.ashop.goods.common.qto.CategoryQTO;
import com.miao.ashop.goods.dao.CategoryMapper;
import com.miao.ashop.goods.domain.Category;
import com.miao.ashop.goods.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public long addCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO, category);
        return categoryMapper.saveCategory(category);
    }

    @Override
    public int deleteCategory(Long id) {
        int ret = categoryMapper.deleteCategory(id);
        if (0==ret){
            throw new DbException.DbNotExistException("删除类目不存在，category.id="+ id);
        }
        return ret;
    }

    @Override
    public int updateCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDTO, category);
        int ret = categoryMapper.updateCategory(category);
        if (0==ret){
            throw new DbException.DbNotExistException("删除类目不存在，category.id="+ categoryDTO.getId());
        }
        return ret;
    }

    @Override
    public CategoryDTO getById(Long id) {
        CategoryDTO categoryDTO = new CategoryDTO();

        Category category = categoryMapper.getById(id);
        if (null == category){
            throw new DbException.DbNotExistException("删除类目不存在，category.id="+ id);
        }

        BeanUtils.copyProperties(category, categoryDTO);
        return categoryDTO;
    }

    @Override
    public List<CategoryDTO> listCategory(CategoryQTO categoryQTO) {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();

        List<Category> categoryList = categoryMapper.listCategory(categoryQTO);
        if (null!=categoryList && categoryList.size()>0){
            for (Category category : categoryList) {
                CategoryDTO categoryDTO = new CategoryDTO();
                BeanUtils.copyProperties(category, categoryDTO);
                categoryDTOList.add(categoryDTO);
            }
        }

        return categoryDTOList;
    }

    @Override
    public long countCategory(CategoryQTO categoryQTO) {
        return categoryMapper.countCategory(categoryQTO);
    }
}
