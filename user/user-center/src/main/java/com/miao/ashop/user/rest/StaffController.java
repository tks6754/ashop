package com.miao.ashop.user.rest;


import com.miao.ashop.common.http.GlobalResponse;
import com.miao.ashop.user.common.dto.StaffDTO;
import com.miao.ashop.user.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("staff")
@RestController
public class StaffController {

    @Autowired
    StaffService staffService;

    @PostMapping
    public GlobalResponse addStaff(@RequestBody StaffDTO staffDTO){
        staffService.addStaff(staffDTO);
        return GlobalResponse.success();
    }



}
