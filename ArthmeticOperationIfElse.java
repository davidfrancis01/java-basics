import java.util.*;
public class ArthmeticOperationIfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int secondNum = sc.nextInt();
        System.out.println("Enter the operand which you want to perform :");
        String operand =sc.next();
        if(operand.equals("+")){
            System.out.println("your result : "+(firstNum+secondNum));
        }else if (operand.equals("-")){
            System.out.println("your result : "+(firstNum-secondNum));
        }else if(operand.equals("*")){
            System.out.println("your result :"+(firstNum*secondNum));
        }else if(operand.equals("%")){
            System.out.println("your result :"+(firstNum%secondNum));
        }else if(operand.equals("/")){
            System.out.println("your result :"+(firstNum/secondNum));
        }else{
            System.out.println("you entered the wrong operation ");
        }
    }
}