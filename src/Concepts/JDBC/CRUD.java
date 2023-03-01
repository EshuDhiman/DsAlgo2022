package Concepts.JDBC;

import java.sql.*;
import java.io.*;

public class CRUD {

    Connection con;
    PreparedStatement ps;

    public CRUD() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "eshudhiman",
                    "eshudhiman");
            if (connection != null) {
                System.out.println("connected");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertEmp(String code, String name, String city, int sal) {
        try {
            ps = con.prepareStatement("insert into Emp values(?,?,?,?)");
            ps.setString(1, code);
            ps.setString(2, name);
            ps.setString(3, city);
            ps.setInt(4, sal);
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("not Inserted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmp(String code, String city, int salary) {
        try {
            ps = con.prepareStatement("update emp set city=?,salary=salary+? where code=?");
            ps.setString(1, city);
            ps.setInt(2, salary);
            ps.setString(3, code);
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("updated");
            } else {
                System.out.println("not updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmp(String code) {
        try {
            ps = con.prepareStatement("delete from emp where code=?");
            ps.setString(1, code);
            int i = ps.executeUpdate();
            if (i != 0) {
                System.out.println("deleted");
            } else {
                System.out.println("not deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dispAll() {
        try {
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select * from emp");
            while (res.next()) {
                System.out.print(res.getString(1));
                System.out.print(res.getString(2));
                System.out.print(res.getString(3));
                System.out.println(res.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dispAnEmp(String s) {
        try {
            ps = con.prepareStatement("select * from Emp where code=?");
            ps.setString(1, s);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                System.out.print(res.getString(1));
                System.out.print(res.getString(2));
                System.out.print(res.getString(3));
                System.out.println(res.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            CRUD obj = new CRUD();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ch = 0;
            while (true) {
                System.out.println("Employee management \n"
                        + "1. Add Employee \n "
                        + "2. Edit Employee \n "
                        + "3. Delete Employee \n "
                        + "4. Display all record \n "
                        + "5. Display a record \n"
                        + "6. Exit"
                        + "Enter option \n");
                String str1 = br.readLine().toString();
                ch = Integer.parseInt(str1);
                switch (ch) {
                    case 1: {
                        System.out.println("Enter Employee Code");
                        String code = br.readLine();
                        System.out.println("Enter Employee Name");
                        String name = br.readLine();
                        System.out.println("Enter Employee City");
                        String city = br.readLine();
                        System.out.println("Enter Employee Salary");
                        String sal = br.readLine();
                        int salary = Integer.parseInt(sal);
                        obj.insertEmp(code, name, city, salary);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter Employee Code");
                        String code = br.readLine();
                        System.out.println("Enter Employee City");
                        String city = br.readLine();
                        System.out.println("Enter Employee Salary");
                        String sal = br.readLine();
                        int salary = Integer.parseInt(sal);
                        obj.updateEmp(code, city, salary);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Employee Code to delete record");
                        String code = br.readLine();
                        obj.deleteEmp(code);
                        break;
                    }

                    case 4: {
                        obj.dispAll();
                        break;
                    }
                    case 5: {
                        System.out.println("Enter Employee Code to display record");
                        String code = br.readLine();
                        obj.dispAnEmp(code);
                        break;
                    }
                    case 6: {
                        System.exit(0);
                    }
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
