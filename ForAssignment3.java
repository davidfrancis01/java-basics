import java.util.*;
public class ForAssignment3{
    public static void main(String args[]){
        ForAssignment3.divisibleBySeven();

    }

    public static void divisibleBySeven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till how many you want :");
        int num = sc.nextInt();
        for(int i=150;i<=num;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }

    }
}