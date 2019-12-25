package com.miao.ashop.user.rest;

import com.miao.ashop.user.common.dto.StaffDTO;
import com.miao.ashop.user.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("员工模块")
@RequestMapping("staff")
@RestController
public class StaffController {

    @Autowired
    StaffService staffService;

    @ApiOperation("添加员工")
    @PostMapping
    public void addStaff(@RequestBody StaffDTO staffDTO){
        staffService.addStaff(staffDTO);
    }

    @ApiOperation("删除员工")
    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable("id") Long id){
        staffService.deleteStaff(id);
    }

    @ApiOperation("更新员工信息")
    @PatchMapping
    public void updateStaff(@RequestBody StaffDTO staffDTO){
        staffService.updateStaff(staffDTO);
    }

    @ApiOperation("获取指定员工")
    @GetMapping("/{id}")
    public StaffDTO getStaff(@PathVariable Long id){
        return staffService.getStaff(id);
    }

}
