package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JDBCUtils.jdbcutils;
import JavaBean.employee;

public class test_delete {
	
	public void test_delete() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
            conn = jdbcutils.getConnection();
            //����sql
            String sql = "delete from employee where EMP_id = ��";
            //��ȡִ��sql�Ķ���
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,2);
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