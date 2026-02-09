public class LinearSearch{
    static int index = -1;
    public static void main(String args[]){

        String items[]={"pizza","diet-coke","samosa","burger","shawarma","sneakers","sand-wich"};
        String selectedItem = "sand-wich";
        selectTheItem(items,selectedItem);
        if(index==-1){
            System.out.println("today, it is not avaliable sir please go through the another item.");
        }
        
    }
    //method for selecting the item from the list 
    public static void selectTheItem(String items[],String selectedItem){
    
        //for loop :if the selected item is not available
        for(int i=0;i<=items.length-1;i++){
            if(items[i].equals(selectedItem)){
                System.out.println("Yeah sir,the item is available \n It will in 5 minutes ");
                index = i;
            }
            
        }
        System.out.println("Item Number(index) :"+index);
        
    }

   
}