package com.workChat.service;

import com.workChat.entity.Chat;
import com.workChat.entity.GroupChat;
import com.workChat.entity.Unit;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public interface WorkChat {
    //创建员工账号
    int addUser(String name, String pwd, int unitId);
    //根据id返回用户
    User getIdUser(int id);
    //根据单位编号返回用户集合
    List<User> getUnitIdUser(int unitId);

    //通过用户id返回Chat集合
    List<Chat> getUserIdChat(int userId);
    //通过发送id和接收id返回Chat集合
    List<Chat> getUserIdReceiveIdChat(int userId, int receiveId);

    //创建单位 陈强
    int addUnit(int id);
    //通过Id返回单位 陈强
    Unit getIdUnit(int id);

    //通过单位编号返回GroupChat集合
    List<GroupChat> getUnitIdGroupChat(int unitId);

    //通过单位编号返回WorkCircle集合
    List<WorkChat> getUnitIdWorkCircle(int unitId);
}
