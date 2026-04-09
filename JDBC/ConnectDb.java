
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //establish connection
        Connection cc= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        System.out.println("connected");

        String sql = "CREATE TABLE IF NOT EXISTS students(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30),CITY varchar(30))";
        Statement ss = cc.createStatement();
        ss.executeUpdate(sql); 
        System.out.println("table created");
        cc.close();
        
        
    }
    
}