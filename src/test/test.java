package test;

import JDBCUtils.jdbcutils;
import JavaBean.employee;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//查询
		System.out.println("查询表");
		 test_select select = new test_select();
		 select.test_select();
		 //插入
		System.out.println("插入数据INSERT INTO `employee` VALUES ('10', '李小春', 'clerk', '4300.00', '10')");
		 test_insert insert = new test_insert();
		 insert.test_insert();
		//删除
		 System.out.println("删除数据delete from employee where EMP_id = 2");
		 test_delete delete = new test_delete();
		 delete.test_delete();
		//修改
		 System.out.println("修改数据update employee  set salary=10000 where EMP_id = 1");
		 test_update update = new test_update();
		 update.test_update();
	}
}
