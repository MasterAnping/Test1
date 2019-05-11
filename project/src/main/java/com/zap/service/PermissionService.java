package com.zap.service;

import java.util.Set;

import com.zap.entity.Permission;

public interface PermissionService {
	
		
	Set<Permission> queryAllPermissions();
	
	Set<Permission> queryPermissionsByRoleIds(int[] roleIds);

	Set<Permission> queryPermissionsByRoleId(int roleId);


}
