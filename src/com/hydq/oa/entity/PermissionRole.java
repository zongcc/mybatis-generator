/*
 * 
 * Created by sohu.com on 2016-01-16
 * 
 */
package com.hydq.oa.entity;

import java.util.Date;

public class PermissionRole extends PermissionRoleKey {
    /**
     * 是否可见
     */
    private Integer isVisible;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 获取 是否可见
     */
    public Integer getIsVisible() {
        return isVisible;
    }

    /**
     * 设置 是否可见
     */
    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * 获取 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}