import java.util.*;

class Account
{
  double acc_no;
  String cust_name;
  char account;
  final double rate=0.02;
  double balance=1000;
  
  Scanner sc=new Scanner(System.in);

  void input()
  {
    System.out.println("Enter Customer name. & Account no.:"); 
    cust_name=sc.next();
    acc_no=sc.nextDouble();
  }

  void display()
  {
    System.out.println("Customer Name. : "+cust_name+"\nAccount no. : "+acc_no+"\nBalance : "+balance);
  }
  
  void deposit()
  {
    double dep;
    System.out.println("Enter the amount to be deposited:");
    dep=sc.nextDouble();
    balance+=dep; 
  }

  void comp_int(){}
  void withdraw(){}
}

class Savings extends Account 
{
  double withdrawal,interest,time;
  
  void comp_int()
  {
    System.out.println("Enter time for interest calculation: ");
    Scanner sc=new Scanner(System.in);
    time=sc.nextDouble();interest=balance*Math.pow(1+rate,time);
    balance+=interest;
  }

  void withdraw()
  { 
    if(balance<withdrawal)
     System.out.println("Balance not Enough!!");
    else
     balance-=withdrawal;  
  }
 
}

class Current extends Account
{
   void withdraw()
  {
    double withdrawal;
    System.out.println("Enter the amount to withdraw:");
    withdrawal=sc.nextDouble();
    if(balance<withdrawal)
        System.out.println("Balance not Enough!!");
    else
        balance=balance-withdrawal;
    if(balance<1000)
       balance=balance-100;   
  }   
}

class Main
{
   public static void main(String args[])
   {  
  
     Scanner sc=new Scanner(System.in);
     
     Account ref=null;
     Account t=new Account();
     
     System.out.println("Enter the type of account: Savings or Current "); 
     t.account=sc.next().charAt(0);
     if(t.account=='s')
     {
        ref=new Savings();
        ref.input();
        ref.comp_int();
        System.out.println("Enter: (1)Deposit  (2)Withdraw : ");
        int ch=sc.nextInt();
        if(ch==1)
         ref.deposit();
        else if(ch==2)
           ref.withdraw();
        else
           System.out.println("Wrong choice!!");
        ref.display();
     }
     else if(t.account=='c')
     {
        ref=new Current();
        ref.input();
        System.out.println("Enter: (1)Deposit  (2)Withdraw : ");
        int ch=sc.nextInt();
        if(ch==1)
           ref.deposit();
        else if(ch==2)
           ref.withdraw();
        else
           System.out.println("Wrong choice!!");
        ref.display();
     }
   }
}           

















