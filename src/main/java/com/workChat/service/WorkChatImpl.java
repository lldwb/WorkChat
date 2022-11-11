package com.workChat.service;

import com.workChat.dao.SqlDao;
import com.workChat.dao.SqlDaoImpl;
import com.workChat.entity.*;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public class WorkChatImpl implements WorkChat{
    SqlDao sqlDao = new SqlDaoImpl();
    @Override
    public int addUser(String name, String pwd, int unitId) {
        return sqlDao.addUser(name,pwd,unitId);
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
    public int addChat(int userId, int receiveId, String word) {
        return sqlDao.addChat(userId,receiveId,word);
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
    public int addUnit(String name, int userId, String remark) {
        return sqlDao.addUnit(name,userId,remark);
    }
    @Override
    public Unit getIdUnit(int id) {
        return sqlDao.getIdUnit(id);
    }
    @Override
    public int addGroupChat(int userId, int unitId, String word) {
        return sqlDao.addGroupChat(userId,unitId,word);
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return sqlDao.getUnitIdGroupChat(unitId);
    }

    @Override
    public int addWorkCircle(String title, int userId, String content) {
        return sqlDao.addWorkCircle(title,userId,content);
    }

    @Override
    public List<WorkCircle> getUnitIdWorkCircle(int unitId) {
        return sqlDao.getUnitIdWorkCircle(unitId);
    }
}