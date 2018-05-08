import java.util.Scanner;
public class HelloJava {

 public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter your name");
   String name = input.next();
    System.out.println("Enter your age");
   int age = input.nextInt();
    System.out.println("Enter your hight");
   double hight = input.nextDouble();
   System.out.println("Enter your gender");
  boolean gender = input.nextBoolean();

   System.out.println("Name: "+name);
   System.out.println("Age: "+age);
   System.out.println("Hight: "+hight);
   System.out.println("Gender: "+gender);

  //  System.out.print("Welcome \" to java app\"");
  //  System.out.println("This is in new line");
}

}
