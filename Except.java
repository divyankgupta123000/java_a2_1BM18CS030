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
  Son(int age, int age1) throws WrongAge
  {
    super(age);
    sage=age1;
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
    System.out.println("Enter Son's Age: "); 
    ages=sc.nextInt();
    try
    {
      Son s=new Son(agef,ages);
    }
    catch(WrongAge w)
    {
      System.out.println(w);
    }
  }
}    
