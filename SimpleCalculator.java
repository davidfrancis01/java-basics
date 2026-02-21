import java.util.*;
public class SimpleCalculator{
    public static void main(String args[]){

        int a = 2;
        int b = 4;

        System.out.println("Enter any Operator: ");
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();
        switch(operator){
            case "+": System.out.println(a+b);
            break;
            case"-" :System.out.println(a-b);
            break;
            case"*" :System.out.println(a*b);
            break;
            case"/" :
            if(b!=0){
                System.out.println(a/b);
            }else {
                System.out.println("it can't divided by 0");
            }
            break;
            case"%" :System.out.println(a%b);
            break;
            default : System.out.println("invalid Operator");
        }

    }
}