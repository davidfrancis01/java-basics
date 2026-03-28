import java.util.*;
public class ArmStrongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        // if(armstrong(number)){
        //     System.out.println("It is Armstrong Number ");
        // }else {
        //     System.out.println("It is not Armstrong Number ");
        // }
        armStrongNumbers(number);
        //armStrong(number);
    }

    // public static void armStrong(int number){
    //     int lastDigit=0;
    //     int orginalNumber = number;
    //     int temp = number;
    //     int digits = 0;
    //     double result = 0;
    //     double sum =0;
    //     while(temp>0){
    //         temp = temp/10;
    //         digits++;
    //     }
    //     while(number>0){
    //         lastDigit = number%10;
    //         result = (int)Math.pow(lastDigit,digits);
    //         number = number/10;
    //         sum +=result;
    //     }
    //     if(sum==orginalNumber){
    //         System.out.println(orginalNumber+" is ArmStrong Number ");
    //     }else{
    //         System.out.println(orginalNumber+" is not ArmStrong Number ");
    //     }
        
    // }

    public static boolean armstrong(int number){
        boolean isArmstrong = false;
        int lastdigit = 0;
        int orginal = number;
        int temp = number;
        int count = 0;
        int result = 0;
        int sum = 0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(number>0){
            lastdigit = number%10;
            result = power(lastdigit,count);//(int) Math.pow(lastdigit,count);
            sum = result+sum;
            number=number/10;
        }
        if(sum==orginal){
            return  true;
        }
        return isArmstrong;
    }
    
    public static int power(int base,int exp){
        int result = 1;
        for(int i = 1;i<=exp;i++){
            result=result*base;
        }
        return result;
    }
    
    //for printing armstrong numbers
    public static void armStrongNumbers(int number){
        int last = 0;
        int i =1;
        int orginal = i;
        int temp = i;
        int result =0;
        int count=0;
        while (temp>0){
            count++;
            temp = temp/10;
        }
        for( i=1;i<=i;i++){
            boolean isArmstrong = true;
            while(i>0){
                last = i%10;
                result = power(last,count)+result;
                i=i/10;
                if(orginal==result){
                    System.out.print(result+" ");
                }
            }

        }
        
    }
}