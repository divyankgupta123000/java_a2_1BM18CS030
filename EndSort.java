import java.util.*;

 // Check Examples

 // Compiler version JDK 11.0.2

 class EndSort
 {
 	public static void main(String args[])
 	{ 
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int l[]=new int[5];
		int i;
		
		System.out.println("Enter a 5 digit number");
 	  Scanner sc=new Scanner(System.in);
 	  for(i=0;i<5;i++)
 	   a[i]=sc.nextInt();
 	   
 	  l[0]=a[0];
 	  for(i=1;i<5;i++)
 	   {
    		if(l[0]<a[i])
    		{
    	    l[0]=a[i];
    		 b[0]=i;
    		 c[i]=l[0];
    		}
    	}
    	
 	  l[1]=a[0];
 	  for(i=1;i<5;i++)
 	   {
    		if(l[1]<a[i] && l[1]<l[0])
    		{
    	    l[1]=a[i];
    		 b[1]=i;
    		 c[i]=l[1];
    		}
    	}
    	
 	  l[2]=a[0];
 	  for(i=1;i<5;i++)
 	   {
    		if(l[2]<a[i] && l[2]<l[1])
    		{
    	    l[2]=a[i];
    		 b[2]=i;
    		 c[i]=l[2];
     	  }
    	} 
    	
      l[3]=a[0];
      for(i=1;i<5;i++)
 	   {
    		if(l[3]<a[i] && l[3]<l[2])
    		{
    	    l[3]=a[i];
    		 b[3]=i;
    		 c[i]=l[3];
    		}
       }
       
      l[4]=a[0];
      for(i=1;i<5;i++)
 	   {
    		if(l[4]<a[i] && l[4]<l[3])
    		{
    	    l[4]=a[i];
    		 b[4]=i;
    		 c[i]=l[4];
    		}
       }
       
       for(i=0;i<5;i++)
        System.out.print(c[i] + " ");
       System.out.println();
       
       if(b[0]<b[1] && b[1]<b[2] && b[2]<b[3] && b[3]<b[4])
        System.out.println("Ans(Min. Steps): "+ 0);
       else if(b[0]<b[1] && b[1]<b[2] && b[2]<b[3] && b[3]>b[4])
        System.out.println("Ans(Min. Steps): "+ 1);
       else if(b[0]<b[1] && b[1]<b[2] && b[2]>b[3])
        System.out.println("Ans(Min. Steps): "+ 2);
       else if(b[0]<b[1] && b[1]>b[2])
        System.out.println("Ans(Min. Steps): "+ 3);
       else
        System.out.println("Ans(Min. Steps): "+ 4);
 	}
 }