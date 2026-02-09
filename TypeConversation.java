public class TypeConversation {
    //main method 
    public static void main(String args[]){
        TypeConversation.typeCastingUp();
        TypeConversation type = new TypeConversation();
        type.typeCastingDown();
    }



    //widening or implicit convertion or type casting or type promotion
    //it happens automatically by the compiler when converting a smaller data type into a larger one ex:int ---> long
    public static void typeCastingUp(){
        int number = 12;
        //converting from int to float
        float id = number;
        //order of widening : byte --> short-->int-->long-->float-->double
        System.out.println(id);
    }


    //narrowing or explicit conversion or type casting down
    //it is performed manually by the programmer using a cast operator (type).
    //by this we can loss the data
    public void typeCastingDown(){
        double num = 989.78;
        //converting from double to Int
        int x =(int)num;
        System.out.println(x);
    }

    
}
