package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JDBCUtils.jdbcutils;
import JavaBean.employee;

public class test_insert {
	public void test_insert() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
            conn = jdbcutils.getConnection();
            //����sql
            String sql = "INSERT INTO `employee` VALUES (?, ?, ?, ?, ?);";
            //��ȡִ��sql�Ķ���
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,10);
            stmt.setString(2,"��С��");
            stmt.setString(3,"clerk");
            stmt.setObject(4,"4300.00");
            stmt.setObject(5,"10");
            //ִ��sql
            stmt.executeUpdate(); 

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcutils.close(stmt,conn);
        }
		 test_select a = new test_select();
	      a.test_select();
	}
}
