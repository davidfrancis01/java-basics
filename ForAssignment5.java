import java.util.*;
public class ForAssignment5{
    public static void main(String args[]){
        ForAssignment5.sumOfEvenNO();

    }


    public static void sumOfEvenNO(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number till how many you want :");
        int num =sc.nextInt();
        int sum =0;
        for(int i=40;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }System.out.println("Total Sum :"+sum);
    }
}