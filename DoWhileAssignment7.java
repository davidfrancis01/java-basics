import java.util.*;
public class DoWhileAssignment7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int z = sc.nextInt();
        int sum=0;
        do{
            if(num%2!=0){
                System.out.println(num);
                sum+=num;
            }num--;
        }while(num>=z);
        System.out.println("Total sum :"+sum);
    }
}