public class MinStringInArray{
    public static void main(String args[]){
        String arr[]={"coffee","water","chai","diet coke"};
        String minWord = arr[0];
        int minIndex = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].length()<minWord.length()){
                minWord = arr[i];
                minIndex = i;
            }

        }
        System.out.println("minimum word :"+minWord);
        System.out.println("And it's index :"+minIndex);
        

    }
}