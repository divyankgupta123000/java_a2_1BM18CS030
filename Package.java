import java.util.*;
import CIE.*;
import SEE.External;

class Package
{
 public static void main(String args[])
 {
   int i;
   Scanner sc=new Scanner(System.in);
   Internal s1=new Internal();
   System.out.println("Enter Name: ");
   s1.name=sc.next();
   System.out.println("Enter USN: ");
   s1.usn=sc.next();
   System.out.println("Enter Semester: ");
   s1.sem=sc.nextInt();
   System.out.println("Enter Marks in CIE(5 subjects): "); 
   for(i=0;i<=4;i++)
   { 
     System.out.println("Enter CIE Marks in subject "+(i+1));
     s1.ciemarks[i]=sc.nextDouble();
     System.out.println("CIE Marks in subject "+(i+1)+" "+s1.ciemarks[i]);  
   }
   
   External s2=new External();
   System.out.println("Enter Marks in SEE(5 subjects): "); 
   for(i=0;i<=4;i++)
   { 
     System.out.println("Enter SEE Marks in subject "+(i+1));
     s2.seemarks[i]=sc.nextDouble();
     System.out.println("SEE Marks in subject "+(i+1)+" "+s2.seemarks[i]);
   }
 }
}
