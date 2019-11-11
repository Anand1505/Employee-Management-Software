
package employeesalary;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

public class MyDataBase {
   Connection con;
   public static Connection ConnecrDb() throws Exception{
       try
        {
         //Class.forName("org.sqlite.JDBC");
            Properties prop=new Properties();
            prop.setProperty("user", "root");
            prop.setProperty("password", "");
            Driver dr=new com.mysql.jdbc.Driver();
            
         Connection con=dr.connect("jdbc:mysql://localhost:3306/mydatabase", prop);
         return con;
         
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

}
