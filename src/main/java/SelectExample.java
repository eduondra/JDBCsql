import java.sql.*;

public class SelectExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM book");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("title"));
        }

        connection.close();
    }
}
