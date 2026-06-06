import java.util.*;
public class Calculator {
  public static void main(String[] args) {
    Scanner sc-new Scanner(System.in);
    System.out.println("Enter the value in a:");
    int a=sc.nextInt();
    System.out.println("Enter the value in b:");
    int b=sc.nextInt();
    System.out.println("Enter any number to perform arthematic operations on a & b:");
    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Module");
    System.out.println("choose between 1-5 to perform any operations:");
    int button=sc.nextInt();
    switch(button) {
      case 1: System.out.println("result = "+ (a+b));
        break;
      case 2: System.out.println("result ="+ (a-b));
        break;
      case 3: System.out.println("result ="+ (a*b));
        break;
      case 4: if (b!=0) {
        System.out.println("result ="+(a/b));
      }
        else {
          System.out.println("Cannot divided by zero");
        }
        break;
      case 5: System.out.println("result ="+ (a%b));
        break;
      default: System.out.println("Invalid choice");
    }
  }
}
