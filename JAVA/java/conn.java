import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cc = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/nil", "root", "root"
        );
        System.out.println("Connected");
    }
}
