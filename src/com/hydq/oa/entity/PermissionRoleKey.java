/*
 * 
 * Created by sohu.com on 2016-01-16
 * 
 */
package com.hydq.oa.entity;

public class PermissionRoleKey {
    /**
     * 权限ID
     */
    private Integer permissionId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 获取 权限ID
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 设置 权限ID
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}