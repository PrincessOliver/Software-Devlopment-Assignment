package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentsList {

    public Connection databaseLink;

    public Connection getDBConnection() {
        String url = "jdbc:sqlite:C:/sqlite/mydatabase.db";

        try{
            databaseLink = DriverManager.getConnection(url);
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
