import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();

        System.out.println(palindromeNumber(number));

    }

    public static int palindromeNumber (int number){
        int orginal = number;
        int palindrome_no = 0;
        int lastDigit = 0;
        boolean isPalindrome = true;
        while(number>0){
            lastDigit = number%10;
            palindrome_no = (palindrome_no*10)+lastDigit ;
            number=number/10;
        }
        if(orginal == palindrome_no){
            System.out.print("it is palindrome number :");
        }else{
            System.out.print("it's not a palindrome number :");
        }
        return palindrome_no;
        
    }
}
