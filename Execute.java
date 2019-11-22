class Q
{
  int m;
  boolean valueset=false;
  synchronized int get()
  {
    try
    {
     while(!valueset) 
       wait();
    }  
    catch(InterruptedException e)
    {
      System.out.println("Interrupted");
    }
    System.out.println("Get"+m);
    valueset=false;
    notify();
    return m;
  }

 synchronized void put(int a)
 {
    try
    {
      while(valueset)
        wait();      
    }
    catch(InterruptedException e)
    {
      System.out.println(e);
    }
      this.m=a;
      valueset=true;
      System.out.println("Put" +m);
      notify();
 }     
}

class Producer implements Runnable
{
  Q q;
  Producer(Q q)
  {
    this.q=q;
    new Thread(this,"Producer").start();
  }
  
  public void run()
  {
    int i=-999;
    while(true)
     q.put(i++);
  }
}

class Consumer implements Runnable
{
  Q q;
  Consumer(Q q)
  {
    this.q=q;
    new Thread(this,"Consumer").start();
  }
  
  public void run()
  {
    while(true)
     q.get();
  }
}

class Execute
{
  public static void main(String args[])
  {
    Q q=new Q();
    new Producer(q);
    new Consumer(q);
  }
}

