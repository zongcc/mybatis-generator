/*
 * 
 * Created by sohu.com on 2016-01-16
 * 
 */
package com.hydq.oa.dao;

import com.hydq.oa.entity.PermissionRole;
import com.hydq.oa.entity.PermissionRoleKey;

public interface PermissionRoleMapper {
    int deleteByPrimaryKey(PermissionRoleKey key);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    PermissionRole selectByPrimaryKey(PermissionRoleKey key);

    int updateByPrimaryKeySelective(PermissionRole record);

    int updateByPrimaryKey(PermissionRole record);
}