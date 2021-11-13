/*
 * Desk Class
 */
package furnituremain;

/**
 * W9359412
 * @author JATIN ANEJA
 */
public class Desk extends FurnitureMain {

    protected final int height = 80;
    protected int width, depth;
    protected int No_Of_Drawers;
    protected  double price;

    /**
     * default constructor
     */
    protected Desk() {
        super();
        this.depth = 0;
        this.width = 0;
        this.No_Of_Drawers = 0;
        this.price = 0;
    }

    /**
     * parameter constructor
     */
    protected Desk(int depth, int width , int no_of_drawers, double price) {
        this.depth = depth;
        this.width = width;
        No_Of_Drawers = no_of_drawers;
        this.price = price;
    }

    /**
     * getter's and setter's
     */
    public int getdepth() {
        return this.depth;
    }

    public int getheight() {
        return this.height;
    }

    public int getwidth() {
        return this.width;
    }

    public int getdrawerNum() {
        return this.No_Of_Drawers;
    }

    public double getprice() {
        return this.price;
    }

    public int setdepth(int depth) {
        return this.depth = depth;
    }

    public int setwidth(int width) {
        return this.width = width;
    }
   
    public int setdrawerNum(int no_of_drawers) {
        return this.No_Of_Drawers = no_of_drawers;
    }
    
    public double setprice(double price) {
        return this.price = price;
    }
    @Override
    public String toString() {
        return (super.toString() + this.price+ ","+
               this.height +","+this.width +","+ this.depth +","+ this.No_Of_Drawers ).toString();
    }

}
