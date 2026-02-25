import java.util.*;
public class ProductOfNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a':");
        int a= sc.nextInt();
        System.out.print("Enter the value of 'b':");
        int b = sc.nextInt();
        System.out.print("Product of 'a & b':"+product(a, b));//arguments are (a,b)

    }
    public static int product(int a,int b){//parameters are (int a,int b)
        int product = a*b;
        return product;
    }
}
