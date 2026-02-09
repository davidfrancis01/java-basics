public class Operators {

    public static void main(String args[]){
        Operators.typesOfOperators();
        Operators.arthmeticOperators();
        Operators.relationalOperators();
        Operators.logicalOperators();
        Operators.assignmentOperators();
        
    }

    //Types of Operators
    public static void typesOfOperators(){
        System.out.println("TYPES OF OPERATORS :\n 1.ARTHMETIC\n 2.RELATIONAL \n 3.LOGICAL \n 4.ASSIGNMENT \n 5.BITWISE OPERATORS");
    }
    public static void arthmeticOperators(){
        //Unary operators
        System.out.println("In Arthmetic Operators there are three :\n1.UNARY \n2.BINARY \n3.TERNARY OPERATORS");
        String unaryOperators = "1.Increment \n2.Decrement operators";
        System.out.println("Unary Operators : \n"+unaryOperators);
        System.out.println("In Increment,\n1.pre-increment and post-increment \nas same as Decrement operator");
        //Binary Operators
        String binaryOperators = "+ , - , * , / , % ";
        System.out.println("binary Operators :"+binaryOperators);

    }

    //method for relatioal operators
    public static void relationalOperators(){
        //relational Operators
        String relational_Operators =" ==(equals) , <(lesser) , >(greater) , <=(less than equals to) , >=(greater than equals to ) , !=(notequals to ) ";
        System.out.println("Relational Operators : "+relational_Operators);

    }

    //method for logical operators
    public static void logicalOperators(){
        //logical operators
        String logical_Oprtrs =" && , || , ! ";
        System.out.println("Logical Operators :"+logical_Oprtrs);
    }

    //method for Assignment operators
    public static void assignmentOperators(){
        //AssignmentOperators
        String assignmentOperators = " = , += , -= , *= , /= ";
        System.out.println("AssignmentOperators : "+assignmentOperators);
    }
    
}
