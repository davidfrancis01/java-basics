import java.util.*;
public class WhileAssignment7{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the staring number :");
    int num=sc.nextInt();
    System.out.print("Enter till how many you want :");
    int z = sc.nextInt();
    int sum =0;
    while(num>=z){
        if(num%2!=0){
        System.out.println(num);
        sum+=num;
        }
        num--;
    }
    System.out.println("Total Sum is :"+sum);
    }
}