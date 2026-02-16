import java.util.*;
public class LeapYear {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("It's a Leap Year");
        }else if (year%100!=0 && year%4==0 ){
            System.out.println("it's a Leap Year");
        }else{
            System.out.println("It's not a Leap Year");
        }

    }
}

/*if(year%4==0){
    System.out.println("it's a leap year");
  }else if(year%100==0){
  System.out.println("it's a not a leap year");
  }else if(year%400==0){
  System.out.println("it's a leap year");
  }else 
    System.out.println("it's a not leap year");*/