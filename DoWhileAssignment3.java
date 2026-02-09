public class DoWhileAssignment3{
    public static void main(String args[]){
        int num = 150;
        do{
            if(num%7==0){
                System.out.print(num+" ");
            }num++;
        }while(num<=200);
    }
}