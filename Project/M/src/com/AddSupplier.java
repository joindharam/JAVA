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

public class AddSupplier extends JFrame implements ActionListener {

        JPanel p;
        JLabel l1, l2, l3, l4, l5, l6,l7;
        JTextField t1, t2, t3, t4, t5,t6;
        JComboBox c1;
        JButton b1, b2, b3;


        AddSupplier() {
            super("ADD Supplier AT Medicine Store System");

            setLayout(null);

            p = new JPanel();
            p.setLayout(null);
            p.setBounds(10, 10, 600, 400);
            p.setBackground(Color.ORANGE);
            p.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "AddSupplier", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
            p.setBackground(Color.ORANGE);

            add(p);

            l1 = new JLabel("Batch Number :");
            l1.setBackground(Color.BLACK);
            l1.setForeground(Color.WHITE);
            l1.setBounds(10, 50, 150, 20);
            p.add(l1);
            t1 = new JTextField();
            t1.setBackground(Color.BLACK);
            t1.setForeground(Color.WHITE);
            t1.setBounds(200, 50, 150, 20);
            p.add(t1);


            l2 = new JLabel("Supplier Name :");
            l2.setBackground(Color.BLACK);
            l2.setForeground(Color.WHITE);
            l2.setBounds(10, 90, 150, 20);
            p.add(l2);

            t2 = new JTextField();
            t2.setBackground(Color.BLACK);
            t2.setForeground(Color.WHITE);
            t2.setBounds(200, 90, 150, 20);
            p.add(t2);
            l3 = new JLabel("Type of Medicine supplied ?");
            l3.setBackground(Color.BLACK);
            l3.setForeground(Color.WHITE);
            l3.setBounds(10, 130, 350, 20);
            p.add(l3);

            c1 = new JComboBox();
            c1.addItem("Tablet");
            c1.addItem("Capsule");
            c1.addItem("Syrup");
            c1.addItem("Ointment");
            c1.setForeground(Color.WHITE);
            c1.setBounds(200, 130, 150, 20);
            p.add(c1);

            l4 = new JLabel("Manufacturing Company Name");
            l4.setBackground(Color.BLACK);
            l4.setForeground(Color.WHITE);
            l4.setBounds(10, 170, 150, 20);
            p.add(l4);
            t3 = new JTextField();
            t3.setBackground(Color.BLACK);
            t3.setForeground(Color.WHITE);
            t3.setBounds(200, 170, 150, 20);
            p.add(t3);
            l5 = new JLabel("Price");
            l5.setBackground(Color.BLACK);
            l5.setForeground(Color.WHITE);
            l5.setBounds(10, 210, 150, 20);
            p.add(l5);
            t4 = new JTextField();
            t4.setBackground(Color.BLACK);
            t4.setForeground(Color.WHITE);
            t4.setBounds(200, 210, 150, 20);
            p.add(t4);
            l6 = new JLabel("Date of Manufacturing");
            l6.setBackground(Color.BLACK);
            l6.setForeground(Color.WHITE);
            l6.setBounds(10, 250, 150, 20);
            p.add(l6);
            t5 = new JTextField();
            t5.setBackground(Color.BLACK);
            t5.setForeground(Color.WHITE);
            t5.setBounds(200, 250, 150, 20);
            p.add(t5);
            l7 = new JLabel("Date of Expiry");
            l7.setBackground(Color.BLACK);
            l7.setForeground(Color.WHITE);
            l7.setBounds(10, 290, 150, 20);
            p.add(l7);
            t6 = new JTextField();
            t6.setBackground(Color.BLACK);
            t6.setForeground(Color.WHITE);
            t6.setBounds(200, 290, 150, 20);
            p.add(t6);



            b1 = new JButton("Add_Supplier");
            b1.setBackground(Color.BLUE);
            b1.setForeground(Color.WHITE);
            b1.setBounds(10, 330, 150, 20);
            b1.addActionListener(this);
            p.add(b1);


            b2 = new JButton("Back to Main Screen");
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            b2.setBounds(200, 330, 250, 20);
            b2.addActionListener(this);
            p.add(b2);

            setVisible(true);
            setSize(800, 800);
            setLocation(200, 200);


        }

        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == b1) {

                Connection c = null;
                String type = null;
                try {

                    System.out.println(t1.getText());
                    c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jadmin", "India123");
                    String sql = "insert into supplier values(?,?,?,?,?,?,?)";
                    PreparedStatement pst = c.prepareStatement(sql);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3,  (String) c1.getSelectedItem());
                    pst.setString(4, t3.getText());
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    pst.setString(7, t6.getText());
                    int i = pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Congratulation! Supplier Added sucessfully");
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

            new com.AddSupplier();

        }

    }




