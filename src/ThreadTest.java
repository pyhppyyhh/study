public class ThreadTest {

    public static void main(String[] args) {

        myThread1 thread1 = new myThread1();
        thread1.start();

    }
}
class myThread1 extends Thread {


    public void run(){
        System.out.println("TheadName : "+Thread.currentThread().getName());
    }
}
