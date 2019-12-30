package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.exception.DbException;
import com.miao.ashop.goods.common.dto.BrandDTO;
import com.miao.ashop.goods.common.qto.BrandQTO;
import com.miao.ashop.goods.dao.BrandMapper;
import com.miao.ashop.goods.domain.Brand;
import com.miao.ashop.goods.service.BrandService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandMapper brandMapper;

    @Override
    public long addBrand(BrandDTO brandDTO) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDTO, brand);
        return brandMapper.saveBrand(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        int ret = brandMapper.deleteBrand(id);
        if (0==ret){
            throw new DbException.DbNotExistException("brandId="+ id);
        }

        return ret;
    }

    @Override
    public int updateBrand(BrandDTO brandDTO) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDTO, brand);
        int ret = brandMapper.updateBrand(brand);
        if (null==brand){
            throw new DbException.DbNotExistException("brandId="+ brandDTO.getId());
        }
        return ret;
    }

    @Override
    public BrandDTO getBrand(Long id) {
        BrandDTO brandDTO = BrandDTO.builder().build();
        Brand brand = brandMapper.getById(id);
        if (null==brand){
            throw new DbException.DbNotExistException("brandId="+ id);
        }
        BeanUtils.copyProperties(brand, brandDTO);

        return brandDTO;
    }

    @Override
    public List<BrandDTO> listBrand(BrandQTO brandQTO) {
        List<BrandDTO> brandDTOList = new ArrayList<>();
        List<Brand> brandList = brandMapper.listBrand(brandQTO);
        if (null!=brandList && brandList.size()>0){
            for (Brand brand : brandList) {
                BrandDTO brandDTO = BrandDTO.builder().build();
                BeanUtils.copyProperties(brand, brandDTO);
                brandDTOList.add(brandDTO);
            }
        }

        return brandDTOList;
    }

    @Override
    public long countBrand(BrandQTO brandQTO) {
        return brandMapper.countBrand(brandQTO);
    }
}
