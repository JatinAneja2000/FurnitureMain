/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituremain;

/**
 *
 * @author JATIN ANEJA
 */
public class PriceCalculations {

    static double priceChair  , priceDesk, priceTable;

         /**
         * Given the current charge/price of each unit is 4p for oak and 3p for
         * walnut. 
         */
    public double ChairPrice(Chair objC) {

        /**
         * A standard chair uses 1625 units of wood and if the customer
         * chooses armrests, it takes another 250 units.
         */
        if ("Walnut Wood".equals(objC.getTypeOfWood()) && objC.getarmrest() == false)
        {
            priceChair = ((1625.00 * 3) / 100) * objC.getQty();   // Amount in Pounds[
        } 
        else if ("Walnut Wood".equals(objC.getTypeOfWood()) && objC.getarmrest() == true) 
        {
            priceChair = ((1875.00 * 3) / 100) * objC.getQty();   // Amount in Pounds
            
        } else if ("Oak Wood".equals(objC.getTypeOfWood()) && objC.getarmrest() == false) {
            priceChair = ((1625.00 * 4) / 100) * objC.getQty();   // Amount in Pounds
        } else if ("Oak Wood".equals(objC.getTypeOfWood()) && objC.getarmrest() == true) {
            priceChair = ((1875.00 * 4) / 100) * objC.getQty();   // Amount in Pounds
        }
    return  priceChair; 
    }

    public double TablePrice(Table objT) {

        /**
         * A single circular table is available and it can come with a wooden or chrome base.
         * The customer can request any size (diameter) that is 50 centimeters or more.
         * ROFC assumes the table is square for the purpose of calculating the number of units of wood.
         * The following information is required to calculate the item price of the table:
            	Wooden base price:	£45.00
            	Chrome base price:	£35.00
            	Number of units formula:	diameter x diameter
            	Total table price is:	(number of units * charge) + price of the base
         */
        double number_of_units = objT.getdiameter() * objT.getdiameter();
        if ("Walnut Wood".equals(objT.getTypeOfWood()) && "Wooden Base".equals(objT.getbase())) {
            priceTable = ((number_of_units * 3)/100 + 45.00) * objT.getQty();   // Amount in Pounds          
        } else if ("Walnut Wood".equals(objT.getTypeOfWood()) && "Chrome Base".equals(objT.getbase())) {
            priceTable = ((number_of_units * 3)/100 + 35.00) * objT.getQty();   // Amount in Pounds
        } else if ("Oak Wood".equals(objT.getTypeOfWood()) && "Wooden Base".equals(objT.getbase())) {
            priceTable = ((number_of_units * 4)/100 + 45.00) * objT.getQty();   // Amount in Pounds
        } else if ("Oak Wood".equals(objT.getTypeOfWood()) && "Chrome Base".equals(objT.getbase())) {
            priceTable = ((number_of_units * 4) / 100 + 35.00) * objT.getQty();   // Amount in Pounds
        }
        
        return priceTable;
    }

    public double DeskPrice(Desk objD) {

        /**
         * Customers can request desks with 1-4 draws and the total item price can be calculated using the following formula:
         *     (((height + width + depth) * 12) + (depth * width) * price per unit) + (number of draws  * £8.50)
         * Note: The height of all desks is 80cm
         */
        if ("Walnut Wood".equals(objD.getTypeOfWood())) {
            priceDesk =  (((((objD.getheight() + objD.getwidth() + objD.getdepth()) * 12) + (objD.getdepth() * objD.getwidth()) * 3) /100 + (objD.getdrawerNum()  * 8.50)) * objD.getQty());  // Amount in Pounds          

        } else if ("Oak Wood".equals(objD.getTypeOfWood())) {
            priceDesk = (((((objD.getheight() + objD.getwidth() + objD.getdepth()) * 12) + (objD.getdepth() * objD.getwidth()) * 4) /100) + (objD.getdrawerNum()  * 8.50) * objD.getQty());  // Amount in Pounds          
        }

        return priceDesk;
    }


}
