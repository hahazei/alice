package com.xw.alice.provider.impl;

import com.xw.alice.model.User;
import com.xw.alice.mapper.UserMapper;
import com.xw.alice.provider.UserProvider;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuwei
 * @since 2018-09-12
 */
@Service
public class UserProviderImpl extends ServiceImpl<UserMapper, User> implements UserProvider {

}
