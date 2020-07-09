package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.Post;
import com.brian.fastblog.mapper.PostMapper;
import com.brian.fastblog.service.PostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
