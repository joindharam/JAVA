package com;

import java.sql.*;


public class dbcon {


    Connection c;
    Statement s;

    dbcon() {
        try {
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jadmin", "India123");
            s = c.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new dbcon();
    }
}