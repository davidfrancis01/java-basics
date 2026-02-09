import java.util.*;
public class PosOrNegSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num =sc.nextInt();
        int x;
        if(num<0){
            x=-1;
        }else if(num>0){
            x =1;
        }else {
            x=0;
        }
        switch(x){
            case 0:System.out.println("it is a zero ");
            break;
            case -1:System.out.println("it is a negative number ");
            break;
            case 1:System.out.println("it is a positive number ");
            break;
            default:System.out.println("it is not a number ");
            break;
        }
    }
    
}
