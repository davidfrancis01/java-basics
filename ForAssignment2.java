
import java.util.*;
public class ForAssignment2{
    public static void main(String args[]){
        ForAssignment2 eN =new ForAssignment2();
        eN.evenNumbers();

    }

    public void evenNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till how many even numbers: ");
        int num=sc.nextInt();
        for(int i=200;i<=num;i++){
            if(i%2==0){
            System.out.print(i+" ");
            }
        }
    }
}