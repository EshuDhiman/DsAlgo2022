package Concepts.Multithreading;

class Thread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("thread 1 is running ");
            i++;
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("thread 2 is running ");
            i++;
        }
    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread threadObj = new Thread(t1);
        Thread threadObj2 = new Thread(t2);
        threadObj.start();
        threadObj2.start();

    }

}
