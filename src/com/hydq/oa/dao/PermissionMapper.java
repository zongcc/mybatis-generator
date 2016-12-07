/*
 * 
 * Created by sohu.com on 2016-01-16
 * 
 */
package com.hydq.oa.dao;

import com.hydq.oa.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}