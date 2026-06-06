import java.util.*;
public class checkNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value in a:");
    int a=sc.nextInt();
    System.out.println("Enter the value in b:");
    int b=sc.nextInt();
    if(a==b) {
      System.out.println("a is euale to b");
    }
    else if(a>b) {
      System.out.println("a is greater than b");
    }
    else {
      System.out.println("a is lesser than b");
    }
  }
}
