import java.util.*;
public class ForAssignment1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum +=i;
            System.out.print(i+" ");
        }
        System.out.println("Your Total Sum :"+sum);

    }
    
}
