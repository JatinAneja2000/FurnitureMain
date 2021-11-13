/*
 * Table Class
 */
package furnituremain;

/**
 * W9359412
 * @author JATIN ANEJA
 */
public class Table extends FurnitureMain {
    
    protected int diameter_required;
    protected String base_type;
    protected double Price_Table;


    /**
     * default constructor
     */
    protected Table() {
        super();
        diameter_required = 50;
        base_type = null;
        Price_Table = 0;
    }

    /**
     * parameter constructor
     */
    protected Table(int diameter, String base, double Price) {
        super();
        diameter_required = diameter;
        base_type = base;
        Price_Table = Price;
    }

    /**
     * getter's and setter's
     */
    public int getdiameter() {
        return this.diameter_required;
    }

    public String getbase() {
        return this.base_type;
    }

    public double getPrice() {
        return this.Price_Table;
    }


    public int setwidth(int diameter) {
        return this.diameter_required = diameter;
    }

    public String setbase(String base) {
        return this.base_type = base;
    }
    public double setPrice(double price) {
        return this.Price_Table = price;
    }
    @Override
    public String toString() {
        return (super.toString()  + this.Price_Table + "," +
                this.diameter_required +", "+ this.base_type).toString();
    }
}
