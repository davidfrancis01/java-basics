import java.util.*;
public class ForAssignment6{
    public static void main(String args[]){
        ForAssignment6.reverseOddNumbers();

    }


    public static void reverseOddNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till how many you want :");
        int num =sc.nextInt();
        for(int i=200;i>=num;i--){
            if(i%2!=0){
            System.out.print(i+" ");
            }
        }
    }
}