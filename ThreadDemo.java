import java.util.*;

class T1 implements Runnable
{
  Thread t;
  T1()
  {
    t=new Thread(this,"A");
    t.start();
  }

  public void run()
  {
    while(true)
    {
       System.out.println("BMSCE"); 
       try
       {
          Thread.sleep(10000);
       }
       catch(InterruptedException e)
       {
          System.out.println("BMSCE Caught");
       }
    }
  }
}

class T2 implements Runnable
{
  Thread t;
  T2()
  {
    t=new Thread(this,"B");
    t.start();
  }

  public void run()
  {
    while(true)
    {
       System.out.println("CSE"); 
       try
       {
          Thread.sleep(2000);
       }
       catch(InterruptedException e)
       {
          System.out.println("CSE Caught");
       }
    }
  }
}

class ThreadDemo
{
  public static void main(String args[])
  {
     new T1();
     new T2();
  }
}
