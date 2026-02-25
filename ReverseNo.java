import java.util.*;
public class ReverseNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse_no =0;
        /*while(number>0){
            reverse_no = number%10;
            System.out.print(reverse_no);
            number = number/10;
        }*/
        while(number>0){
            int last_digit = number%10;
            reverse_no = reverse_no*10 + last_digit;
            number = number/10;
        }
        System.out.println("Yours Reverse number :"+reverse_no);
    }
}