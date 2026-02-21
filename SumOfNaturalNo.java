import java.util.*;
public class SumOfNaturalNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=numbers;i++){
            sum+=i;
        }
        System.out.println("Total Sum : "+sum);
    }
}