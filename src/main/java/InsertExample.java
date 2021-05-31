import java.sql.*;
import java.util.Scanner;

public class InsertExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO luxor.book VALUES(NULL, ?, ?, ?, ?)");

        Statement statement = connection.createStatement();
        Scanner sc = new Scanner(System.in);

        System.out.println("title: ");
        String title = sc.nextLine();
        preparedStatement.setString(1, title);

        System.out.println("author: ");
        String author = sc.nextLine();
        preparedStatement.setString(2, author);

        System.out.println("glossary: ");
        String glossray = sc.nextLine();
        preparedStatement.setString(3, glossray);

        System.out.println("price: ");
        int price = sc.nextInt();
        preparedStatement.setInt(4, price);


        preparedStatement.executeUpdate();
        connection.close();
    }
}
