import java.util.*;
public class AvgOfMarks {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int mathsMarks = sc.nextInt();
    int phyMarks = sc.nextInt();
    int socMarks = sc.nextInt();

    int total_Marks = mathsMarks+phyMarks+socMarks;

    System.out.println("Average of the Marks :"+total_Marks/3);

    }
    
    
}
