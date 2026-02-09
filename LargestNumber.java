public class LargestNumber{
    int maxNum =Integer.MIN_VALUE;
    public static void main(String args[]){
        int numbers[] = {2,7,43,0,67,1,77};
        int maxNum =Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int maxNoIndex =-1;
        int minNoIndex = -1;
        findLargestNo(numbers,maxNum,minNum,maxNoIndex,minNoIndex);

    }

    public static void findLargestNo(int numbers[],int maxNum,int minNum,int maxNoIndex,int minNoIndex){
        for(int i =0;i<numbers.length;i++){
            if(maxNum<numbers[i]){
                maxNum=numbers[i];
                maxNoIndex = i;
            }
            if(minNum>numbers[i]){
                minNum=numbers[i];
                minNoIndex = i;
            }

        }
        System.out.println("largest No :"+maxNum);
        System.out.println("largest no Index :"+maxNoIndex);
        System.out.println("Smallest no :"+minNum);
        System.out.println("smallest no index :"+minNoIndex);

    }
}