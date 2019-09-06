import java.util.*;

class Vehicle
{ 
  String model;
  String color;
  int year;
  static int total_vehicle;
  
  Vehicle(String x,String y,int z)
  {
    model=x;
    color=y;
    year=z;
    total_vehicle++;  
  }

  void Output()
  {
      System.out.println("Model: "+model);
      System.out.println("Colour: "+color); 
      System.out.println("Year: "+year);
      System.out.println("Total Vehicle: "+total_vehicle);   
  }

}


class Vehicle_Demo
{
  public static void main(String args[])
  {
    int i;
    System.out.println("Enter the no. of Vehicles: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Vehicle v[]=new Vehicle[n];
    for(i=0;i<n;i++)
    {
      System.out.println("Enter Model,Colour,Year of Manufacture");
      String x=sc.next();
      String y=sc.next();
      int z=sc.nextInt();
      v[i]=new Vehicle(x,y,z);
      System.out.println();
    }
    for(i=0;i<n;i++)
      v[i].Output();  
  }
}  
