package dbconsoleapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class DBConsoleApplication {

  
    public static void main(String[] args) {
        final String USERNAME="root";
        final String PASSWORD="";
        final String DBNAME="rentaldb";
        final String HOSTNAME="localhost";
        final String URL="jdbc:mysql://"+HOSTNAME+"/"+DBNAME;
        //POST Data
        
        try {
            Connection connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query="insert into employee values ('10','Joy Islam','0184','2017/01/03')";
            Statement statement=(Statement) connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Connected");
        } catch (SQLException ex) {
            System.err.println("Failed");
            System.err.println(ex);
        }

        //GET Data
        /*
        try {
            Connection connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query="select * from employee";
            Statement statement=connection.createStatement();       
            ResultSet resultset=statement.executeQuery(query);
            while(resultset.next()){
              String sin=resultset.getString("sin");
                String name=resultset.getString("name");
                String phone=resultset.getString("phone");
                LocalDate hiringDate=LocalDate.parse(resultset.getString("hiringDate"));
                  // System.out.println(name);

             Employee employee=new Employee(sin,name,phone,hiringDate);
                System.out.println(employee);
                
            }
        } catch (SQLException ex) {
            System.err.println("Failed");
            System.err.println(ex);
        }
*/
    }
    
}
