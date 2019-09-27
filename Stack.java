import java.util.*;

interface Stacked
{ 
  void push(int item);
  int pop();
  void display();
}


class DynamicStack implements Stacked
{
  int top=-1;
  int size=10;
  int stk[];

  public void push(int item)
  {
    stk=new int[size];
    
    if(top==size-1)
    {
      size=size*2;
      int temp[]=new int[size];
      for(int i=0;i<stk.length;i++)
       temp[i]=stk[i];    
      stk=temp;
      stk[++top]=item;
    }
    

    else
     stk[++top]=item;
  }
 
  
  public int pop()
  {
    int ele;
    
    if(top==-1)
     {
       System.out.println("Stack Underflow");
       return -9999;
     }
      
    else
     {   
       ele=stk[top--];

       return ele;
     }
  }

  
  public void display()
  {
    if(top==-1)
    {
      System.out.println("Stack is Empty");
    }
    
    else
    {
      for(int i=top;i>=0;i--)
       System.out.println(stk[i] + " ");
    }
  }
}


class Stack
{
  public static void main(String args[])
  {
    int item,choice;
    Stacked ref=null;
    ref=new DynamicStack();
    Scanner sc=new Scanner(System.in);
    do
    {
      System.out.println("Enter your choice: (1)Push (2)Pop (3)Display (4)Exit");
      choice=sc.nextInt();
      switch(choice) 
      {
        case 1: System.out.println("Enter the element to be pushed");
                item=sc.nextInt();
                ref.push(item);
                break;
         
        case 2: item=ref.pop();
                System.out.println("Deleted Element: " + item);
                break;
 
        case 3: ref.display();
                break;
 
        case 4: System.exit(0);
 
        default: break;
      }
    }while(choice!=4);
  }
}
