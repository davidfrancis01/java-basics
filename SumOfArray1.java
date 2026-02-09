public class SumOfArray1 {
    public static void main(String args[]){
        int arr[]={2,5,1,9,6};
        int sum =0;
        for(int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        // int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.print("sum of the integers :");
        System.out.println(sum);
    }
    
}
