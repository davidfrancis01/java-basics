import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int reverseNumber =0;
        while(num>0){
             int remainder =num%10;
             reverseNumber=reverseNumber*1+remainder;

            // System.out.print(remainder);
            num /=10;
        }
        System.out.println(reverseNumber);
    }
    
}
