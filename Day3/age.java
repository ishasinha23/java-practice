import java.util.*;
public claass age {
  public static void main (String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age:");
    int age=sc.nextInt();
    if(age>=18) {
      System.out.println("You're eligible to vote");
    }
    else {
      System.out.println("You're not eligible to vote");
    }
  }
}
