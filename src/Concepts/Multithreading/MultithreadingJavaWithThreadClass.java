package Concepts.Multithreading;

class T1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("THREAD1");
            System.out.println("Thread 1 running ");

        }
    }

}

class T2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("THREAD2");
            System.out.println("Thread 2 running ");
            i++;
        }
    }

}

public class MultithreadingJavaWithThreadClass {
    public static void main(String[] args) {
        T1 thread1 = new T1();
        T2 thread2 = new T2();
        thread1.start();
        thread2.start();

    }
}
