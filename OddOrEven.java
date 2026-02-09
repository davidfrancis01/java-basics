import java.util.*;
public class OddOrEven{
    public static void main(String args[]){
        OddOrEven Oe =new OddOrEven();
        Oe.oddOrEven();

    }

    public void oddOrEven(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("the given number is Even Number");
        }else{
            System.out.println("the given number is Odd Number");
        }
    }
}