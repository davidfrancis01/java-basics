import java.util.*;
public class ArthmeticOperations{
    public static void main(String args[]){
        ArthmeticOperations.operation1();

    }

    public static void operation1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Give a operand which you want to operate: ");
        String operand = sc.next();
        switch (operand) {
            case "+": System.out.println("your Result :"+(firstNumber+secondNumber));
            break;
            case "/": System.out.println("your result :"+(firstNumber/secondNumber)); 
            break;
            case "*": System.out.println("your result :"+(firstNumber*secondNumber));
            break;
            case "-":System.out.println("your result :"+(firstNumber-secondNumber));
            
            case "%":System.out.println("your result :"+(firstNumber%secondNumber));
            break;

            default:System.out.println("you gave a invalid operand, please recheck and give correct one.");
                break;
        }

    }
}