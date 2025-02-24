package v1.Multithreading;


class MyThread extends Thread
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


public class ThreadTest //implements Runnable //extends Thread
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
    
    public static void main(String[] args) {
        
        MyThread t=new MyThread();
        //ThreadTest t=new ThreadTest();
        
        
        t.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
        }
        
    }
    
}