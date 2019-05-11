package com.zap.dao;

import java.util.Set;

import com.zap.entity.Role;

public interface RoleMapper {
    int deleteByRoleId(Integer roleId);

    int insert(Role role);

    int insertSelective(Role role);

    Role selectByRoleId(Integer roleId);

    int updateByRoleIdSelective(Role role);

    int updateByRoleId(Role role);

	Set<Role> selectAll();

	Set<Role> selectByUsername(String username);

	Set<Role> selectByUserId(Integer userId);

}