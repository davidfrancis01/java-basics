import java.util.*;
public class LargestNo {
    public static void main(String args[]){
        LargestNo.largest();

    }


    public static int largest(){
        Scanner sc = new Scanner(System.in);
        int number1 =sc.nextInt();
        int number2 =sc.nextInt();
        if(number1>number2){
            System.out.println("Largest number is :"+number1);
        }
        else{
            System.out.println("largest number is : "+number2);
        }
        return 0;

    }

    
}
