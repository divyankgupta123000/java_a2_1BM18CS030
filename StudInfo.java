import java.util.*;
class StudInfo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students and number of subjects");
        int m=sc.nextInt();
        int n=sc.nextInt();
        float arr[][]=new float[m+2][n+2];
        System.out.println("Enter the marks of "+m+" students in "+n+" subjects");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextFloat();
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][n]=arr[i][n]+arr[i][j];
        }
        for(int i=0;i<m;i++)
        {
            arr[i][n+1]=arr[i][n]/n;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                arr[m][j]=arr[m][j]+arr[i][j];
        }
        for(int i=0;i<n;i++)
        {
            arr[m+1][i]=arr[m][i]/m;
        }
        System.out.println("The table is displayed with Total and Average");
        for(int i=0;i<m+2;i++)
        {
            for(int j=0;j<n+2;j++)
            {
                if(i>=m && j>=n)
                    continue;
                else
                    System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}