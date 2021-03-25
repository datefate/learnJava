package JDBC;

import java.sql.*;

/**
 * @author datefate
 * @site create 2021-03-04-下午5:12
 *
 * DRIVER
 *
 */
public class test {
    static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306";

    static final String user = "dlh";

    static final String pass = "Dlh@996007";


    public static void main(String[] args) {
        Connection connection =null;
        Statement statement = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,user,pass);

            statement =connection.createStatement();
            statement.execute("USE Personal;");
            String sql;
            sql ="SELECT * FROM web";
//            resultSet 保持与数据库的连接，获得指针
//            resultSet 没有拿到任何数据，数据依旧存储在Mysql里面

            ResultSet resultSet =statement.executeQuery(sql);


            while (resultSet.next()){

                String s= resultSet.getString("url");
                System.out.println(s);

            }

            connection.close();
            statement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




    }
}
