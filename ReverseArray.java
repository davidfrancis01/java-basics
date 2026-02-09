public class ReverseArray{
    public static void main(String arggs[]){
        int numbers[]={2,4,5,6,44,32};
        int first =0;
        int last =numbers.length-1;

        System.out.print("Given Array :");
        //for loop for printing the array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        //  //direct for loop for reverse array 
        // for(int i=numbers.length-1;i>=0;i--){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();

        ReverseArray reverse =new ReverseArray();
        reverse.reverseTheArray(numbers,first,last);
        
        System.out.print("Reversed Array :");
        //for loop for printing the reversed array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    //method for reverse Array
    public void reverseTheArray(int numbers[],int first,int last){
        while(first<last){
            int temp = numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }


    }
}