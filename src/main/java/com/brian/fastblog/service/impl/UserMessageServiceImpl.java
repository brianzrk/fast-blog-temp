package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.UserMessage;
import com.brian.fastblog.mapper.UserMessageMapper;
import com.brian.fastblog.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
