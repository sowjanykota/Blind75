package threads;

public class ImplementsRunnableEx implements Runnable{

    public void run() {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ImplementsRunnableEx im = new ImplementsRunnableEx();
        Thread th1 = new Thread(im);
        Thread th2 = new Thread(im);
        Thread th23 = new Thread(im);
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();
    }


}
