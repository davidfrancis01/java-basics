import java.util.*;
public class CalculatingShapes {
    double radius = 4.5;
    double height = 9.6;
    //main method
    public static void main(String args[]){
        CalculatingShapes Cs =new CalculatingShapes();
        Cs.areaOfTheCircle();
        Cs.perimeterOfTheCircle();
        Cs.areaOfTheCylinder();
        Cs.areaOfSquare();

    }

    //method for calculating the area of the circle
    public void areaOfTheCircle(){
        CalculatingShapes Cs = new CalculatingShapes();
        double area=3.14*Cs.radius*Cs.radius ;
        System.out.println("Area of the Circle :"+area);

    }

    //method for calculating the perimeter of the circle
    public void perimeterOfTheCircle(){
        CalculatingShapes Cs = new CalculatingShapes();
        double perimeter = 2*3.14*Cs.radius;
        System.out.println("Perimeter of the Circle: "+perimeter);

    }

    //method for calculating the area of the cyclinder
    public void areaOfTheCylinder(){
        CalculatingShapes Cs = new CalculatingShapes();
        double area = 2*3.14*(Cs.radius+Cs.height);
        System.out.println("Area of the Cylinder :"+area);
    }

    //method for calculating the area of the square 
    public void areaOfSquare(){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        System.out.println("area of the Square : "+ side*side);
    }

    

    
}
