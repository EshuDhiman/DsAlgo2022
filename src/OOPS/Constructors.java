package OOPS;
public class Constructors{
    
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("without par constructor"); // will callconsturctir without paramterized consturctors
        System.out.println(student1.marks);
        System.out.println(student1.name);
        System.out.println(student1.phone);
        System.out.println(student1.roll);
        Student student2 = new Student(10,"arun",7044,"8360311170"); // will call contsructor with parameters
        System.out.println("with par constructor");
        System.out.println(student2.marks);
        System.out.println(student2.name);
        System.out.println(student2.phone);
        System.out.println(student2.roll);

        
      

        
    }
   static class Student{
        int marks;
        String name;
        int roll;
        String phone;
        Student(){
            this.marks=87;
            this.name="eshu";
            this.roll=7055;
            this.phone="9872889958";
        }
        Student(int newMarks , String newName , int newRollNo , String NewPhone ){
            this.marks=newMarks;
            this.name=newName;
            this.roll=newRollNo;
            this.phone=NewPhone;

        }

    }
}