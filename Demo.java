import java.util.*;

class Account
{
  String name;
  int cs_no;
  int balance;

  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name, Costumer No. and Balance");
    name=sc.next();
    cs_no=sc.nextInt();
    balance=sc.nextInt();
  }

  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("Costumer No.: "+cs_no);
    System.out.println("Balance: "+balance);
  }
}

class Savings extends Account
{
  float rate;
  int time;
  
  void input()
  {
    super.input();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Rate & Time: ");
    rate=sc.nextInt();
    time=sc.nextInt();
  }

  void display()
  {
    super.display();
  }

  float compute()
  {
    return (balance*time*rate)/100 ;
  }
}

class Demo
{
  public static void main(String args[])
  {
    Savings sc=new Savings();
    sc.input();
    System.out.println();
    sc.display();
    System.out.println(sc.compute());
  }
}
