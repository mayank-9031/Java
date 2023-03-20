class myThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i am cooking food");
            i++;
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i am doing chat with her");
            i++;
        }
    }
}

public class cwh_70_multiThreading {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
