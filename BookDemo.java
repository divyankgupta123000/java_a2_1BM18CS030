import java.util.*;

class Book
{
  String name;
  String author;
  double price;
  int num_page;
  
  Book()
  { 
    name="";
    author="";
    price=0;
    num_page=0;
  }

  void set()
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Book's Name: ");
    name=sc.nextLine();
    System.out.println("Enter Author's Name: ");
    author=sc.nextLine();
    System.out.println("Enter Book's Price: ");
    price=sc.nextDouble();
    System.out.println("Enter No. of Pages: ");
    num_page=sc.nextInt();
  }

  void get()
  {
    System.out.println("\n\nBook's Name: " + name + "\nAuthor's Name:" + author + "\nBook's Price: " + price + "\nNo. of Pages:" + num_page);
  }

  public String toString()
  { 
   String s="\n\nBook's Name: " + name + "\nAuthor's Name:" + author + "\nBook's Price: " + price + "\nNo. of Pages:" + num_page;
   return s;  
  }

}


class BookDemo
{
 
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter total no. of Books: ");
    int n=sc.nextInt();
    Book ob=new Book();
    Book b[]=new Book[n];
    for(int i=0;i<n;i++)
    {
      b[i]=new Book();
      b[i].set();    
    }
    for(int i=0;i<n;i++)
      b[i].get();     
    System.out.println(ob);
 }
}

/*Enter total no. of Books: 
1
Enter Book's Name: 
C
Enter Author's Name: 
YK
Enter Book's Price: 
548
Enter No. of Pages: 
678


Book's Name: C
Author's Name:YK
Book's Price: 548.0
No. of Pages:678


Book's Name: 
Author's Name:
Book's Price: 0.0
No. of Pages:0
*/
