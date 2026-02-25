import java.util.*;
public class PrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int prime_no = sc.nextInt();
        boolean prime = true;
        if(prime_no==2){
            System.out.println("It is a prime number ");
        }else{
            
            for (int i =2 ;i<=Math.sqrt(prime_no);i++){
                if(prime_no%i==0){
                    prime = false;
                }
            }
            
        }
        if(prime == true ){
            System.out.println("It is a prime number ");
        }else{
            System.out.println("it is not a prime number");
        }
    }
}
