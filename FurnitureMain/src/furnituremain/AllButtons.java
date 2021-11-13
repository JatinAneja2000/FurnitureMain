/*
 * Buttons class : containing all the button in the project 
 */
package furnituremain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 *  W9359412
 * @author JATIN ANEJA
 */
public class AllButtons extends JButton implements ActionListener {

    // JButtons
    JButton Load_Records, Shop, Add_Desk, Add_Chair, Add_Table, Save, Edit, ClearAll, exit, ToTal_Price, Load_Data;
    // Other Classes qwith their Objects
    SystemFrames frame = new SystemFrames();
    PriceCalculations P = new PriceCalculations();
    SystemFrames fv = new SystemFrames();
    static Home_Page pg = new Home_Page();
    // image Icons
    static ImageIcon a = new ImageIcon(new ImageIcon("CO1.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon b = new ImageIcon(new ImageIcon("CO2.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon c = new ImageIcon(new ImageIcon("CW1.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon d = new ImageIcon(new ImageIcon("CW2.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon e = new ImageIcon(new ImageIcon("TO.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon f = new ImageIcon(new ImageIcon("TW.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon g = new ImageIcon(new ImageIcon("DO.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));
    static ImageIcon h = new ImageIcon(new ImageIcon("DW.JPG").getImage().getScaledInstance(123, 123, Image.SCALE_DEFAULT));

    public AllButtons() {
        /**
         * \
         * First _Page Buttons
         */
        Load_Records = new JButton("Load-Records");
        Shop = new JButton("Shop");
        exit = new JButton("Exit ");

        Shop.addActionListener(this);
        exit.addActionListener(this);
        Load_Records.addActionListener(this);
        /**
         * Second_Page Buttons
         */
        Add_Desk = new JButton("Add_Desk ");
        Add_Chair = new JButton("Add_Chair");
        Add_Table = new JButton("Add_Table");
        Save = new JButton(" Save ");
        Edit = new JButton(" Edit ");
        ClearAll = new JButton("ClearAll");
        ToTal_Price = new JButton("TotalPrice");
        Load_Data = new JButton("Load_Data");

        Add_Chair.addActionListener(this);
        Add_Table.addActionListener(this);
        Add_Desk.addActionListener(this);
        ClearAll.addActionListener(this);
        ToTal_Price.addActionListener(this);
        Save.addActionListener(this);
        Load_Data.addActionListener(this);

    }

    /**
     * Action Events of all the Buttons in GUI
     *
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {

        if (evt.getSource() == exit) {
            exit(0);
        } else if (evt.getSource() == Shop) {   // begins 
            Driver_Main Frame = new Driver_Main();
            Frame.Second_Frame();
        } // Events for Add Chair Method
        else if (evt.getSource() == Add_Chair) {
            frame.Frame1();    // Open frame 1
            // Sets the Images of the Items : Chair on the basis of Information provided
            if ("Walnut Wood".equals(frame.objChair.getTypeOfWood()) && frame.objChair.getarmrest() == false) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(c);
                        break;
                    case 1:
                        pg.Ml2.setIcon(c);
                        break;
                    case 2:
                        pg.Ml3.setIcon(c);
                        break;
                    case 3:
                        pg.Ml4.setIcon(c);
                        break;
                    case 4:
                        pg.Ml5.setIcon(c);
                        break;
                    case 5:
                        pg.Ml6.setIcon(c);
                        break;
                    case 6:
                        pg.Ml7.setIcon(c);
                        break;
                    case 7:
                        pg.Ml8.setIcon(c);
                        break;
                    case 8:
                        pg.Ml9.setIcon(c);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Walnut Wood".equals(frame.objChair.getTypeOfWood()) && frame.objChair.getarmrest() == true) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(d);
                        break;
                    case 1:
                        pg.Ml2.setIcon(d);
                        break;
                    case 2:
                        pg.Ml3.setIcon(d);
                        break;
                    case 3:
                        pg.Ml4.setIcon(d);
                        break;
                    case 4:
                        pg.Ml5.setIcon(d);
                        break;
                    case 5:
                        pg.Ml6.setIcon(d);
                        break;
                    case 6:
                        pg.Ml7.setIcon(d);
                        break;
                    case 7:
                        pg.Ml8.setIcon(d);
                        break;
                    case 8:
                        pg.Ml9.setIcon(d);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(frame.objChair.getTypeOfWood()) && frame.objChair.getarmrest() == false) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(a);
                        break;
                    case 1:
                        pg.Ml2.setIcon(a);
                        break;
                    case 2:
                        pg.Ml3.setIcon(a);
                        break;
                    case 3:
                        pg.Ml4.setIcon(a);
                        break;
                    case 4:
                        pg.Ml5.setIcon(a);
                        break;
                    case 5:
                        pg.Ml6.setIcon(a);
                        break;
                    case 6:
                        pg.Ml7.setIcon(a);
                        break;
                    case 7:
                        pg.Ml8.setIcon(a);
                        break;
                    case 8:
                        pg.Ml9.setIcon(a);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(frame.objChair.getTypeOfWood()) && frame.objChair.getarmrest() == true) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(b);
                        break;
                    case 1:
                        pg.Ml2.setIcon(b);
                        break;
                    case 2:
                        pg.Ml3.setIcon(b);
                        break;
                    case 3:
                        pg.Ml4.setIcon(b);
                        break;
                    case 4:
                        pg.Ml5.setIcon(b);
                        break;
                    case 5:
                        pg.Ml6.setIcon(b);
                        break;
                    case 6:
                        pg.Ml7.setIcon(b);
                        break;
                    case 7:
                        pg.Ml8.setIcon(b);
                        break;
                    case 8:
                        pg.Ml9.setIcon(b);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
        } // Chair event ends 
        //  // Events for Add Table Method
        else if (evt.getSource() == Add_Table) {
            frame.Frame2();   // Open frame 2
            // Sets the Images of the Items :Table on the basis of Information provided
            if ("Walnut Wood".equals(frame.objTable.getTypeOfWood())) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(f);
                        break;
                    case 1:
                        pg.Ml2.setIcon(f);
                        break;
                    case 2:
                        pg.Ml3.setIcon(f);
                        break;
                    case 3:
                        pg.Ml4.setIcon(f);
                        break;
                    case 4:
                        pg.Ml5.setIcon(f);
                        break;
                    case 5:
                        pg.Ml6.setIcon(f);
                        break;
                    case 6:
                        pg.Ml7.setIcon(f);
                        break;
                    case 7:
                        pg.Ml8.setIcon(f);
                        break;
                    case 8:
                        pg.Ml9.setIcon(f);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(frame.objTable.getTypeOfWood())) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(e);
                        break;
                    case 1:
                        pg.Ml2.setIcon(e);
                        break;
                    case 2:
                        pg.Ml3.setIcon(e);
                        break;
                    case 3:
                        pg.Ml4.setIcon(e);
                        break;
                    case 4:
                        pg.Ml5.setIcon(e);
                        break;
                    case 5:
                        pg.Ml6.setIcon(e);
                        break;
                    case 6:
                        pg.Ml7.setIcon(e);
                        break;
                    case 7:
                        pg.Ml8.setIcon(e);
                        break;
                    case 8:
                        pg.Ml9.setIcon(e);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
        } // Table event ends 
        //   Events for Add Desk Method
        else if (evt.getSource() == Add_Desk) {
            frame.Frame3(); // Open frame 3
            // Sets the Images of the Items : Desk  on the basis of Information provided
            if ("Walnut Wood".equals(frame.objDesk.getTypeOfWood())) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(h);
                        break;
                    case 1:
                        pg.Ml2.setIcon(h);
                        break;
                    case 2:
                        pg.Ml3.setIcon(h);
                        break;
                    case 3:
                        pg.Ml4.setIcon(h);
                        break;
                    case 4:
                        pg.Ml5.setIcon(h);
                        break;
                    case 5:
                        pg.Ml6.setIcon(h);
                        break;
                    case 6:
                        pg.Ml7.setIcon(h);
                        break;
                    case 7:
                        pg.Ml8.setIcon(h);
                        break;
                    case 8:
                        pg.Ml9.setIcon(h);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(frame.objDesk.getTypeOfWood())) {
                switch (frame.getListSize()) {
                    case 0:
                        pg.Ml1.setIcon(g);
                        break;
                    case 1:
                        pg.Ml2.setIcon(g);
                        break;
                    case 2:
                        pg.Ml3.setIcon(g);
                        break;
                    case 3:
                        pg.Ml4.setIcon(g);
                        break;
                    case 4:
                        pg.Ml5.setIcon(g);
                        break;
                    case 5:
                        pg.Ml6.setIcon(g);
                        break;
                    case 6:
                        pg.Ml7.setIcon(g);
                        break;
                    case 7:
                        pg.Ml8.setIcon(g);
                        break;
                    case 8:
                        pg.Ml9.setIcon(g);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
        } // Desk event ends
        // Remove All Event
        /**
         * Removes all the Items from the Cart
         */
        else if (evt.getSource() == ClearAll) {

            pg.Ml1.setIcon(null);
            pg.Ml2.setIcon(null);
            pg.Ml3.setIcon(null);
            pg.Ml4.setIcon(null);
            pg.Ml5.setIcon(null);
            pg.Ml6.setIcon(null);
            pg.Ml7.setIcon(null);
            pg.Ml8.setIcon(null);
            pg.Ml9.setIcon(null);
            frame.pnt = -1;
            frame.list.clear();

        } /**
         * Provides Total Price of all the Items in the Cart
         */
        else if (evt.getSource() == ToTal_Price) {
            double GrandTotal = 0;
            String[] Str;
            for (int i = 0; i < frame.list.size(); i++) {
                Str = frame.list.get(i).split(",");
                GrandTotal += Double.parseDouble(Str[3]);
            }
            JOptionPane.showMessageDialog(null, "Grand Total amout is : £" + GrandTotal, "Furniture System", JOptionPane.INFORMATION_MESSAGE);
        }
        /**
         * Save the File with All the Items added in an Array List
         */
        else if (evt.getSource() == Save) {
            try {
                String inputStr = JOptionPane.showInputDialog(null, "Enter your FileName with extention = .dat !!");
                Scanner myScanner = new Scanner(inputStr);
                // use a Scanner object to get each token from inputStr
                String file = myScanner.nextLine();
                
                //write to file
                try {
                    FileOutputStream writeData = new FileOutputStream(file);
                    try (ObjectOutputStream writeStream = new ObjectOutputStream(writeData)) {
                        writeStream.writeObject(frame.list);
                        writeStream.flush();
                    }
                    JOptionPane.showMessageDialog(null, "Your File Is Saved In Our Recordes ", " FUreniture System ", JOptionPane.CLOSED_OPTION);
                } catch (IOException ec) {
                    JOptionPane.showMessageDialog(null, "ERROR :Your File Cannot Be Saved" + "Furniture System " + JOptionPane.ERROR_MESSAGE);
                }
                // Text file to save the name of the records
                File Records = new File("Records.txt");
                /* This logic is to create the file if the
                * file is not already present
                 */
                if (!Records.exists()) {
                    Records.createNewFile();
                }
                //Here true is to append the content to file
                FileWriter fw;
                fw = new FileWriter(Records, true);
                try (BufferedWriter bw = new BufferedWriter(fw)) {//BufferedWriter writer give better performance
                    // extracted data from getnewPolicy() and writing in policy.txt file
                    bw.append(file);
                    bw.newLine();   // entring data in every newline
                    bw.close();
                    //Closing BufferedWriter Stream
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File cannot be Save!! ERROR", "Furniture System",JOptionPane.ERROR_MESSAGE);
            }

        } /**
         * Load the Particular file entered in by the user
         */
        else if (evt.getSource() == Load_Data) {
            String inputStr = JOptionPane.showInputDialog(null, "Enter your FileName with extention = .dat !!");
            Scanner myScanner = new Scanner(inputStr);
            // use a Scanner object to get each token from inputStr
            String file = myScanner.nextLine();
            //write to file

            try {
                FileInputStream readData = new FileInputStream(file);
                ArrayList list2;

                try (ObjectInputStream readStream = new ObjectInputStream(readData)) {
                    list2 = (ArrayList) readStream.readObject();

                }
                JOptionPane.showMessageDialog(null, list2.toString() + "\n");
                findpicture(list2);
            } catch (IOException | ClassNotFoundException ec) {
                JOptionPane.showMessageDialog(null, "ERROR :Your File Cannot Be Loaded" + "Furniture System " + JOptionPane.ERROR_MESSAGE);

            }

        } else if (evt.getSource() == Load_Records) {  /// load the data from the file

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("Records.txt"));
                String string, str ="";
                
                try {
                    while ((string = br.readLine()) != null) {
                       // JOptionPane.showMessageDialog(null, ("         Records \n" + string + "\n"));
                       str += string + "\n";
                    }
                    JOptionPane.showMessageDialog(null, ("         Records \n" + str + "\n"));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Do you wa t to cancel???", "Furniture System",JOptionPane.QUESTION_MESSAGE);
                }
            } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Do you wa t to cancel???", "Furniture System",JOptionPane.QUESTION_MESSAGE);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Do you wa t to cancel???", "Furniture System",JOptionPane.QUESTION_MESSAGE);
                }
            }
        }
    }

    /**
     * Finding and Displaying the Pictures of Furniture
     * @param list2 
     */
    private void findpicture(ArrayList list2) {
        int xyz = 0;
        String id = "";
        String[] str = new String[10];

        for (int i = 0; i < list2.size(); i++) {    // loop to go through the array List
            str = list2.get(i).toString().split(",");          
            if("u001".equals(str[0].trim())){
             if ("Walnut Wood".equals(str[2].trim()) && str[4].trim().equals("false")) {
               
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(c);
                        break;
                    case 1:
                        pg.Ml2.setIcon(c);
                        break;
                    case 2:
                        pg.Ml3.setIcon(c);
                        break;
                    case 3:
                        pg.Ml4.setIcon(c);
                        break;
                    case 4:
                        pg.Ml5.setIcon(c);
                        break;
                    case 5:
                        pg.Ml6.setIcon(c);
                        break;
                    case 6:
                        pg.Ml7.setIcon(c);
                        break;
                    case 7:
                        pg.Ml8.setIcon(c);
                        break;
                    case 8:
                        pg.Ml9.setIcon(c);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Walnut Wood".equals(str[2].trim()) && str[4].trim().equals("true")) {
                
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(d);
                        break;
                    case 1:
                        pg.Ml2.setIcon(d);
                        break;
                    case 2:
                        pg.Ml3.setIcon(d);
                        break;
                    case 3:
                        pg.Ml4.setIcon(d);
                        break;
                    case 4:
                        pg.Ml5.setIcon(d);
                        break;
                    case 5:
                        pg.Ml6.setIcon(d);
                        break;
                    case 6:
                        pg.Ml7.setIcon(d);
                        break;
                    case 7:
                        pg.Ml8.setIcon(d);
                        break;
                    case 8:
                        pg.Ml9.setIcon(d);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(str[2].trim()) && str[4].trim().equals("false")) {
                
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(a);
                        break;
                    case 1:
                        pg.Ml2.setIcon(a);
                        break;
                    case 2:
                        pg.Ml3.setIcon(a);
                        break;
                    case 3:
                        pg.Ml4.setIcon(a);
                        break;
                    case 4:
                        pg.Ml5.setIcon(a);
                        break;
                    case 5:
                        pg.Ml6.setIcon(a);
                        break;
                    case 6:
                        pg.Ml7.setIcon(a);
                        break;
                    case 7:
                        pg.Ml8.setIcon(a);
                        break;
                    case 8:
                        pg.Ml9.setIcon(a);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(str[2].trim()) && str[4].trim().equals("true")) {
                System.out.println("d");
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(b);
                        break;
                    case 1:
                        pg.Ml2.setIcon(b);
                        break;
                    case 2:
                        pg.Ml3.setIcon(b);
                        break;
                    case 3:
                        pg.Ml4.setIcon(b);
                        break;
                    case 4:
                        pg.Ml5.setIcon(b);
                        break;
                    case 5:
                        pg.Ml6.setIcon(b);
                        break;
                    case 6:
                        pg.Ml7.setIcon(b);
                        break;
                    case 7:
                        pg.Ml8.setIcon(b);
                        break;
                    case 8:
                        pg.Ml9.setIcon(b);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
         }else if(str[0].trim().equals("u002")){
              // Sets the Images of the Items :Table on the basis of Information provided
            if ("Walnut Wood".equals(str[2].trim())) {
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(f);
                        break;
                    case 1:
                        pg.Ml2.setIcon(f);
                        break;
                    case 2:
                        pg.Ml3.setIcon(f);
                        break;
                    case 3:
                        pg.Ml4.setIcon(f);
                        break;
                    case 4:
                        pg.Ml5.setIcon(f);
                        break;
                    case 5:
                        pg.Ml6.setIcon(f);
                        break;
                    case 6:
                        pg.Ml7.setIcon(f);
                        break;
                    case 7:
                        pg.Ml8.setIcon(f);
                        break;
                    case 8:
                        pg.Ml9.setIcon(f);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(str[2].trim())) {
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(e);
                        break;
                    case 1:
                        pg.Ml2.setIcon(e);
                        break;
                    case 2:
                        pg.Ml3.setIcon(e);
                        break;
                    case 3:
                        pg.Ml4.setIcon(e);
                        break;
                    case 4:
                        pg.Ml5.setIcon(e);
                        break;
                    case 5:
                        pg.Ml6.setIcon(e);
                        break;
                    case 6:
                        pg.Ml7.setIcon(e);
                        break;
                    case 7:
                        pg.Ml8.setIcon(e);
                        break;
                    case 8:
                        pg.Ml9.setIcon(e);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
         } else if(str[0].trim().equals("u003")){
             
              if ("Walnut Wood".equals(str[2].trim())) {
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(h);
                        break;
                    case 1:
                        pg.Ml2.setIcon(h);
                        break;
                    case 2:
                        pg.Ml3.setIcon(h);
                        break;
                    case 3:
                        pg.Ml4.setIcon(h);
                        break;
                    case 4:
                        pg.Ml5.setIcon(h);
                        break;
                    case 5:
                        pg.Ml6.setIcon(h);
                        break;
                    case 6:
                        pg.Ml7.setIcon(h);
                        break;
                    case 7:
                        pg.Ml8.setIcon(h);
                        break;
                    case 8:
                        pg.Ml9.setIcon(h);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            } else if ("Oak Wood".equals(str[2].trim())) {
                switch (i) {
                    case 0:
                        pg.Ml1.setIcon(g);
                        break;
                    case 1:
                        pg.Ml2.setIcon(g);
                        break;
                    case 2:
                        pg.Ml3.setIcon(g);
                        break;
                    case 3:
                        pg.Ml4.setIcon(g);
                        break;
                    case 4:
                        pg.Ml5.setIcon(g);
                        break;
                    case 5:
                        pg.Ml6.setIcon(g);
                        break;
                    case 6:
                        pg.Ml7.setIcon(g);
                        break;
                    case 7:
                        pg.Ml8.setIcon(g);
                        break;
                    case 8:
                        pg.Ml9.setIcon(g);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Your Cart is Full");
                        break;
                    default:
                        break;
                }
            }
         } 
        }
        Driver_Main.loginFrame2.repaint();// repainting the lables withe the new ImageIcons
        frame.Updatelist(list2);// and updating the arraylist
    }

}// end of All Buttons
