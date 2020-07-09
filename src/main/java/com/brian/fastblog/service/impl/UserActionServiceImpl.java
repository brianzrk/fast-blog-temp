package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.UserAction;
import com.brian.fastblog.mapper.UserActionMapper;
import com.brian.fastblog.service.UserActionService;
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
public class UserActionServiceImpl extends ServiceImpl<UserActionMapper, UserAction> implements UserActionService {

}
