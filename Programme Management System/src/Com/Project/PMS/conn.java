package Com.Project.PMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/pmsdb","root","");
            s = c.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


