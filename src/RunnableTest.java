public class RunnableTest {
    public static void main(String[] args) {

        MyThead myThead = new MyThead(); //Runnable 객채 생성
        Thread t1 = new Thread(myThead); //쓰레드 객채 생성
        t1.start(); //쓰래드 실행

    }
}


class MyThead implements Runnable { //Runnalbe 인터페이스를 구현
    @Override
    public void run() {     //run()메서드 상속Override
        System.out.println("MyThead is running : "+Thread.currentThread().getName());
    }
}



