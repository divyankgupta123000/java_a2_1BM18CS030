import java.util.*;

class Father
{
  int fage;
  Father(int age) throws WrongAge
  {
    fage=age;
    if(fage<=21)
    {
     throw new WrongAge("Invalid Age");
    }
  }
}

class Son extends Father
{
  int sage;
  Son(int age) throws WrongAge
  {
    sage=age;
    if(sage<=0 || fage-sage<21)
    {
     throw new WrongAge("Invalid Age");
    }
  }

} 

class WrongAge extends Exception
{
  String s;
  WrongAge(String n)
  {
    s=n;
  }
  public String toString()
  { 
    return s;
  }
}

class Except
{
  public static void main(String args[])
  {
    int agef,ages; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Father's Age: "); 
    agef=sc.nextInt();
    try
    {
      Father f=new Father(agef);
    }
    catch(WrongAge w)
    {
      System.out.println(w);
    }    
    
    System.out.println("Enter Son's Age: "); 
    ages=sc.nextInt();
    try
    {
      Son s=new Son(ages);
    }
    catch(WrongAge w)
    {
      System.out.println(w);
    }
  }
}    
