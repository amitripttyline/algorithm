package String;
class StringTask implements Runnable {
    private String str = "Hello";

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            str = str + "!";
            System.out.println(Thread.currentThread().getName() + " - String: " + str);
        }
    }
}

class StringBuilderTask implements Runnable {
    private StringBuilder sb = new StringBuilder("Hello");

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append("!");
            System.out.println(Thread.currentThread().getName() + " - StringBuilder: " + sb);
        }
    }
}

class StringBufferTask implements Runnable {
    private StringBuffer sbf = new StringBuffer("Hello");

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sbf.append("!");
            System.out.println(Thread.currentThread().getName() + " - StringBuffer: " + sbf);
        }
    }
}

public class StringThreadExample {
    public static void main(String[] args) {
        System.out.println("Running String Test (No Synchronization, New Object Created)");
        Thread t1 = new Thread(new StringTask());
        Thread t2 = new Thread(new StringTask());
        t1.start();
        t2.start();

        try { t1.join(); t2.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("\nRunning StringBuilder Test (No Synchronization, Possible Race Condition)");
        Thread t3 = new Thread(new StringBuilderTask());
        Thread t4 = new Thread(new StringBuilderTask());
        t3.start();
        t4.start();

        try { t3.join(); t4.join(); } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("\nRunning StringBuffer Test (Thread-Safe, Synchronized)");
        Thread t5 = new Thread(new StringBufferTask());
        Thread t6 = new Thread(new StringBufferTask());
        t5.start();
        t6.start();
    }
}

