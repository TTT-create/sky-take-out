package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("分类相关接口")
@Slf4j
@RestController
@RequestMapping("/admin/category")
public class CategoryController {

    public Result save(){
        return null;
    }

}
