import java.util.*;
public class WhileAssignment6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the starting number: ");
        int num =sc.nextInt();
        System.out.print("Enter the last number : ");
        int z = sc.nextInt();
        while(num<=z){
            if(num%2==0){
                sum+=num;
            }
            num++;
        }System.out.println(sum);
    }
}