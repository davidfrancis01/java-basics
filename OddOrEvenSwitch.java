import java.util.*;
public class OddOrEvenSwitch{
    public static void main(String args[]){
        OddOrEvenSwitch.oddOrEven();

    }


    //checking  number is odd or even by using switch case method
    public static void oddOrEven(){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int remainder = number%2;
        switch(remainder){
            case 0: System.out.println("it is a even number ");
            break;
            case -1:
            case 1: System.out.println("it is a odd number ");
            break;
            default: System.out.println("it is invalid number ");
        }
            
    } 
}