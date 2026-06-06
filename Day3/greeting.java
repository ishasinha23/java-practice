import java.util.*;
public class greeting {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter button (1-3)");
    System.out.println("Enter 1 to print Hello");
    System.out.println("Enter 2 to print Namaste");
    System.out.println("Enter 3 to print Bonjour");
    System.out.println("choose any one number:");
    int button=sc.nextInt();
    switch(button)  {
      case 1: System.out.println("Hello");
        break;
      case 2: System.out.println("Namaste");
        break;
      case 3: System.out.println("Bonjour");
        break;
      default: System.outprintln("Invalid button");
    }
  }
}
