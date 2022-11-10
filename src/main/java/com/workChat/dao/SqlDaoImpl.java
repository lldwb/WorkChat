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
        //读取id作为发送方和接收方的信息
        return mySqlUtil.queryList(Chat.class,"select * from chat where userId=? or receiveId=?", userId,userId);
    }

    @Override
    public List<Chat> GetUserIdReceiveIdChat(int userId, int receiveId) {
        return mySqlUtil.queryList(Chat.class,"select * from chat where (userId=? and receiveId=?) or (receiveId=? and userId=?)", userId,receiveId,userId,receiveId);
    }

    @Override
    public Unit getIdUnit(int id) {
        ResultSet rs = mySqlUtil.queryResultSet("select * from user where id=?",id);
        Unit unit = new Unit();
        try {
            if(rs.next()){
                unit.setId(rs.getInt("id"));
                unit.setName(rs.getString("name"));
                unit.setUserId(rs.getInt("userId"));
                unit.setRemark(rs.getString("remark"));
                rs.close();
            }
            return unit;
        } catch (SQLException e) {
            return null;

        }
    }
}