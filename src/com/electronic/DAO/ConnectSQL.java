package com.electronic.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSQL {

	public static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=OnlineElectronic;";
    public static String USER_NAME = "sa";
    public static String PASSWORD = "123";
    public static Connection getConnection() {
    	Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        System.out.println(conn);
        return conn;
        
    }
    }