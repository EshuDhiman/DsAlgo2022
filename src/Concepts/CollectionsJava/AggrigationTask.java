package Concepts.CollectionsJava;

import java.util.ArrayList;
import java.util.List;
// created a class Organization 
class Organization {
    String orgName;
    int strength = 0;
    List<Employee> emplist; // list of employee type

    // method to add Employee to the List
    void addEmp(Employee e  ) {
        // it has a parameter which takes a Employee type data which is passed by creating new employee objects

        emplist.add(e);
        System.out.println(emplist.size()); // size of the list
        strength += 1;

    }
    // constructor
    public Organization(String orgName, int strength, List<Employee> emplist) {
        this.orgName = orgName;
        this.strength = strength;
        this.emplist = emplist;
    }

    @Override // overided toString()
    public String toString() {
        return "Organization [orgName=" + orgName + ", strength=" + strength + ", emplist=" + emplist + "]";
    }

}

// created a class employee
class Employee {
    String name;
    String designation;
    int leavebalance;

    public Employee(String name, String designation, int leavebalance) {
        this.name = name;
        this.designation = designation;
        this.leavebalance = leavebalance;
    }

    @Override
    public String toString() {
        return "Employee of [ name=" + name + ", designation=" + designation + ", leavebalance=" + leavebalance + "]";
    }

    void applyLeave(int noOfDays) {
        // if leave balance is less than the noOfday which is requested by the epmloye grant leave and minus the remaining days
        if (leavebalance >= noOfDays) {
            leavebalance -= noOfDays;
            System.out.println("leave granted to" + " " + name);
        } else {
            System.out.println(name + " " + "has not sufficent leave balance");

        }

    }
}

public class AggrigationTask {
    public static void main(String[] args) {
        // created a object of Organization class passed values to its constructors
        Organization objOrganization = new Organization("google", 0, new ArrayList<>());  
        // created objects of employee classs and passed the values to employee constructor every time a new object is made to initialize that object
        Employee employee1 = new Employee("Eshu", "traniee", 2);
        Employee employee2 = new Employee("Rahul", "traniee", 2);
        Employee employee3 = new Employee("Pnku", "traniee", 2);
        objOrganization.addEmp(employee3); // added the object of Employee class to the empList in Organization class by passing employee object in this case which is 'employee3' which is of Employee type to addEmp method in Organization class
        objOrganization.addEmp(employee2);
        objOrganization.addEmp(employee1);
        System.out.println(objOrganization);
        employee1.applyLeave(2);// accessed apply leave method
        employee1.applyLeave(1);
        employee2.applyLeave(1);
        employee3.applyLeave(1);
    }

}
