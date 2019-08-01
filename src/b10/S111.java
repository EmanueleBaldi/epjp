package b10;

public class S111 {
    public static void main(String[] args) {
        Runnable runnable = new Runner(); //creami un oggeto runnable di tipo runner

        Thread[] threads = { new Thread(runnable), new MyThread() };
        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("The Runner runs");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runs");
    }
}