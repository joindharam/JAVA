package com.dharam;

import java.sql.*;

import java.util.Collection;
import java.util.Scanner;

public class StoredProc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp ID : ");
        int eid = sc.nextInt();
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","India123");
            CallableStatement cst = connection.prepareCall("{ call idinc(?,?) }");
            cst.setInt(1,eid);
            cst.registerOutParameter(2, Types.INTEGER);

            cst.execute();
            System.out.println("For Emp ID : "+eid+" Salary Is : "+cst.getInt(2));

        }catch (Exception e){}
    }
}
