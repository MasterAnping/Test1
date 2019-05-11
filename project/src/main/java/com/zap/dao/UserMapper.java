package com.zap.dao;

import com.zap.entity.User;

public interface UserMapper {
    int deleteByUserId(Integer userId);

    int insert(User user);

    int insertSelective(User user);

    User selectByUserId(Integer userId);
    
    User selectByUsername(String username);

    int updateByUserIdSelective(User user);

    int updateByUserId(User user);
}