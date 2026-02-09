public class Linear{
    public static void main(String args[]){
        int array []={4,55,35,6,99,30};
        int key = 6;
        // LinearSearch Ls = new LinearSearch();
        Linear.searchTheKey(array,key);
    }

    public static void searchTheKey(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.print("key is found in the array"+"\n In Index :"+i);
                break;
            }else{
                System.out.print("key is not found");
            }
        }

    }

}