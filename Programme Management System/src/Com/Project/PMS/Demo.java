package Com.Project.PMS;

import java.sql.ResultSet;

public class Demo {
    public static void main(String[] args) throws Exception{
        conn c = new conn();
        ResultSet rs = c.s.executeQuery("select * from employees where employee_id= 101");
        while (rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
        }
    }
}
