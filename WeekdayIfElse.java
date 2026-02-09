import java.util.*;
public class WeekdayIfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's weekday: ");
        String weekday = sc.nextLine();
        if(weekday.equals("monday")||weekday.equals("tuesday")||weekday.equals("wednesday")||weekday.equals("thrusday")||weekday.equals("friday")){
            System.out.println("ohhh! It's not a weekend ");
        }
        else if (weekday.equals("saturday") || weekday.equals("sunday")){
            System.out.println("Yayyy! It's a weekend!");
        }
        else{
            System.out.println("it's not a weekday ");
        }
    }
}