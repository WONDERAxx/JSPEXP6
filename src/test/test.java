package test;

import JDBCUtils.jdbcutils;
import JavaBean.employee;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//��ѯ
		System.out.println("��ѯ��");
		 test_select select = new test_select();
		 select.test_select();
		 //����
		System.out.println("��������INSERT INTO `employee` VALUES ('10', '��С��', 'clerk', '4300.00', '10')");
		 test_insert insert = new test_insert();
		 insert.test_insert();
		//ɾ��
		 System.out.println("ɾ������delete from employee where EMP_id = 2");
		 test_delete delete = new test_delete();
		 delete.test_delete();
		//�޸�
		 System.out.println("�޸�����update employee  set salary=10000 where EMP_id = 1");
		 test_update update = new test_update();
		 update.test_update();
	}
}
