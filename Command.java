import java.util.*;

class Command
{
  public static void main(String args[])
  {
    int large=Integer.parseInt(args[0]);
    for(int i=1;i<args.length;i++)
     {
      if(large<Integer.parseInt(args[i])) 
        large=Integer.parseInt(args[i]);
     }
    
    System.out.println("Large: "+large);
  }
}  
