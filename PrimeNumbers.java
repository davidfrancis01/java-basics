import java.util.*;
public class PrimeNumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        long number = sc.nextLong();
        int count = 0,sum =0;
        for(int i= 2;i<=number ;i++){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                count++;
                sum+=i;
                System.out.print(i+" \n");
                
            }
            
        }
        System.out.println("No.of Prime numbers :"+count);
        System.out.println("Sum of Prime numbers :"+sum);
    }
}
