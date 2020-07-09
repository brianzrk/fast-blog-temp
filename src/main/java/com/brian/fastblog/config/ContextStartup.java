package com.brian.fastblog.config;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brian.fastblog.entity.Category;
import com.brian.fastblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * @author brian
 * @date 2020/6/24
 */
@Component
public class ContextStartup implements ApplicationRunner, ServletContextAware {

    @Autowired
    CategoryService categoryService;

    ServletContext servletContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Category> categories    = categoryService.list(new QueryWrapper<Category>()
                .eq("status", "0"));

        servletContext.setAttribute("categories", categories);

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}