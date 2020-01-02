package com.miao.ashop.goods.rest;

import com.miao.ashop.common.http.TableRet;
import com.miao.ashop.goods.common.dto.BrandDTO;
import com.miao.ashop.goods.common.qto.BrandQTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("brand")
@RestController
public class BrandController {

    @PostMapping
    public void addBrand(){

    }

    @DeleteMapping("{id}")
    public void deleteBrand(@PathVariable Long id){

    }

    @PatchMapping
    public void updateBrand(@RequestBody BrandDTO brandDTO){

    }

    @GetMapping("{id}")
    public BrandDTO getBrand(@PathVariable Long id){

        return null;
    }

    @GetMapping("page")
    public TableRet<BrandDTO> pageListBrand(@RequestBody BrandQTO brandQTO){

        return null;
    }

    @GetMapping("list")
    public List<BrandDTO> listBrand(@RequestBody BrandQTO brandQTO){

        return null;
    }

}
