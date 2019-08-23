import java.util.*;

class Student
{
  String usn,name;
  int subj,cred[],marks[];
  float sgpa;
  
  void Input()
  {
    int total=0;
    System.out.println("Enter Name & USN:");
    Scanner sc=new Scanner(System.in);
    name=sc.next();
    usn=sc.next();
    System.out.println("Enter total no. of subjects:");  
    subj=sc.nextInt();
    cred=new int[subj];
    marks=new int[subj];
    System.out.println("Enter credits & marks respectively:");
    int sum=0;
    for(int i=0;i<subj;i++)
    {
      cred[i]=sc.nextInt();
      marks[i]=sc.nextInt();
      if(marks[i]>=90 && marks[i]<=100)
      sum+=(10*cred[i]);    
      else if(marks[i]>=75 && marks[i]<90) 
      sum+=(9*cred[i]);
      else if(marks[i]>=60 && marks[i]<75) 
      sum+=(8*cred[i]);
      else if(marks[i]>=50 && marks[i]<60)
      sum+=(7*cred[i]);
      else if(marks[i]>=40 && marks[i]<50)
      sum+=(6*cred[i]);
      else
      sum+=(0*cred[i]);
      total+=cred[i];
      System.out.println();
    }    
  sgpa=sum/total;
}
  
 
 void Display()
  {
    
    System.out.println("Name of student: "+name+"\n USN of student:"+usn+"\nSGPA= "+sgpa);
  }


}


class StudentDemo
{
  public static void main(String args[])
  {
    Student s1=new Student(); 
    s1.Input();       
    s1.Display();
  }
}
