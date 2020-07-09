package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.User;
import com.brian.fastblog.mapper.UserMapper;
import com.brian.fastblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
