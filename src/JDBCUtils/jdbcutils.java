package JDBCUtils;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class jdbcutils {
	private static String url;
    private static String user;
    private static String password;
    private static String driver;
  /* static{
        //��ȡ��Դ�ļ�����ȡֵ��

        try {
            //1. ����Properties�����ࡣ
            Properties pro = new Properties();
            
            //��ȡsrc·���µ��ļ��ķ�ʽ--->ClassLoader �������
            ClassLoader classLoader = jdbcutils.class.getClassLoader();
            
            URL res  = classLoader.getResource("jdbc.properties");
            
            String path = res.getPath();
            
           // System.out.println(path);///D:/IdeaProjects/itcast/out/production/day04_jdbc/jdbc.properties
            //2. �����ļ�
           // pro.load(new FileReader("D:\\IdeaProjects\\itcast\\day04_jdbc\\src\\jdbc.properties"));
            pro.load(new FileReader(path));

            //3. ��ȡ���ݣ���ֵ
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //4. ע������
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/
    public static Connection getConnection() throws Exception {

    	Properties pro = new Properties();
        InputStream is = jdbcutils.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //��ȡ���ӳض���
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //��ȡ����
        Connection conn = ds.getConnection();
		return conn;
		//return DriverManager.getConnection(url, user, password);
    	
    }
    public static void close(Statement stmt,Connection conn){
        if( stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if( conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * �ͷ���Դ
     * @param stmt
     * @param conn
     */
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if( rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if( stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if( conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
