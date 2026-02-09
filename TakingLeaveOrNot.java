import java.util.*;
public class TakingLeaveOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your body temperature:");
        int temperature =sc.nextInt();
        int x;
        if(temperature<100){
            x =1;

        }else{
            x=2;
        }
        switch(x){
            case 1:System.out.println("you don't have a fever, so you should go to college");
            break;
            case 2:System.out.println("you having a high temperature , so take leave today");
            break;
            default:System.out.println("sorry, you have not entered your temperature");
        }
    }
}