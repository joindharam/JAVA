package com.dharam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {
    public static void main(String[] args) throws IOException {
        String fname , lname;

//        Scanner sc = new Scanner(System.in);

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Fisrt Name :");
        fname = sc.readLine();
        System.out.print("Enter Last Name :");
        lname = sc.readLine();

        System.out.println("Your Full Name : "+fname+" "+lname);
        long l = 10;

    }
}
