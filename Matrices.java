import java.util.*;
class Matrices
{
 public static void main(String args[])
  {
    System.out.println("Enter no. of rows & column for Matrix A:");
    
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
 
    int arr1[][] = new int[r1][c1];
    int arr2[][] = new int[r2][c2];
    int arr3[][] = new int[r1][c1];
    int arr4[][] = new int[r1][c1];

    System.out.println("Enter array elements of Matrix A(row-wise):");
    
    for(int i=0;i<r1;i++)
     {
       for(int j=0;j<c1;j++)
        arr1[i][j] = sc.nextInt();
     } 

   
    System.out.println("Enter array elements of Matrix B(row-wise):");
    for(int i=0;i<r2;i++)
     {
       for(int j=0;j<c2;j++)
        arr2[i][j] = sc.nextInt();
     } 

     
     if(r1==r2 && c1==c2)
      {
        
        System.out.println("Addition = \n");
   
        for(int i=0;i<r1;i++)
         {
           for(int j=0;j<c1;j++)
            {
              arr3[i][j] = arr1[i][j]+arr2[i][j];
              System.out.print(arr3[i][j]+"\t");
            }  
           System.out.println("\n");
         }


        System.out.println("Subtraction = \n");
         
        for(int i=0;i<r1;i++)
         {
           for(int j=0;j<c1;j++)
            {
              arr4[i][j] = arr1[i][j]-arr2[i][j];
              System.out.print(arr4[i][j]+"\t");
            }  
           System.out.println("\n");
         }
        
      }

     else
      System.out.println("Invalid Inputs !!!");
  }

}
 
