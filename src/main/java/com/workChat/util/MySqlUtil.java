package com.workChat.util;

;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public class MySqlUtil {
    //数据库连接参数
    //数据库地址
    private static final String URL = "jdbc:mysql://mysql.lldwb.top:33366/workchatsql?serverTimezone=Asia/Shanghai";
    //账号
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "@dwb123456";

    //加载驱动，导入数据到数据库连接对象
    private static Connection conn;
    {
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //导入数据到数据库连接对象
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("异常" + e.getMessage());
        }
    }

    //关闭数据库连接
    private static void close(PreparedStatement pstm){
        try {
            if(pstm != null){
                pstm.close();//关闭预编译对象
            }
            if (conn != null){
                conn.close();//关闭结果集对象
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private static void close(ResultSet rs,PreparedStatement pstm){
        try {
            if (rs != null){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close(pstm);
    }

    //通用的增删改数据，传入SQL语句，可变参数
    public static int update(String sql,Object... objs){
        try {
            //传入SQL语句
            PreparedStatement pstm = conn.prepareStatement(sql);
            //数据参数索引
            int i = 1;
            //传入可变参数
            for (Object obj:objs){
                pstm.setObject(i++,obj);
            }
            //执行并返回影响的行数
            int count = pstm.executeUpdate();
            close(pstm);
            //返回影响的行数
            return count;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return 0;
        }
    }

    //查询注意 记得关闭到ResultSet
	public static ResultSet queryResultSet(String sql,Object...agrs) {
		ResultSet rs =null;
		try {
			//创建预编译语句
			PreparedStatement pstm = conn.prepareStatement(sql);
			//添加参数
			if (agrs!=null) {
				 for(int i=1;i<=agrs.length;i++) {
                     pstm.setObject(i, agrs[i-1]);
					}
			}
			 rs = pstm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	//通用的查询 返回 List<实体类> 集合
	public static <T> List<T> queryList(Class<T> class1,String sql,Object...args) {
		List<T> list = new ArrayList<T>();
		PreparedStatement pstm =null;
		ResultSet rs =null;
		try {
            pstm = conn.prepareStatement(sql);
			//设置参数
			if (args!=null) {
				for (int i = 1; i <= args.length; i++) {
                    pstm.setObject(i, args[i-1]);
				}
			}
			//查询
			rs =  pstm.executeQuery();
			//获取元数据
			ResultSetMetaData metaData =  rs.getMetaData();
			//拿到有多少列
			int count = metaData.getColumnCount();
			while(rs.next()) {
				T t = class1.newInstance();
				for (int i = 1; i <=count; i++) {
					//getColumnLabel(i) 拿到别名  没有别名就是列名
					Field field = class1.getDeclaredField(metaData.getColumnLabel(i));
					field.setAccessible(true);
					field.set(t, rs.getObject(i));
				}
				list.add(t);
			}
		} catch (InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException
				| IllegalArgumentException | SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs,pstm);
		}
		return list;
	}
}