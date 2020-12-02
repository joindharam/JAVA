package com.dharam;

import oracle.jdbc.OracleCallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class fcparameter {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the radius");
        int r;
        r = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "hr", "India123");
            CallableStatement cst = con.prepareCall("{ ? = call fcparameter(?)}");
            cst.setInt(2,r);
            cst.registerOutParameter(1, Types.FLOAT);
            cst.execute();
            System.out.println( "parameter of circle"+cst.getFloat(1));
        }catch (Exception e){}

    }
}
