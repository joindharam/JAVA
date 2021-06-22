package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p1;


    public Login() {

        /*This is used to perform login operations */
        super("Medical Store System-MSS");
        setLayout(null);
        //setContentPane().setBackgroundColor(gray);
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("com/img/add.png"));
        Image img = icon.getImage();
        setIconImage(img);

        l1 = new JLabel("Login_Id");
        l1.setFont(new Font("monospaced", Font.BOLD, 15));
        l1.setForeground(Color.BLACK);
        l1.setBounds(50, 110, 90, 20);
        add(l1);

        l2 = new JLabel("Password");
        l2.setFont(new Font("monospaced", Font.BOLD, 15));
        l2.setForeground(Color.BLACK);
        l2.setBounds(50, 140, 90, 20);
        add(l2);
        p1 = new JPasswordField();
        p1.setFont(new Font("monospaced", Font.BOLD, 15));
        p1.setForeground(Color.BLACK);
        p1.setBackground(Color.GREEN);
        p1.setBounds(160, 140, 90, 20);
        add(p1);

        t1 = new JTextField();
        t1.setFont(new Font("monospaced", Font.BOLD, 15));
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.GREEN);
        t1.setBounds(160, 110, 90, 20);
        add(t1);

        /* button used for Submit the information */

        b1 = new JButton("Submit");
        b1.setFont(new Font("monospaced", Font.BOLD, 15));
        b1.setForeground(Color.BLACK);
        b1.setBounds(80, 200, 90, 20);
        add(b1);
        b1.addActionListener(this);

        /* button used for clear the information */
        b2 = new JButton("Clear");
        b2.setFont(new Font("monospaced", Font.BOLD, 15));
        b2.setForeground(Color.BLACK);
        b2.setBounds(200, 200, 90, 20);
        add(b2);
        b2.addActionListener(this);

        setLocation(500, 100);
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent al) {

        dbcon c = new dbcon();
        String tn = t1.getText().trim();
        String tp = p1.getText().trim();
        System.out.println(tn + " " + tp);

        if (al.getSource() == b1) {
            try {
                String r = "select * from emp where USERNAME='" + tn + "'and PASSWORD= '" + tp + "'";
                ResultSet rs = c.s.executeQuery(r);
                if (rs.next()) {
                    new Project(tn).setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "login with valid username and password");

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if  (al.getSource() == b2) {
            t1.setText("");
            p1.setText("");


        }
    }


    public static void main(String[] args) {
        new Login();

    }


}
