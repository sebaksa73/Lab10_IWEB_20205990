package com.pucp.lab10_20205990.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDao {

    public Connection getConnection() throws SQLException {
        try {
           Class.forName("com.mysql.ej.jdbc.Driver");
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }

        String user = "root";
        String pass = "12345678";
        String url = "jdbc:mysql://localhost:3306/hr?serverTimezone=America/Lima";

        return DriverManager.getConnection(url,user,pass);
    }
}
