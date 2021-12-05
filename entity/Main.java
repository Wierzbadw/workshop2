package pl.coderslab.entity;

import pl.coderslab.mysql.javamysql.DBUtil;
import java.sql.Connection;
import java.sql.SQLException;



public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // load and register JDBC driver for MySQL
      //  Class.forName("com.mysql.jdbc.Driver");

        try(Connection connection = DBUtil.connect()){
            String select =  "SELECT * FROM users where id = 1";
            DBUtil.printData(connection,select,"username","email","password");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

