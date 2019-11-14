package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBCUtils.jdbcutils;
import JavaBean.employee;

public class test_select {
	
	public void test_select() throws Exception{
		// TODO Auto-generated method stub
	 	Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<employee> list = null;
        try {
        	
            conn = jdbcutils.getConnection();
            //����sql
            String sql = "select * from employee";
            //��ȡִ��sql�Ķ���
            stmt = conn.createStatement();
            //ִ��sql
            rs = stmt.executeQuery(sql);
            //�������������װ����װ�ؼ���
            employee emp = null;
            list = new ArrayList<employee>();
            while(rs.next()){
                //��ȡ����
                int id = rs.getInt("EMP_ID");
                String name = rs.getString("EMP_NAME"); 
                String job = rs.getString("JOB"); 
                double salary = rs.getDouble("SALARY");
                int dept = rs.getInt("DEPT");
                // ����emp����,����ֵ
               emp = new employee();
                emp.setId(id);
                emp.setName(name);
                emp.setJob(job);
                emp.setSalary(salary);
                emp.setDept(dept);
                //װ�ؼ���
                list.add(emp);
                
               // System.out.println(id + "------" + name + "------" + job + "------" + salary + "------" + dept);
            }
            //System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
            	emp = list.get(i);
                System.out.println(emp.getId()+ "------"+emp.getName() + "------"+emp.getJob()+ "------"+emp.getSalary()+ "------"+ emp.getDept());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcutils.close(rs,stmt,conn);
        }
	}
}
