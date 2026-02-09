public class dataTypes {
    //main method
    public static void main(String args[]){
        dataTypes dT= new dataTypes();
        dT.primitiveDataTypes();
        dT.nonprimitive();

    }

    //primitive DataTypes
    public void primitiveDataTypes(){
        byte s=2;
        short n=5;
        int x=23;
        long y=23453;
        float j=24.23f;
        double k=32.33;
        char t= 'd';
        boolean r = false;
        System.out.println(s);
        System.out.println(n);
        System.out.println(x);
        System.out.println(y);
        System.out.println(j);
        System.out.println(k);
        System.out.println(t);
        System.out.println(r);
    }

    //non-primitive Data Types
    public void nonprimitive(){
        String op="Jesus";
        int arr[]= new int[]{3,44,22,44};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        System.out.println(arr[2]);
    }
    
}
