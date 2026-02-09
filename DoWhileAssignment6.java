import java.util.*;
public class DoWhileAssignment6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number :");
        int num=sc.nextInt();
        System.out.print("Enter the end number : ");
        int z = sc.nextInt();
        int sum =0;
        do{
            if(num%2==0){
            sum+=num;
            }num++;
        }while(num<=z);
        System.out.println(sum);

    }
}