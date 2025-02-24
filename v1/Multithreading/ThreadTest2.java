package v1.Multithreading;

/*class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}*/

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTest2 {
    
    public static void main(String[] args) throws Exception
    {
        
        MyRunnable t=new MyRunnable();
        // t.setDaemon(true);
        MyRunnable m=new MyRunnable();

        t.start();
        m.start();


        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        //ThreadTest2 t=new ThreadTest22();
        // MyRunnable t=new MyRunnable();
        // Thread th=new Thread(t);
        
        // th.start();
        
        // int i=1;
        // while(true)
        // {
        //     System.out.println(i+"World");
        // }
        
    }
    
}