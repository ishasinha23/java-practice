import java.util.*;
public class oddEven {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value in x:");
    int x=sc.nextInt();
    if(x%2==0) {
      System.out.println("even number");
    }
    else {
      System.out.println("odd number");
    }
  }
}
