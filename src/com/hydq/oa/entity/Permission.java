/*
 * 
 * Created by sohu.com on 2016-01-16
 * 
 */
package com.hydq.oa.entity;

import java.util.Date;

public class Permission {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 关键字
     */
    private String key;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否可见
     */
    private Integer isVisible;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 获取 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 关键字
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置 关键字
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

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