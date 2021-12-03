package Main;

import Connection.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        ConnectionDB conn = new ConnectionDB();

        try (Connection connection = conn.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
