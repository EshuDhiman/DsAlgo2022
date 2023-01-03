package Concepts.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcDemo {
  public static void main(String[] argv) throws Exception {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection connection = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:eshudhiman", "eshudhiman",
        "eshudhiman");
    if (connection != null) {
      System.out.println("Connected");
    } else {
      System.out.println("Failed to make connection!");
    }
  }
}
