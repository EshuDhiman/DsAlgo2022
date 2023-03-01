package Concepts.CollectionsJava;

import java.util.*;

class SchoolStudent implements Comparable<SchoolStudent>{
    private int id;
    private String name;
    private String schoolName;
    public SchoolStudent(){

    }
    public SchoolStudent(int StudentId , String StudentName , String StudentSchoolName){
        super();
        this.id = StudentId;
        this.name = StudentName;
        this.schoolName= StudentSchoolName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", schoolName=" + schoolName + "]";
    }
    @Override
    public int compareTo(SchoolStudent o) {
        // TODO Auto-generated method stub
        return 0;
    }

    
}

public class ArrayCustomObjColl {
    public static void main(String[] args) {
        ArrayList<SchoolStudent>StudentList  = new ArrayList<SchoolStudent>();1
        StudentList.add(new SchoolStudent(1,"eshu","kv"));
        StudentList.add(new SchoolStudent(2,"ishita","kv"));
        StudentList.add(new SchoolStudent(3,"naseeta","kv"));
        Collections.sort(StudentList);;

        for (int i = 0; i < StudentList.size(); i++) {
            System.out.println(StudentList.get(i));
        }
    }    
}

