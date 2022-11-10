package com.workChat.service;

import com.workChat.dao.SqlDao;
import com.workChat.dao.SqlDaoImpl;
import com.workChat.entity.Chat;
import com.workChat.entity.GroupChat;
import com.workChat.entity.Unit;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public class WorkChatImpl implements WorkChat{
    SqlDao sqlDao = new SqlDaoImpl();
    @Override
    public int addUnitIdUser(String name,String pwd,int unitId) {
        return sqlDao.addUnitIdUser(name,pwd,unitId);
    }

    @Override
    public User getIdUser(int id) {
        return sqlDao.getIdUser(id);
    }

    @Override
    public List<User> getUnitIdUser(int unitId) {
        return sqlDao.getUnitIdUser(unitId);
    }

    @Override
    public List<Chat> getUserIdChat(int userId) {
        return sqlDao.getUserIdChat(userId);
    }

    @Override
    public List<Chat> getUserIdReceiveIdChat(int userId, int receiveId) {
        return sqlDao.getUserIdReceiveIdChat(userId,receiveId);
    }

    @Override
    public Unit getIdUnit(int id) {
        return sqlDao.getIdUnit(id);
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return sqlDao.getUnitIdGroupChat(unitId);
    }
}