import java.util.*;

abstract class Shape
{
  int a,b;
  abstract void printArea();
}


class Rectangle extends Shape
{
  void printArea()
  {
    System.out.println("Area of Rectangle: " + (a*b));
  }
}


class Triangle extends Shape
{
  void printArea()
  { 
    System.out.println("Area of Triangle: " + (0.5*a*b));
  }
}


class Circle extends Shape
{
  void printArea()
  { 
    System.out.println("Area of Circle: " + (3.14*a*a));
  }
}


class Abstract
{
  public static void main(String args[])
  {
    Shape ref=null;
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
      System.out.println("Enter your choice: (1)Rectangle (2)Triangle (3)Circle (4)Exit");
      choice=sc.nextInt();
      
      switch(choice)
      {
        case 1: ref=new Rectangle();
                System.out.println("Enter length and width: ");
                ref.a=sc.nextInt();
                ref.b=sc.nextInt();
                ref.printArea();
                break;
   
        case 2: ref=new Triangle();
                System.out.println("Enter base and height: ");
                ref.a=sc.nextInt();
                ref.b=sc.nextInt();
                ref.printArea();
                break;

        case 3: ref=new Circle();
                System.out.println("Enter radius: ");
                ref.a=sc.nextInt();
                ref.printArea();
                break;
       
        case 4: System.exit(0);
     
        default: break;
      }
    }while(choice!=4);
  }
}
