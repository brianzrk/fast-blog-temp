package com.brian.fastblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brian.fastblog.entity.Category;
import com.brian.fastblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author brian
 * @date 2020/6/24
 */
@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping({"", "/", "/index"})
    public String index(HttpServletRequest request) {


        return "index";
    }


}