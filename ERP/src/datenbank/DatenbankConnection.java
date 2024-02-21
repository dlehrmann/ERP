package datenbank;
import java.sql.*;

public class DatenbankConnection {
	
	private static final String host = "";
    private static final String port = "";
    private static final String database = "";
    private static final String username = "";
    private static final String password = "";
    private static Connection connection;
    
    public static boolean isConnected() {
        return (connection != null);
    }

    public static void connect() throws ClassNotFoundException {
        if (!isConnected()) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                System.out.println("Datenbank verbunden.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Es konnte keine Verbindung hergestellt werden!");
            }
        }
    }

    public static void disconnect() {
        if (isConnected()) {
            try {
                connection.close();
                System.out.println("Datenbankverbindung wurde geschlossen.");
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
    }

    public static void update(String query) {
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(String query) {
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet query(String query) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
