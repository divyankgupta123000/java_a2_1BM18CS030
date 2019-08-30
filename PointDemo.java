import java.util.*;

class Point
{
  double x;
  double y;
  
  Point()
  { 
    x=0;
    y=0;
  }

  Point(int a,int b)
  {
    
  }

}


class PointDemo
{
 
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter total no. of Points: ");
    int n=sc.nextInt();
    Point p[]=new Point[n];
    for(int i=0;i<n;i++)
    {
      p[i]=new Point();    
    }

    for(int i=0;i<n;i++)
    {
     System.out.println("Enter Abscissa: ");
     x=sc.nextDouble();
     System.out.println("Enter Ordinate: ");
     y=sc.nextDouble();
    }
 }
}


