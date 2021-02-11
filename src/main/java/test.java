
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/library"+
            "?verifyServerCertificate=false"+
                    "&useSSL=false"+
                    "&requireSSL=false"+
                    "&useLegacyDatetimeCode=false"+
                    "&amp"+
                    "&serverTimezone=UTC";
            String username = "root";
            String password = "A03071979a#";
            System.out.println("Connecting...");

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection successful!");
            } catch (SQLException e) {
                System.out.println("Connection failed!");
                e.printStackTrace();
            }
        }
    }


