package com.workChat.dao;

import com.workChat.entity.GroupChat;
import com.workChat.entity.User;
import com.workChat.util.MySqlUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SqlDaoImpl implements SqlDao {
    @Override
    public int addUnitIdUser(String name,String pwd,int unitId) {
        return MySqlUtil.update("insert into user(name,pwd,unitId) values(?,?,?)",name,pwd,unitId);
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {

        try {
            ResultSet rs = MySqlUtil.queryResultSet("select * from groupChat where id=?", unitId);
            List<GroupChat> groupChatList = new ArrayList<>();
            while (rs.next()){
                GroupChat groupChat = new GroupChat();
                groupChat.setId(rs.getInt("id"));
                groupChat.setUserId(rs.getInt("userId"));
                groupChat.setUnitId(rs.getInt("unitId"));
                groupChat.setTime(rs.getTimestamp("time"));
                groupChat.setWord(rs.getString("word"));
                groupChatList.add(groupChat);
            }
            return groupChatList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getIdUser(int id) {
        try {
            ResultSet rs = MySqlUtil.queryResultSet("select * from user where id=?", id);
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
        try {
            ResultSet rs = MySqlUtil.queryResultSet("select * from user where id=?", unitId);
            List<User> userList = new ArrayList<>();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPwd(rs.getString("pwd"));
                user.setUnitId(rs.getInt("unitId"));
                user.setRemark(rs.getString("remark"));
            }
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
