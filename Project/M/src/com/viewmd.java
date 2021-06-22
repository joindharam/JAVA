package com;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
//import net.proteanit.sql.DbUtils;


public class viewmd extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField t1, t2, t3, t4, t5;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JPanel p1,p2;
    JTable jt;

//    String column[]={"ID","NAME","password"};
 //String data[][]={ {"101","Amit","670000"},
//            {"102","Jai","780000"},
//            {"101","Sachin","700000"},{"101","Sachin","700000"},{"101","Sachin","700000"},{"101","Sachin","700000"},{"101","Sachin","700000"}};
    public viewmd() {
        super("Medical Store System-View_Medicine_&_Bills");
        setLayout(null);


        /*main code for view medicine and bill payments*/

        t1 = new JTextField();
        t1.setBounds(10, 50, 150, 20);
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.BLACK);
        add(t1);

        b1 = new JButton("Search Medicine..");
        b1.setBounds(200, 50, 150, 20);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        add(b1);
        b1.addActionListener(this);

        l1 = new JLabel("M_ID");
        l1.setBounds(10, 90, 50, 20);
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        add(l1);

        l2 = new JLabel("M_Name");
        l2.setBounds(110, 90, 80, 20);
        l2.setBackground(Color.WHITE);
        l2.setForeground(Color.BLACK);
        add(l2);
        l3 = new JLabel("M_MG");
        l3.setBounds(250, 90, 100, 20);
        l3.setBackground(Color.WHITE);
        l3.setForeground(Color.BLACK);
        add(l3);
        l4 = new JLabel("M_Quantity");
        l4.setBounds(350, 90, 150, 20);
        l4.setBackground(Color.WHITE);
        l4.setForeground(Color.BLACK);
        add(l4);

        l5 = new JLabel();
        l5.setBounds(10, 130, 50, 20);
        l5.setBackground(Color.WHITE);
        l5.setForeground(Color.BLACK);
        add(l5);

        l6 = new JLabel();
        l6.setBounds(110, 130, 80, 20);
        l6.setBackground(Color.WHITE);
        l6.setForeground(Color.BLACK);
        add(l6);
        l7 = new JLabel();
        l7.setBounds(250, 130, 100, 20);
        l7.setBackground(Color.WHITE);
        l7.setForeground(Color.BLACK);
        add(l7);
        l8 = new JLabel();
        l8.setBounds(350, 130, 50, 20);
        l8.setBackground(Color.WHITE);
        l8.setForeground(Color.BLACK);
        add(l8);


        b2 = new JButton("ADD to order");
        b2.setBounds(100, 170, 150, 20);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        add(b2);



        b2.addActionListener(this);



        p1= new JPanel();
        p1.setLayout(null);
        p1.setBounds(300, 180, 300, 300);
        p1.setBorder(new TitledBorder(new LineBorder(Color.GREEN,5),"ORDER-PLACE",TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        p1.setBackground(Color.CYAN);


        add(p1);


        t2 = new JTextField();
        t2.setEditable(false);
        t2.setBounds(10, 70, 150, 20);
        t2.setBackground(Color.WHITE);
        t2.setForeground(Color.BLACK);
        p1.add(t2);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setBounds(10, 90, 150, 20);
        t3.setBackground(Color.WHITE);
        t3.setForeground(Color.BLACK);
        p1.add(t3);
        t4 = new JTextField();
        t4.setEditable(false);

        t4.setBounds(10, 110, 150, 20);
        t4.setBackground(Color.WHITE);
        t4.setForeground(Color.BLACK);
        p1.add(t4);
        t5 = new JTextField();
        t5.setEditable(false);
        t5.setBounds(10, 130, 150, 20);
        t5.setBackground(Color.WHITE);
        t5.setForeground(Color.BLACK);
        p1.add(t5);

        jt = new JTable(6,2);
        jt.setBackground(Color.cyan);
        jt.setBounds(100, 200, 150, 100);

        JScrollPane sp=new JScrollPane(jt);
        sp.setWheelScrollingEnabled(true);
        add(sp);
        add(jt);

        








        setVisible(true);
        setSize(500, 500);
        setLocation(200, 200);


    }

    public static void main(String[] args) {
        new viewmd().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dbcon c = new dbcon();

        if (e.getSource() == b1) {
            String s = t1.getText();
            try {
                ResultSet rs = c.s.executeQuery("select * from  MEDICINE where M_NAME='" + s + "'");
                if (rs.next()) {
                    String m_id = rs.getString(1);
                    String m_name = rs.getString(2);
                    String m_comp = rs.getString(3);
                    String m_mg = rs.getString(4);

                    l5.setText(m_id);
                    l6.setText(m_name);
                    l7.setText(m_comp);
                    l8.setText(m_mg);


                } else {
                    System.out.println("NOT fOUND");
                }
            } catch (Exception ge) {
                System.out.println("invalid input");
            }
        }

        if (e.getSource() == b2) {


            dbcon con = new dbcon();

            try {
                try (ResultSet rs = con.s.executeQuery("select * from emp")) {
                    DefaultTableModel tm = (DefaultTableModel)jt.getModel();
                    tm.setRowCount(0);
                    while (rs.next()) {
                        //String uname = rs1.getString(1);
                       // String pass = rs1.getString(2);
                 Object o[]= new Object[]{rs.getString(1), rs.getString(2)};
                      //  String jtdata[] = {uname, pass};
                            tm.addRow(o);

                        //  dtf.addRow(jtdata);
                    }
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();


                //  String s1 = t1.getText();
                //
                //                try {
                //                    ResultSet   rs = c.s.executeQuery("select * from  MEDICINE where M_NAME='" + s1 + "'");
                //                    System.out.println("result is "+rs);
                //                    if (rs.next()) {
                //
                //
                //                        String m_id = rs.getString(1);
                //                        String m_name = rs.getString(2);
                //                        String m_comp = rs.getString(3);
                //                        String m_mg = rs.getString(4);
                //
                //                        t2.setText(m_id);
                //                        t3.setText(m_name);
                //                        t4.setText(m_comp);
                //                        t5.setText(m_mg);
            } catch (Exception ge) {
                System.out.println("invalid input");
            }
        }
        else
        {
            System.out.println("invalid input");
        }
        }
    }






