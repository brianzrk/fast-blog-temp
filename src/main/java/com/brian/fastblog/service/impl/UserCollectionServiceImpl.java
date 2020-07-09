package com.brian.fastblog.service.impl;

import com.brian.fastblog.entity.UserCollection;
import com.brian.fastblog.mapper.UserCollectionMapper;
import com.brian.fastblog.service.UserCollectionService;
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
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

}
