import java.util.*;
class Sort
{
  public static void main(String args[])
  {
    System.out.println("Enter array size:");
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int a[] = new int[n];
    
    System.out.println("Enter array elements:\n");

    for(int i=0;i<n;i++)
       a[i] = sc.nextInt();
    
    for(int i=0;i<n-1;i++)
     {
       for(int j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
           {
             int k = a[j];
             a[j] = a[i];
             a[i] = k;
           }
        }
     }

     System.out.println("Sorted Array is: \n");
      
      for(int i=0;i<n;i++)
         System.out.println(a[i]+"\t");
   }
} 
