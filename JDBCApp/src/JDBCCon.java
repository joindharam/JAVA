import java.sql.*;
import java.util.Scanner;

public class JDBCCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ebnter Emp ID ; : ");
        int eid = sc.nextInt();
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","India123");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from employees");
            while (rs.next()){
                System.out.println("For Emp ID : "+rs.getString("first_name")+" Salary Is : "+rs.getInt("Salary"));
            }

        }catch (Exception e){}
    }
}
