package threads;

public class FirstExtendTHread  extends Thread{
    public void run() {
        for (int i = 0 ; i < 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        FirstExtendTHread th1 = new FirstExtendTHread();
        FirstExtendTHread th2 = new FirstExtendTHread();
//        System.out.println(th1.getName());
//        System.out.println(th2.getName());
//        th1.setName("one");
//        th2.setName("second");
//        System.out.println(th1.getName());
//        System.out.println(th2.getName());

        th1.start();
        //th1.join(5000);

        th2.start();
    }


}
