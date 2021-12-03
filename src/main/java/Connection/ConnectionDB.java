package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lagartobd", "root", "021217");
            if (connection != null){
                System.out.println("Conexión exitosa");
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
