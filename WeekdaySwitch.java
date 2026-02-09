import java.util.*;
public class WeekdaySwitch{
    public static void main(String args[]){
        WeekdaySwitch.weekendOrNot();

    }

    public static void weekendOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's weekday :");
        String weekday =sc.nextLine();
        switch(weekday){
            case "monday" :System.out.println("Uff, It's a Weekday");
            break;
            case "tuesday":System.out.println("Uff, It's a Weekday");
            break;
            case "wednesday":System.out.println("Uff, It's a Weekday");
            break;
            case "thrusday":System.out.println("Uff, It's a Weekday");
            break;
            case "friday":System.out.println("Uff, It's a Weekday");
            break;
            case "saturday":System.out.println("Yayy! It's a Weekend");
            break;
            case "sunday":System.out.println("Yayy! It's a Weekend");
            break;
            default:System.out.println("Sorry, It's not a weekday");
        }

    }
}