package com.workChat.service;

import com.workChat.entity.User;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public interface WorkChat {
    //根据id返回用户
    public User getIdUser(int id);
    //根据单位编号返回用户集合
    public List<User> getUnitIdUser(int UnitId);
}
