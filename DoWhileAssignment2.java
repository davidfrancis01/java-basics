public class DoWhileAssignment2{
    public static void main(String args[]){
        int num = 200;
        do{
            if(num%2==0){
                System.out.print(num+" ");
            }
            num++;
        }while(num<=500);
    }
}