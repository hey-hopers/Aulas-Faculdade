package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "admin";

    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/db_pessoas",
            usuario,
            senha);
            
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
