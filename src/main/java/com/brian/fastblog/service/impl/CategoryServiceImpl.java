package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.Category;
import com.brian.fastblog.mapper.CategoryMapper;
import com.brian.fastblog.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author brian
 * @since 2020-06-24
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
