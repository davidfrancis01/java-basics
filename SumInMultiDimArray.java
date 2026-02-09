public class SumInMultiDimArray {
    public static void main (String args[]){
        int sum = 0;
        int arr[][] = {{1,8,4},{9,7,2},{7,6,4}};
        SumInMultiDimArray s = new SumInMultiDimArray();
        s.Sum(arr,sum);

    }
    //method for printing the elements in multi dimensional array
    public void Sum(int arr[][],int sum){
        //for loop for printing the sum
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The total sum of the elements in array :"+sum);
    }
    
}
