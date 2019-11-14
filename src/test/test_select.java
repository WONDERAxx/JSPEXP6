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
            //定义sql
            String sql = "select * from employee";
            //获取执行sql的对象
            stmt = conn.createStatement();
            //执行sql
            rs = stmt.executeQuery(sql);
            //遍历结果集，封装对象，装载集合
            employee emp = null;
            list = new ArrayList<employee>();
            while(rs.next()){
                //获取数据
                int id = rs.getInt("EMP_ID");
                String name = rs.getString("EMP_NAME"); 
                String job = rs.getString("JOB"); 
                double salary = rs.getDouble("SALARY");
                int dept = rs.getInt("DEPT");
                // 创建emp对象,并赋值
               emp = new employee();
                emp.setId(id);
                emp.setName(name);
                emp.setJob(job);
                emp.setSalary(salary);
                emp.setDept(dept);
                //装载集合
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
