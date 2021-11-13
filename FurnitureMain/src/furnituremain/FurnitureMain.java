/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituremain;

/**
 * W9359412
 * @author JATIN ANEJA
 */
abstract public class FurnitureMain {

    protected String Item_id;
    protected int Quantity;    
    protected String TypeOfWood;  
    
    /**
     *  Default constructor
     *
    */
    protected FurnitureMain()
    {
       this.Item_id= null;
       this.Quantity = 0;
       this.TypeOfWood = null;
    }
    /**
     * Parameterized Constructor 
     * @param Item_id
     * @param Quantity
     * @param TypeOfWood

     */
   protected FurnitureMain(String id, int Quantity, String TypeOfWood) {
        this.Item_id = id;
        this.Quantity = Quantity;
        this.TypeOfWood = TypeOfWood;

    }
    /**
     * getter and setters
     * @return 
     */
    public String getId() {
        return Item_id;
    }

    public int getQty() {
        return Quantity;
    }

    public String getTypeOfWood() {
        return TypeOfWood;
    }

    public void setId(String id) {
        this.Item_id = id;
    }

    public void setQyt(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setWoodType(String TypeOfWood) {
        this.TypeOfWood = TypeOfWood;

    }

    @Override  // to string 
    public String toString(){
    String Qty = Integer.toString(Quantity);
     String x =  this.Item_id + "," + Qty +","+ this.TypeOfWood +" ,";
     return x;
    
}

}
