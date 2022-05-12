package org.example.crm;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestingConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String user = "springstudent";
        String password = "springstudent";

        try {
            System.out.println("Connecting to a database: " + jdbcUrl);

            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            System.out.println("Connection successful");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
