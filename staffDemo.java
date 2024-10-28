import java.util.Scanner;

class staff{
    String staff_id;
    String name;
    String phone;
    String salary;
    Scanner input=new Scanner(System.in);
    
    void read()
    {
        System.out.println("enter staff id");
        staff_id=input.next();
        System.out.println("enter staff name");
        name=input.next();
        System.out.println("enter staff phone");
        phone=input.next();
        System.out.println("enter staff salary");
        salary=input.next();
    
    }
    void display()
    {
        System.out.println(staff_id+"\t"+ name+"\t"+phone+"\t"+salary);
    }
    
}
class teaching extends staff
{
    String domain,publication;
    void read()
    {
     super.read();
     System.out.println("enter domain");
     domain=input.next();
     System.out.println("enter publication");
     publication=input.next();
    }
    void display()
    {
     super.display();
     System.out.println(domain+"\t"+publication);
    }
}
class technical extends staff
{
 String skills;
 void read()
 {
     super.read();
     System.out.println("enter skills");
     skills=input.next();
 }
 void display() {
     super.display();
     System.out.println(skills);
 }
}
class contract extends staff
{
    String period;
    void read()
    {
        super.read();
        System.out.println("enter the period");
        period=input.next();
    }
    void display()
    {
        super.display();
        System.out.println("period");
    }
    
}

public class staffDemo
{
  public static void main(String[]args)
  {
      Scanner input=new Scanner(System.in);
      System.out.println("enter the number of staffs details to be created");
      int n=input.nextInt();
      teaching ts[]=new teaching[n];
      technical tech[]=new technical[n];
      contract c[]=new contract[n];
      for(int i=0;i<n;i++)
      {
          System.out.println("enter the teaching staff info");
          ts[i]=new teaching();
          ts[i].read();
      }
      for(int i=0;i<n;i++)
      {
          System.out.println("enter the technical staff info");
          tech[i]=new technical();
          tech[i].read();
      }
      for(int i=0;i<n;i++)
      {
          System.out.println("enter the contract staff info");
          c[i]=new contract();
          c[i].read();
      }
      System.out.println("\n STAFF DETAILS\n");
      System.out.println("--------teaching satff--------");
      for(int i=0;i<n;i++)
      {
          ts[i].display();
      }
      System.out.println("--------technical satff--------");
      for(int i=0;i<n;i++)
      {
          tech[i].display();
      }
      System.out.println("--------contract satff--------");
      for(int i=0;i<n;i++)
      {
          c[i].display();
      }
      input.close();
      
  }
}
