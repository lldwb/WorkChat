package com.workChat.dao;

import com.workChat.entity.*;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public interface SqlDao {
    //创建员工账号
    int addUser(String name, String pwd, int unitId);
    //修改员工账号 陈强
    int updateUser(int id,String name, String pwd);
    //删除员工账号
    int deleteIdUser(int id);
    //根据id返回用户
    User getIdUser(int id);
    //根据单位编号返回用户集合 黄为东
    List<User> getUnitIdUser(int unitId);

    //创建聊天 陈强
    int addChat(int userId, int receiveId, String word);
    //通过用户id返回Chat集合
    List<Chat> getUserIdChat(int userId);
    //通过发送id和接收id返回Chat集合
    List<Chat> getUserIdReceiveIdChat(int userId, int receiveId);

    //创建单位 陈强
    int addUnit(String name, int userId, String remark);
    //通过Id返回单位 陈强
    Unit getIdUnit(int id);

    //创建群聊 陈强
    int addGroupChat(int userId,int unitId,String word);
    //通过单位编号返回GroupChat集合
    List<GroupChat> getUnitIdGroupChat(int unitId);

    //创建工作圈 陈强
    int addWorkCircle(String title,int userId,String content);
    //修改工作圈
    int updateWorkCircle(int id,String title,String content);
    //通过单位编号返回WorkCircle集合
    List<WorkCircle> getUnitIdWorkCircle(int unitId);
}
