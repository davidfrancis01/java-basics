import java.util.Arrays;
public class MergeTwoArrays{
    public static void main(String args[]){
        String arr1[] = {"chai","coffee"};
        String arr2[] = {"milk","water","coke"};
        String mergeArr[] = new String[arr1.length + arr2.length];
        for(int i=0;i<=arr1.length-1;i++){
            mergeArr[i]=arr1[i];
        } 
        for(int j=0;j<=arr2.length-1;j++){
            mergeArr[arr1.length+j]=arr2[j];
        }
        System.out.println(Arrays.toString(mergeArr));

    }
}