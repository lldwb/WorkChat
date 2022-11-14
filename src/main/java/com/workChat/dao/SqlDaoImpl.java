package com.workChat.dao;

import com.workChat.entity.*;
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
    public int addUser(String name, String pwd, int unitId) {
        return mySqlUtil.update("insert into user(name,pwd,unitId) values(?,?,?)",name,pwd,unitId);
    }

    @Override
    public int updateUser(int id,String name, String pwd) {
        return mySqlUtil.update("update UpdateUser sel name=?, pwd=? where id=?",name,pwd,id);
    }

    @Override
    public int deleteIdUser(int id) {
        return mySqlUtil.update("delete from user where id=?", id);
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return mySqlUtil.queryList(GroupChat.class,"select * from groupChat where unitId=?", unitId);
    }

    @Override
    public int addWorkCircle(String title, int userId, String content) {
        return mySqlUtil.update("insert into WorkCircle(title,userId,content) values(?,?,?)",title,userId,content);
    }

    @Override
    public int updateWorkCircle(int id,String title, String content) {
        return mySqlUtil.update("update workCircle set title=?, content=? where id=?",title,content,id);
    }

    @Override
    public List<WorkCircle> getUnitIdWorkCircle(int unitId) {
        //a左表 workChat  b右表 user
        return mySqlUtil.queryList(WorkCircle.class,"select * from workCircle where unitId=?", unitId);
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
    public int addChat(int userId, int receiveId, String word) {
        return mySqlUtil.update("insert into Chat(userId,receiveId,word) values(?,?,?)",userId,receiveId,word);
    }

    @Override
    public List<Chat> getUserIdChat(int userId) {
        //读取id作为发送方和接收方的信息
        return mySqlUtil.queryList(Chat.class,"select * from chat where userId=? or receiveId=?", userId,userId);
    }

    @Override
    public List<Chat> getUserIdReceiveIdChat(int userId, int receiveId) {
        return mySqlUtil.queryList(Chat.class,"select * from chat where (userId=? and receiveId=?) or (receiveId=? and userId=?)", userId,receiveId,userId,receiveId);
    }

    @Override
    public int addUnit(String name, int userId, String remark) {
        return mySqlUtil.update("insert into Unit(name,userId,remark) values(?,?,?)",name,userId,remark);
    }

    @Override
    public Unit getIdUnit(int id) {
        ResultSet rs = mySqlUtil.queryResultSet("select * from Unit where id=?",id);
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

    @Override
    public int addGroupChat(int userId, int unitId, String word) {
        return mySqlUtil.update("insert into GroupChat(userId,unitId,word) values(?,?,?)",userId,unitId,word);
    }
}