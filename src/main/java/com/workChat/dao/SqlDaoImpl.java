package com.workChat.dao;

import com.workChat.entity.Chat;
import com.workChat.entity.GroupChat;
import com.workChat.entity.Unit;
import com.workChat.entity.User;
import com.workChat.util.MySqlUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SqlDaoImpl implements SqlDao {
    MySqlUtil mySqlUtil = new MySqlUtil();
    @Override
    public int addUnitIdUser(String name,String pwd,int unitId) {
        return mySqlUtil.update("insert into user(name,pwd,unitId) values(?,?,?)",name,pwd,unitId);
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return mySqlUtil.queryList(GroupChat.class,"select * from groupChat where id=?", unitId);
    }

    @Override
    public User getIdUser(int id) {
        try {
            ResultSet rs = mySqlUtil.queryResultSet("select * from user where id=?", id);
            User user = new User();
            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPwd(rs.getString("pwd"));
                user.setUnitId(rs.getInt("unitId"));
                user.setRemark(rs.getString("remark"));
                rs.close();
            }
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> getUnitIdUser(int unitId) {
        return mySqlUtil.queryList(User.class,"select * from user where id=?", unitId);
    }

    @Override
    public List<Chat> getUserIdChat(int userId) {
        return null;
    }

    @Override
    public Unit getIdUnit(int id) {
        return null;
    }
}