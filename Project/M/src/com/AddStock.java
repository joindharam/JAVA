package com;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStock extends JFrame implements ActionListener {

    JPanel p;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5;
    JRadioButton rb1, rb2, rb3, rb4;
    JButton b1, b2, b3;


    AddStock() {
        super("ADD Stock AT Medicine Store System");

        setLayout(null);

        p = new JPanel();
        p.setLayout(null);
        p.setBounds(10, 10, 600, 400);
        p.setBackground(Color.ORANGE);
        p.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "AddSTock", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
        p.setBackground(Color.ORANGE);

        add(p);

        l1 = new JLabel("Medicine_ID in Stock");
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        l1.setBounds(10, 50, 150, 20);
        p.add(l1);
        t1 = new JTextField();
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        t1.setBounds(200, 50, 150, 20);
        p.add(t1);



        l4 = new JLabel("Quantity");
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.WHITE);
        l4.setBounds(10, 90, 150, 20);
        p.add(l4);
        t3 = new JTextField();
        t3.setBackground(Color.BLACK);
        t3.setForeground(Color.WHITE);
        t3.setBounds(200, 90, 150, 20);
        p.add(t3);
        l5 = new JLabel("Item Price");
        l5.setBackground(Color.BLACK);
        l5.setForeground(Color.WHITE);
        l5.setBounds(10, 130, 150, 20);
        p.add(l5);
        t4 = new JTextField();
        t4.setBackground(Color.BLACK);
        t4.setForeground(Color.WHITE);
        t4.setBounds(200, 130, 150, 20);
        p.add(t4);
        l6 = new JLabel("Item Expiry date");
        l6.setBackground(Color.BLACK);
        l6.setForeground(Color.WHITE);
        l6.setBounds(10, 170, 150, 20);
        p.add(l6);
        t5 = new JTextField();
        t5.setBackground(Color.BLACK);
        t5.setForeground(Color.WHITE);
        t5.setBounds(200, 170, 150, 20);
        p.add(t5);


        b1 = new JButton("Update_Stock");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10, 210, 150, 20);
        b1.addActionListener(this);
        p.add(b1);


        b2 = new JButton("Back to Main Screen");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200, 210, 250, 20);
        b2.addActionListener(this);
        p.add(b2);

        setVisible(true);
        setSize(800, 800);
        setLocation(200, 200);


    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {


            try {

            dbcon c =new dbcon();

                String sql = "update medicine set M_Quantity=M_Quantity+'"+t3.getText()+"',M_Price='"+t4.getText()+"',M_Expiry='"+t5.getText()+"' where M_ID='"+t1.getText()+"'";
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Congratulation! Stock Updated sucessfully");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        if (ae.getSource() == b2) {
            try {
                setVisible(false);
                new Project("loginid").setVisible(true);

            } catch (Exception e) {
                System.out.println("invalid input");
            }


        }
    }


    public static void main(String args[]) {

        new com.AddStock();

    }

}


