import java.util.Scanner;
public class CostOfItems {
 
    float gst = 0.18f;

    public static void main(String args[]){
        CostOfItems.costOfYourProducts();
    }

    public static void costOfYourProducts(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter or Scan the price of the Honey: ");
        float honey = sc.nextFloat();//199.45;
        System.out.println("Enter or Scan the Price of the QuakerOats: ");
        float quakerOats =sc.nextFloat();//229.99;
        System.out.println("Enter or scan the cost of the MilkPacket: ");
        float milk_Packet = sc.nextFloat();
        //to call gst 
        CostOfItems cost = new CostOfItems();
        float itemsCost =  honey+quakerOats+milk_Packet;
        float yoursGst = itemsCost*cost.gst;
        System.out.println("your items cost : "+itemsCost);
        System.out.println("GST added to your items :"+yoursGst);
        System.out.println("Your Total Cost : "+(itemsCost+yoursGst));

    }
    
}
