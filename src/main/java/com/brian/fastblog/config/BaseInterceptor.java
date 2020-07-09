package com.brian.fastblog.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brian.fastblog.entity.Category;
import com.brian.fastblog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author brian
 * @date 2020/6/25
 */
@Slf4j
@Component
public class BaseInterceptor implements HandlerInterceptor {

    @Autowired
    CategoryService categoryService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        List<Category> categories = categoryService.list(new QueryWrapper<Category>().eq("status", "0"));
        request.setAttribute("categories", categories);
        log.info("请求地址：{}", request.getServletPath());
        return true;
    }
}