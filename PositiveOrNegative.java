import java.util.*;
public class PositiveOrNegative {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = sc.nextInt();

        if(number>0){
            System.out.println("It's a positive number");
        }else if (number<0){
            System.out.println("it's a negative number");
        }else if(number==0){
            System.out.println("it's a zero");
        }else{
            System.out.println("it's not a number");
        }
        
    }
}
