import java.util.*;
public class SimpleCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number1 :");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int number2 = sc.nextInt();

        System.out.print("Enter a operator from this (+,-,/,*,%) : ");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':System.out.println(number1+number2);
            break;
            case '-':System.out.println(number1-number2);
            break;
            case '*':System.out.println(number1*number2);
            break;
            case '/':System.out.println(number1/number2);
            break;
            case '%':System.out.println(number1%number2);
            break;
            default:System.out.println("Wrong Operator");
        }

    }
}