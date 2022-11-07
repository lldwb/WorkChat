package com.workChat.service;

import com.workChat.dao.SqlDao;
import com.workChat.dao.SqlDaoImpl;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class WorkChatImpl implements WorkChat{
    @Override
    public User getIdUser(int id) {
        SqlDao sqlDao = new SqlDaoImpl();
        return sqlDao.getIdUser(id);
    }

    @Override
    public List<User> getUnitIdUser(int UnitId) {
        return null;
    }
}
