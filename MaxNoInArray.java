public class MaxNoInArray{
    public static void main(String args[]){
        int num[]={2,5,1,9,6,78};
        int maxNum = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<=num.length-1;i++){
            if(num[i]>maxNum){
                maxNum=num[i];
                index=i;
            }
        }
        System.out.println("Maximum Number in Array :"+maxNum+"\nIndex :"+index);
    }
}