package com.workChat.dao;

import com.workChat.entity.GroupChat;
import com.workChat.entity.User;
import com.workChat.util.MySqlUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public class SqlDaoImpl implements SqlDao {
    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return null;
    }

    @Override
    public User getIdUser(int id) {
        try {
        MySqlUtil mySqlUtil = new MySqlUtil();
        ResultSet rs = mySqlUtil.queryResultSet("select * from user where id=?",id);
            User user = new User();
            if (rs.next()){
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
    public List<User> getUnitIdUser(int UnitId) {
        return null;
    }
}
