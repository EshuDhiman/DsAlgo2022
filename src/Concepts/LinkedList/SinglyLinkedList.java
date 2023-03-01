package Concepts.LinkedList;

import oracle.sql.StructDescriptor;

class StudentList {
    int size = 0;
    Student head;
    Student tail;

    private class Student {
        private int Id;
        private String name;
        Student next;

        Student(int ID, String StudentName) {
            this.Id = ID;
            this.name = StudentName;
        }

    }

    public void insertAtIndex(int id, String name, int index) {
        if (size == 0) {
            insertAtFirst(id, name);
        }
        Student s = head;
        for (int i = 0; i < index - 1; i++) {

            s = s.next;
        }
        Student stu = new Student(id, name);
        stu.next = s.next;
        s.next = stu;
        size++;

    }

    public void insertAtFirst(int id, String name) {
        Student stu = new Student(id, name);
        if (size == 0) {
            head = stu;
            tail = head;
            size++;
            return;
        }
        stu.next = head;
        head = stu;
        size++;

    }

    public void insertLast(int id, String Name) {
        if (size == 0) {
            insertAtFirst(id, Name);
            return;
        } else {
            Student s = new Student(id, Name);
            tail.next = s;
            tail = s;

        }
    }

    public void deleteAt(int index) {
        Student s = head;
        for (int i = 0; i < index - 1; i++) {
            s = s.next;
        }
        s.next = s.next.next;
    }

    public void deleteFirst() {
        if (size == 1) {
            head = null;
            tail = null;

        }
        head = head.next;
        size--;

    }

    public void deleteLast() {
        if (size == 1) {
            head = null;
            tail = null;

        }
        Student s = head;
        for (int i = 0; i < size - 2; i++) {
            s = s.next;

        }
        s.next = tail;
        tail.next = null;

    }

    public void display() {
        if (size == 0) {
            System.out.println(
                    "null"

            );

        }
        Student s = head;
        for (int i = 0; i < size; i++) {
            System.out.print(s.Id + " " + s.name + "->");
            s = s.next;
        }
    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        StudentList obj = new StudentList();
        obj.insertAtFirst(1, "eshu");
        obj.insertAtIndex(2, "avinash", 1);
        obj.insertAtIndex(3, "avinash", 2);
        obj.insertAtIndex(4, "avinash", 3);
        obj.insertAtIndex(5, "avinash", 4);
        obj.display();
        obj.deleteLast();
        obj.deleteAt(2);
        obj.display();

    }

}
