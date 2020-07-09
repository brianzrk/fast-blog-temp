package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.Comment;
import com.brian.fastblog.mapper.CommentMapper;
import com.brian.fastblog.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
