package com.dharam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class FuncCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1St : ");
        int a = sc.nextInt();
        System.out.print("Enter 2Nd  : ");
        int b = sc.nextInt();
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","India123");
            CallableStatement cst = connection.prepareCall("{ ? =call fsum(?,?) }");
            cst.setInt(2,a);
            cst.setInt(3,b);
            cst.registerOutParameter(1, Types.INTEGER);

            cst.execute();
            System.out.println("Addition Of  : "+a+" And  : "+b+" IS "+cst.getInt(1));

        }catch (Exception e){}
    }
}
