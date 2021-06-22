package com;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;


public class ManageMedicine extends JFrame implements ActionListener {
    JButton b1, b2,b3;
    JTextField t1, t2, t3, t4, t5,t6;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JPanel p1, p2;
    JTable jt, jt1;
    JScrollPane sp, sp1;
    int m_id=0;
    public ManageMedicine() {
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
        l1.setBounds(30, 90, 50, 20);
        l1.setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        add(l1);

        l2 = new JLabel("M_Name");
        l2.setBounds(90, 90, 80, 20);
        l2.setBackground(Color.WHITE);
        l2.setForeground(Color.BLACK);
        add(l2);
        l3 = new JLabel("M_Company");
        l3.setBounds(160, 90, 70, 20);
        l3.setBackground(Color.WHITE);
        l3.setForeground(Color.BLACK);
        add(l3);
        l4 = new JLabel("M_Type");
        l4.setBounds(250, 90, 80, 20);
        l4.setBackground(Color.WHITE);
        l4.setForeground(Color.BLACK);
        add(l4);
        l5 = new JLabel("M_MG");
        l5.setBounds(320, 90, 50, 20);
        l5.setBackground(Color.WHITE);
        l5.setForeground(Color.BLACK);
        add(l5);
        l6 = new JLabel("M_Price");
        l6.setBounds(390, 90, 150, 20);
        l6.setBackground(Color.WHITE);
        l6.setForeground(Color.BLACK);
        add(l6);
        l7 = new JLabel("M_Expiry");
        l7.setBounds(460, 90, 180, 20);
        l7.setBackground(Color.WHITE);
        l7.setForeground(Color.BLACK);
        add(l7);

        l8 = new JLabel("Medicine Quantity you want to buy ?");
        l8.setBounds(10, 340, 250, 20);
        l8.setFont(new Font("ariel",Font.ITALIC,14));
        l8.setBackground(Color.WHITE);
        l8.setForeground(Color.BLACK);
        add(l8);

        t2 = new JTextField();
        t2.setBounds(300, 340, 150, 20);
        t2.setBackground(Color.WHITE);
        t2.setForeground(Color.BLACK);
        add(t2);

        jt = new JTable(9, 7);
        jt.setBackground(Color.cyan);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JViewport vp = new JViewport();
        vp.setView(new JLabel("Name"));
        sp = new JScrollPane(jt);
        sp.setColumnHeader(vp);
        jt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jt.getSelectedRow();
                m_id = Integer.parseInt(jt.getModel().getValueAt(row, 0).toString());
                System.out.println(m_id);
            }
        });

        sp.setBounds(10, 120, 527, 200);
        add(sp);
        b2 = new JButton("ADD to order");
        b2.setBounds(10, 370, 120, 20);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);


        jt1 = new JTable(9, 4);
        jt1.setBackground(Color.cyan);
        jt1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        sp1 = new JScrollPane(jt1);
        sp1.setBounds(10, 400, 303, 200);
        add(sp1);

        b3 = new JButton("Fill InFo Generate Bill");
        b3.setBounds(330, 400, 180, 25);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);


        setVisible(true);
        setSize(600, 700);
        setLocation(300, 50);


    }

    public static void main(String[] args) {
        new ManageMedicine().setVisible(true);
    }
    double grand_total = 0;
    int i =0;
    StringBuffer all_med = new StringBuffer();
    Random rand = new Random();
    int o_id = rand.nextInt(9999);
    @Override
    public void actionPerformed(ActionEvent e) {
        dbcon c = new dbcon();


        if (e.getSource() == b1) {
            dbcon con = new dbcon();
            ResultSet rs = null;
            try {
                rs = con.s.executeQuery("select * from medicine ");
                DefaultTableModel tm = (DefaultTableModel) jt.getModel();
                tm.setRowCount(0);
                int i = 1;
                while (rs.next()) {
                    Object o[] = new Object[]{rs.getString("M_ID"), rs.getString("M_NAME"), rs.getString("M_COMP"), rs.getString("M_TYPE"), rs.getString("M_MG"), rs.getString("M_PRICE"),rs.getString("M_EXPIRY")};
                   tm.addRow(o);

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        String med_id = null;
        String m_name = null;
        int m_qty = 0;
        double total_price = 0;
        if (e.getSource() == b2) {
            try {

                ResultSet rs = c.s.executeQuery("select * from  MEDICINE where M_id='" + m_id + "'");
                DefaultTableModel tm = (DefaultTableModel) jt1.getModel();

                while (rs.next()) {
                    if (i==0){
                        tm.setRowCount(0);
                    }else {
                        tm.setRowCount(i);
                    }
                    med_id = rs.getString("M_ID");
                    m_name = rs.getString("M_NAME");
                    m_qty = Integer.parseInt(t2.getText());
                    total_price = rs.getInt("M_PRICE") * m_qty;
                    Object o[] = new Object[]{med_id,m_name,m_qty,total_price};
                    tm.addRow(o);

                    all_med.append(med_id+'\t'+m_name+'\t'+'\t'+m_qty+'\t'+total_price+'\n');
                    System.out.println(all_med);
                    grand_total = grand_total + total_price;
                }

            } catch (Exception ge) {
                System.out.println("invalid input");
            }
            i++;
        }

        if (e.getSource() == b3){
            dbcon con = new dbcon();
            try {
                System.out.println("Done");
                con.s.executeQuery("insert into orders values('"+o_id+"',null,null,null,'"+all_med+"',null,'"+grand_total+"')");
                JOptionPane.showMessageDialog(null, "Order is saved in db");
                setVisible(false);
                new BillInfo(o_id).setVisible(true);
            }catch (Exception ex){

            }
        }

    }
}







