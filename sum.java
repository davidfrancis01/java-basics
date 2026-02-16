import java.util.*;
public class sum {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the value of a : ");
      int a = sc.nextInt();
      System.out.print("enter the value of b : ");
      int b = sc.nextInt();
      int sum = a+b;
      int sub = a-b;
      int mod=a%b;
      System.out.println("SUM ="+sum);
      System.out.println("SUB = "+sub);
      System.out.println("Remainder = "+mod);
   }
}