public class TypePromotion {
    public static void main(String args[]){
        char x='a';
        char y ='b';
        //automatically promtes byte , char ,short operants to int when evaluating an expression
        System.out.println((int)(x));
        System.out.println((float)(y));
        System.out.println((int)(y-x));
    }
    
}
