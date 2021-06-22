package Com.Project.PMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jadmin","India123");
            s = c.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


