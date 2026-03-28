import java.util.*;
public class Patterns{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' :");
        int n = sc.nextInt();
        // System.out.print("Enter the value of 'm' :");
        // int m = sc.nextInt();
        // squarePattern(n);
        // trianglePattern(n);
        reverseTriangle(n);
    }
    public static void squarePattern(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void trianglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }            
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}