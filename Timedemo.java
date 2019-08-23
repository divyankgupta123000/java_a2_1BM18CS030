import java.util.*;

class Time
{
  int h,m,s;
  Time()
  {
      h=0;
      m=0;
      s=0;
  }
  
  Time(int a,int b,int c)
  {
    h=a;
    m=b;
    s=c;
  }
  
  void current_time(int a,int b,int c)
  {
    h=a; 
    m=b; 
    s=c;
  }
  
  void advance_time(int hr,int min,int sec)
  {
    h+=hr;
    m+=min;
    s+=sec;
    if(s>=60)
     {
       m+=s/60;
       s=s%60;
     }  
    else if(m>=60)
     {
       h+=m/60;
       m=m%60;
     }   
    else if(h>=24)
        h=h/24;  
  }
  
  void display()
  {
    System.out.println("Time: ");
    System.out.println(h+":"+m+":"+s);
  }
}


class Timedemo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
     System.out.println("enter 1 for current time and 2 for advanced time");
     int n=sc.nextInt();
     switch(n)
     {
      case 1: Time a=new Time();
              System.out.println("Enter Hour:Minutes:Seconds");
              int hh=sc.nextInt();
              int mm=sc.nextInt();
              int ss=sc.nextInt();
              a.current_time(hh,mm,ss);
              a.display();
              break;
      
      case 2: Time b=new Time();
              System.out.println("Enter Hour:Minutes:Seconds");
              int hr=sc.nextInt();
              int min=sc.nextInt();
              int sec=sc.nextInt();
              b.advance_time(hr,min,sec);
              b.display();
              
      case 3: System.out.println("Invalid Input"); 
                  
     }
    }
  }
}
