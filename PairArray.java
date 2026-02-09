public class PairArray{
    public static void main(String args[]){
        int arr[] = {2,5,6,1,8,7};
        int first = 0;
        int last = arr.length-1;
        // pairingArray(arr,first,last);
        PairArray pa = new PairArray();
        pa.pairingArray2(arr);
    }

    //method for pairing the elements present in array
    public static void pairingArray(int arr[],int first,int last){

        while(first<last){
        for(int i=first+1;i<arr.length;i++){
            System.out.print("("+arr[first]+","+arr[i]+")");
        }
        first++;
        System.out.println();
        }
    }

    public static void pairingArray2(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=i;
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();

        }
    }
}