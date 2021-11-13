/*
 * Main Class
 */
package furnituremain;

import javax.swing.JFrame;


/**
 * W9359412
 * @author JATIN ANEJA
 */
public class Driver_Main extends JFrame {

    static JFrame loginFrame1 = new JFrame();
   static  JFrame loginFrame2 = new JFrame();
    public static void First_Frame() {

        // Beginning of the Program 
        First_Page ls = new First_Page();

        loginFrame1.setTitle("Furniture System");
        loginFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame1.add(ls);
        loginFrame1.setSize(482,400);
        loginFrame1.pack();
        loginFrame1.setVisible(true);
    } 
    public static void Second_Frame() {
        // code for home GUI
        
        Home_Page Hs = new Home_Page();

        loginFrame2.setTitle("Furniture System");
        loginFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame2.add(Hs);
        loginFrame2.setSize(482,400);
        loginFrame2.pack();
        loginFrame2.setVisible(true);
        loginFrame2.setResizable(false);
        loginFrame1.setVisible(false);
    } 
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      First_Frame();
    }

}
