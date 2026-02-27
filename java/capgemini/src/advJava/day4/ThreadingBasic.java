package advJava.day4;

public class ThreadingBasic {
    public static void main() {
        Thread thread = Thread.currentThread();

        ChildThread t1 = new ChildThread();
        t1.start();
        ChildThread2 obj = new ChildThread2();
        Thread t2 = new Thread(obj);
        t2.start();
        for(int i =1;i<=100; i++){
            System.out.println("main : " +i);
        }

    }

}
class ChildThread extends Thread{
    Thread thread = Thread.currentThread();

    public void run(){
        for(int i =1;i<=100; i++){
            System.out.println("child01 : " +i);
        }
    }
}
class ChildThread2 implements Runnable{
    Thread thread = Thread.currentThread();

    @Override
    public void run(){
        for(int i =1;i<=100; i++){
            System.out.println("child02 : " +i);
        }
    }
}