public class variables {
    //static variables
    static String name ="David";
    //instance variables
    int studentId = 529;


    //main method
    public static void main (String args[]){
        //calling static variables 
        System.out.println(variables.name);
        //calling static method
        variables.staticMethod();

        //calling instance variables & methods via object
        variables v = new variables();
        System.out.println(v.studentId);
        v.nonStaticMethod();
        variables.localVariables();
    }
    
    //static method 
    public static void staticMethod(){
        System.out.println("This is a static method ");
        //calling static variable
        System.out.println(variables.name);
    }

    //non static method 
    public void nonStaticMethod(){
        System.out.println("this is non-static method, non-static or instance variables & methods  are called by creating the object");
    }

    //local variables
    public static void localVariables(){
        int amount = 2900;
        System.out.println(amount); 
    }

}
