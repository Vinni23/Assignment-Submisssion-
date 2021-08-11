import java.util.Scanner;
class Student{
    int roll;
    String name;
    float marks;
    
    void input()
    {  
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Student Name : ");
       name = sc.nextLine();
       System.out.print("Enter the Student Roll no : ");
       roll = sc.nextInt();
       System.out.print("Enter the Student Marks: ");
       marks = sc.nextFloat();   
    }
    void display()
    {
      System.out.println("Roll No:-  " +roll);
      System.out.println("Name:-  " +name);
      System.out.println("Marks:-  " +marks);
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.display();
    }
}