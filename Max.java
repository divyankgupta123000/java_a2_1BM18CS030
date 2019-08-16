import java.util.*;
class Max
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the row size of array:");
  int r=sc.nextInt();
  System.out.println("Enter the column size of array:");
  int c=sc.nextInt();
  int p=c*r;
  int max=0;
  int arr[][]=new int[r][c];
  System.out.println("Enter the 2-d array elements("+p+")");
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {  
    arr[i][j]=sc.nextInt();
   }
  }
  for(int a[]:arr)
  {
   for(int x:a) 
   {
    if(x>max)
      max=x;
   }
  }
 System.out.println("Max element is:"+max);
 }
}
