import java.util.*;
public class CountDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long count =0;
        while(number>0){
            number = number/10;
            count++;
        }
        System.out.print("Total no.of digits : "+count);
    }
}
