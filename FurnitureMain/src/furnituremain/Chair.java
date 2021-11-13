/*
 * Chair Class
 */
package furnituremain;

/**
 * W9359412
 * @author JATIN ANEJA
 */
public class Chair extends FurnitureMain{
        protected boolean armrest_required;
        protected  double Price_Chair;

    /**
     * default constructor
     */
    protected Chair() {
        super();
        armrest_required = false;
        Price_Chair = 0;
    }

    /**
     * parameter constructor
     */
    protected Chair(boolean armrest_required, double Price) {
        super();
        this.armrest_required = armrest_required;
        this.Price_Chair = Price;
        
    }

    /**
     * getter's and setter's
     */
    public boolean getarmrest() {
        return this.armrest_required;
    }
    public  double getPrice() {
        return this.Price_Chair;
    }

    public boolean setarmrest(boolean armrest_required) {
        return this.armrest_required = armrest_required;
    }
    public double setPrice(double price) {
        return this.Price_Chair = price;
    }
    
      @Override
    public String toString() {
        return  (super.toString() + this.Price_Chair + ","+
                this.armrest_required );
    }
}
