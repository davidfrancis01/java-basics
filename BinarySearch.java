import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = {2,4,6,8,450,12,14};
        System.out.print("Enter the key from the array list:");
        int key = sc.nextInt();
        BinarySearch.binarySearch(num,key);
    }

    public static void binarySearch(int num[],int key){
        int start =0;
        int end = num.length-1;
        // int mid = (start+end)/2;
        while(start<=end){
            int mid = (start+end)/2;
            if(key==num[mid]){
                System.out.println("key is found :"+num[mid]+"\nIn index :"+mid);
                return;
            }else if(key<num[mid]){
                end=mid-1;
                
            }else{
                start=mid+1;
                //end= num.length-1;
                //mid= (start+end)/2;
    
            }
        }
        System.out.println("Key is not in the array list");
    }
}