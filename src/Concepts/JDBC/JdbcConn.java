package Concepts.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConn {
    public static void main(String[] args) throws Exception{
        //step 1 is to load drivers by class.Forname()
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "eshudhiman",
                "eshudhiman");
            if(connection!=null){
                System.out.println("connected");
            }
            Statement stmt = connection.createStatement();
            
            // create table
            // stmt.executeUpdate("create table empJava1(emp number(2), name varchar(20), sal number(21))");
            // firing queries 
            PreparedStatement ps = connection.prepareStatement("inster into empJava1 values(?,?,?)");
            Scanner sc =  new Scanner(System.in);
            while(true){
                System.out.println(" Enter empNumber");
                int empNo = Integer.parseInt(sc.nextLine());
                System.out.println("ENTER EMP NAME");
                String name =sc.nextLine();
                System.out.println("ENTER EMP sal");
                double sal =Double.parseDouble(sc.nextLine());
                ps.setInt(1, empNo);
                ps.setString(2, name);
                ps.setDouble(3,sal);
                int i = ps.executeUpdate();
                  int temp=0;
                System.out.println("enter 1 to insert more rec enter 2 to stop");
                temp = sc.nextInt();
                if (temp==2) {
                    break;
                    
                }

                
              
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
    }
    
}
