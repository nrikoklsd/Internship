package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBWorker {
    private final String URL = "jdbc:mysql://localhost:3306/mydb";
    private final String USERNAME = "root";
    private final String PASSWORD = "11111111";

    private Connection connection;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    public Connection getConnection() {
        return connection;
    }
}
