import java.util.*;
public class AgeLimits {
    public static void main(String args[]){
        AgeLimits.adultOrNot();

    }

    //condition for Drive ,vote,etc..,
    public static void adultOrNot(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are Adult : You can Drive and You can eligible for Voting");
        }else{
            System.out.println("You are child : you can't vote and can't drive");
        }
    }
    
}
