package Com.Project.PMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JPasswordField p1;
    JTextField t1,t2,t3,t4,t5;
    JRadioButton r1,r2,r3;
    JButton b1,b2,b3;

    SignUp() {
       setLayout(null);
       l1 = new JLabel("Name");

       l1.setFont(new Font("Monospaced", Font.BOLD, 20));
       l1.setForeground(Color.black);
       l1.setBounds(60, 40, 150, 30);
       add(l1);

       t1 = new JTextField();
       t1.setFont(new Font("Arial", Font.ITALIC, 20));
       t1.setForeground(Color.BLACK);
       t1.setBounds(270, 40, 200, 30);
       add(t1);

        l2 = new JLabel("Password");

        l2.setFont(new Font("Monospaced", Font.BOLD, 20));
        l2.setForeground(Color.black);
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        p1 = new JPasswordField();
        p1.setFont(new Font("Arial", Font.ITALIC, 20));
        p1.setForeground(Color.BLACK);
        p1.setBounds(270, 80, 200, 30);
        add(p1);
        l3 = new JLabel("Email_Id");

        l3.setFont(new Font("Monospaced", Font.BOLD, 20));
        l3.setForeground(Color.black);
        l3.setBounds(60, 120, 150, 30);
        add(l3);

        t3 = new JTextField();
        t3.setFont(new Font("Arial", Font.ITALIC, 20));
        t3.setForeground(Color.BLACK);
        t3.setBounds(270, 120, 200, 30);
        add(t3);
        l4 = new JLabel("HandPhone");

        l4.setFont(new Font("Monospaced", Font.BOLD, 20));
        l4.setForeground(Color.black);
        l4.setBounds(60, 160, 150, 30);
        add(l4);

        t4 = new JTextField();
        t4.setFont(new Font("Arial", Font.ITALIC, 20));
        t4.setForeground(Color.BLACK);
        t4.setBounds(270, 160, 200, 30);
        add(t4);

        l5 = new JLabel("Gender");

        l5.setFont(new Font("Monospaced", Font.BOLD, 20));
        l5.setForeground(Color.black);
        l5.setBounds(60, 200, 150, 30);
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Sanserif",Font.PLAIN,17));
        r1.setBounds(270, 200, 100, 30);

        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(380, 200, 100, 30);
        r2.setFont(new Font("Sanserif",Font.PLAIN,17));
        add(r2);

        r3 = new JRadioButton("Transgender");
        r3.setFont(new Font("Sanserif",Font.PLAIN,17));
        r3.setBounds(310, 240, 150, 30);

        ButtonGroup btn = new ButtonGroup();
        btn.add(r1);
        btn.add(r2);
        btn.add(r3);
        add(r3);


        b1 = new JButton("Submit");
        b1.setFont(new Font("Sanserif",Font.BOLD,19));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.MAGENTA);
        b1.setBounds(80,280,120,30);
        add(b1);

        b2 = new JButton("Reset");
        b2.setFont(new Font("Sanserif",Font.BOLD,19));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.MAGENTA);
        b2.setBounds(320,280,120,30);
        add(b2);

        b3 = new JButton("Exit");
        b3.setFont(new Font("Sanserif",Font.BOLD,19));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.MAGENTA);
        b3.setBounds(200,330,120,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        setSize(600,500);
        setLocation(400,30);
        setVisible(true);
        setResizable(false);
   }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Name = "";
        String pass = "";
        String email = "";
        String gender = "";
        String Hp = "";
        StringBuilder statusNull = new StringBuilder("");
        StringBuilder validationErrors = new StringBuilder("");
        statusNull.length();

        if (e.getSource() == b1) {

            if (t3.getText().equals("")) {
                statusNull = statusNull.append(" " + "Email");
                t3.setText("");
            } else {
                if (isValidEmail(t3.getText())) {
                    email = t3.getText();
                } else {
                    validationErrors = validationErrors.append("Email is not in proper format");
                }
            }
            System.out.println(email);

            if (p1.getText().equals("")) {
                statusNull = statusNull.append(" " + "Password");
            } else {
                String pass1 = p1.getText();
                if (isValidPassword(pass1)) {
                    pass = pass1;
                } else {
                    validationErrors = validationErrors.append("Password is not in proper format");
                }
            }
            System.out.println(pass);
            if (t1.getText().equals("")) {
                statusNull = statusNull.append(" " + "Name");
                t1.setText("");
            } else {
                if (t1.getText().length() > 3 && t1.getText().length() < 30) {
                    Name = t1.getText();
                } else {
                    validationErrors = validationErrors.append('\n' + "Name Should be Min 3 and Max 30 Character allowed");
                }
            }
            System.out.println(Name);
            if (t4.getText().equals("")) {
                statusNull = statusNull.append("Hp\n");
                t4.setText("");
            } else {
                String pass1 = t4.getText();
                if (isValidHp(t4.getText())) {
                    Hp = t4.getText();
                } else {
                    validationErrors = validationErrors.append("Mobile number should be in numeric\n");
                }
            }
            System.out.println(Hp);
            if (r1.isSelected() || r2.isSelected() || r3.isSelected()) {
                if (r1.isSelected()) {
                    gender = "Male";
                } else if (r2.isSelected()) {
                    gender = "female";
                } else if (r3.isSelected()) {
                    gender = "transgender";
                }else{
                    statusNull.append("Gender\n");
                }
                System.out.println(gender);
            }
            if (statusNull.length() != 0) {
                JOptionPane.showMessageDialog(null, "Check These Fields Should Not Be Empty: " + statusNull);
            }
            if (!(validationErrors.length() == 0)){
                JOptionPane.showMessageDialog(null, "Check These Fields are not in proper format: \n " + validationErrors);
            }
            try {
                conn c2 = new conn();
                ResultSet rs = c2.s.executeQuery("select * from login where uname ='" + email + "'");

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Username '" + email + "' is already Exist");
                    setVisible(false);
                    new SignUp().setVisible(true);
                } else {
                    c2.s.executeUpdate("INSERT INTO signup2 VALUES('"+Name+"','"+pass+"','"+email+"','"+Hp+"','"+gender+"')");
                    //c2.s.executeUpdate("INSERT INTO login VALUES('"+email+"','"+pass+"')");
                    JOptionPane.showMessageDialog(null, "Your Signup has been successful.");
                }
            } catch (Exception ex) {
            }
        }
    }

        public static boolean isValidPassword(String password)
        {
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";

            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);

            return m.matches();
        }
        public static boolean isValidEmail(String email)
        {
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(email);

            return m.matches();
        }
         public static boolean isValidHp(String Hp) {
             String regex = "(0/91)?[7-9][0-9]{9}";
             Pattern p = Pattern.compile(regex);
             Matcher m = p.matcher(Hp);
             return m.matches();
         }
    public static void main(String[] args) {

        new SignUp().setVisible(true);
    }


}




