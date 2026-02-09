import java.util.*;
public class WhileAssignment5{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true; // Assume number is prime
        int i = 2;

        if (n <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Check divisibility using while loop
            while (i * i <= n) { // Loop till square root of n
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}