/*
 *Furniture Destails class and Mouse Events 
 */
package furnituremain;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * W9359412
 * @author JATIN ANEJA
 */

public class SystemFrames  {
 PriceCalculations p = new PriceCalculations();
    // Variables declaration - do not modify
    JFrame F1, F2, F3;
    static int pnt = -1;
    static ArrayList<String>list = new ArrayList<String>(9); // My ArrayList of Items 
    static  Chair objChair = new Chair();
    static Table objTable = new Table();
    static Desk objDesk = new Desk();
    static JLabel Quantity = new JLabel();
    static int c = 0;  // JOptionPane Path counter
    public void Updatelist(ArrayList updatedList){
        this.list = updatedList;
    }
    /**
     * For Chair Furniture 
     * @return
     */
    public void Frame1() {
     int c = 0;
     int k = 0;
    /*
       Local Variable Declarations - do not modify
     */
    
    F1 = new JFrame();
    JPanel Panel1 = new JPanel();
    AllButtons bts = new AllButtons();
    JCheckBox yes, no;
    JLabel l1, l2, l3, l4, l5,l6;
    JTextField IdField = new JTextField();
   

    JComboBox<String> jCBox1;

    yes = new JCheckBox();
    no = new JCheckBox();
    l1 = new JLabel();
    l2 = new JLabel();
    l3 = new JLabel();
    l4 = new JLabel();
    l5 = new JLabel();
    l6 = new JLabel();
   

    // End of variables declaration
    /**
     * Variable Fonts setting
     */
    // Labels
    l1.setBackground(new Color(51, 204, 255));
    l1.setFont(new Font("Tahoma", 1, 16)); // NOI18N
    l1.setText("Add_Chair");
    l1.setOpaque(true);

    l2.setFont(new Font("Tahoma", 1, 13)); // NOI18N
    l2.setText("Item_ID");

    l3.setFont(new Font("Tahoma", 1, 13)); // NOI18N
    l3.setText("Quantity");

    l4.setFont(new Font("Tahoma", 1, 12)); // NOI18N
    l4.setText("Type_Of_Wood");

    l5.setFont(new Font("Tahoma", 1, 12)); // NOI18N
    l5.setText("Armrest_Required");

    l6.setFont(new Font("Tahoma", 1, 12)); // NOI18N
    l6.setText("X");

    //Textfield   
    IdField.setFont(new Font("Tahoma", 1, 12)); // NOI18N   
    IdField.setText("u001");
    IdField.setOpaque(true);
    Quantity.setHorizontalAlignment(JLabel.CENTER);
    Quantity.setFont(new Font("Tahoma", 1, 13)); // NOI18N
    Quantity.setText("1");
    Quantity.setOpaque(true);

    // ComBo Box
    jCBox1 = new JComboBox<>();
    jCBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Walnut Wood", "Oak Wood"}));

    // check Box Font's
    yes.setFont(new Font("Tahoma", 1, 10)); // NOI18N
    yes.setText("YES");
    no.setFont(new Font("Tahoma", 1, 10)); // NOI18N
    no.setText("NO");

    /**
     * Layouts of Add_Chair Frame
     */
GroupLayout Panel1Layout = new GroupLayout(Panel1);
Panel1.setLayout(Panel1Layout);
Panel1Layout.setHorizontalGroup(
    Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(Panel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(l1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                    .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(l2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l3, GroupLayout.Alignment.CENTER, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(IdField)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(l6, GroupLayout.DEFAULT_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                    .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(l4, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(jCBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(l5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Panel1Layout.createSequentialGroup()
                                                    .addGap(4, 4, 4)
                                           .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(yes, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(no, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))))))));

Panel1Layout.setVerticalGroup(
Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(Panel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(l1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(
                    Panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(l2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdField, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            )
            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(l6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Quantity, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(l4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(l5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jCBox1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGroup(Panel1Layout.createSequentialGroup()
                                        .addComponent(yes, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))));// End of Layout Declaration
    // Frame - Add_Chair
    F1.setTitle("Add Chair");
    F1.add(Panel1);
    F1.setSize(482, 400);
    F1.pack();
    F1.setVisible(false);
    F1.setResizable(false);
    c = JOptionPane.showConfirmDialog(F1, Panel1, "Furniture System", JOptionPane.OK_CANCEL_OPTION);
    /**
     * Validation of Item Chair 
     */
    // when Cancel button is opted  // Not Wanted to buy a chair 
    if(c ==JOptionPane.CANCEL_OPTION ){
        JOptionPane.getRootFrame();
    }

    boolean ans = ValidateID(IdField.getText());
    if (ans == false) {
        JOptionPane.showMessageDialog(null, "Wrong ItemID !!. Please Re-Enter","Furniture System",JOptionPane.INFORMATION_MESSAGE);
        Frame1();
        pnt--;
    } else {
        // update the classes (Chair Class)
        objChair.setId(IdField.getText());
        objChair.setQyt(Integer.parseInt(Quantity.getText()));
        int a = jCBox1.getSelectedIndex();
        objChair.setWoodType(jCBox1.getItemAt(a));
        Boolean answer = false;
        if (yes.isSelected() == true) {
            answer = true;
        } else if (no.isSelected() == true) {
            answer = false;
        }
        objChair.setarmrest(answer);
        objChair.setPrice(p.ChairPrice(objChair));
        do {
            if (c == JOptionPane.OK_OPTION) {
                double ChairPrice = p.ChairPrice(objChair);
                k = JOptionPane.showConfirmDialog(null, "Your Item Price is : £"+ChairPrice, "Furniture System", JOptionPane.OK_CANCEL_OPTION , JOptionPane.INFORMATION_MESSAGE);
                if (k == JOptionPane.CANCEL_OPTION) {
                    Frame1();
                    pnt--;
                    //  boolean remove = list.remove(objChair);
                } else {
                    list.add(objChair.toString());
                    System.out.println(list);

                }
                break;
            }

        } while (k != JOptionPane.OK_OPTION);
        if (c == JOptionPane.CANCEL_OPTION) {
            pnt--;
        }
    }
 pnt++;        
}// </editor-fold> // Trigger Add-Chair Button
    /**
     * For Table Furniture 
     * @return
     */
    public void Frame2() {
        /*
           Local Variable Declarations - do not modify
         */
        F2 = new JFrame();
        AllButtons bts = new AllButtons();
        JPanel Panel1 = new JPanel();
        JLabel l1, l2, l3, l4, l5, l6 , l7 , l8;
        JTextField idField, diameter;
        JComboBox<String> jCBox1 , jCBox2;
        int k = 0;
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        idField = new JTextField();

        diameter = new JTextField();
        jCBox1 = new JComboBox<>();
        jCBox2 = new JComboBox<>();
        // End of variables declaration
        /**
         * Variable Fonts setting
         */
        // Labels
        l1.setBackground(new Color(51, 204, 255));
        l1.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setText("Add_Table");
        l1.setOpaque(true);

        l2.setFont(new Font("Tahoma", 1, 13)); // NOI18N
        l2.setText("Item_ID");

        l3.setFont(new Font("Tahoma", 1, 13)); // NOI18N
        l3.setText("Quantity");

        l4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l4.setText("Type_Of_Wood");

        l5.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        l5.setText("Diameter_Required");

        l6.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        l6.setText("cm.");

        l7.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        l7.setText("Base Type");
        
        l8.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        l8.setText("X");
        // TextFields
        idField.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        idField.setText("u002");
        idField.setOpaque(true);
        Quantity.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        Quantity.setHorizontalAlignment(JLabel.CENTER);
        Quantity.setText("1");
        Quantity.setOpaque(true);
        diameter.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        diameter.setText("50");

        //JComboBx
        jCBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Walnut Wood", "Oak Wood"}));
        jCBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Wooden Base", "Chrome Base"}));
        /**
         * Layouts of Add_table Frame
         */
        GroupLayout jPanel1Layout = new GroupLayout(Panel1);
        Panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(l1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(l3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(l2, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(idField, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(l8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Quantity, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGap(8, 8, Short.MAX_VALUE))
                                                        )
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(l4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                        .addComponent(jCBox1, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(l5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(diameter, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(l6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(l7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                        .addComponent(jCBox2, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(37, 37, 37)
                                                         )
                                                )))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idField, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(l2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(l3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Quantity))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED) 
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(l5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l4, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCBox1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(diameter)
                                        .addComponent(l6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)

                                        .addComponent(l7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCBox2, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                        .addContainerGap(50, Short.MAX_VALUE)
                                )
        ); // End of Layout Declaration

    // Frame - Add_Table
    F2.setTitle("Add Table");
    F2.add(Panel1);
    F2.setSize(386, 285);
    F2.pack();
    F2.setVisible(false);
    F2.setResizable(false);
    c =  JOptionPane.showConfirmDialog(F2, Panel1, "Furniture System", JOptionPane.OK_CANCEL_OPTION);

    /**
     * Validation of Item Table 
     */
    // when Cancel button is opted  // Not Wanted to buy a Table 
    if(c ==JOptionPane.CANCEL_OPTION ){
        JOptionPane.getRootFrame();
    }
    boolean ans = ValidateID(idField.getText());
    
    if (ans == false) {
        JOptionPane.showMessageDialog(null, "Wrong ItemID !!. Please Re-Enter","Furniture System",JOptionPane.INFORMATION_MESSAGE);
        Frame2();
        pnt--;
    } else {
        // update the classes (Table Class)
    objTable.setId(idField.getText());
    objTable.setQyt(Integer.parseInt(Quantity.getText()));
    int a = jCBox1.getSelectedIndex();
    objTable.setWoodType(jCBox1.getItemAt(a));
    int b = jCBox2.getSelectedIndex();
    objTable.setbase(jCBox2.getItemAt(b));
    objTable.setwidth(Integer.parseInt(diameter.getText()));
    objTable.setPrice(p.TablePrice(objTable));
    do {
        if (c == JOptionPane.OK_OPTION) {
            double TablePrice = p.TablePrice(objTable);
            k = JOptionPane.showConfirmDialog(null, "Your Item Price is : £"+TablePrice, "Furniture System", JOptionPane.OK_CANCEL_OPTION , JOptionPane.INFORMATION_MESSAGE);
                if (k == JOptionPane.CANCEL_OPTION) {
                    Frame2();
                    pnt--;
                } else {
                    list.add(objTable.toString());// Adding to the list
                    System.out.println(list);
                }
                break;
            }

        } while (k != JOptionPane.OK_OPTION);
        if (c == JOptionPane.CANCEL_OPTION) {
            pnt--;
        }
    }
    pnt++; 
}// </editor-fold> // Trigger Add-Table Button

        /**
     * For Desk Furniture 
     * @return
     */
    public void Frame3() {
        int k = 0;
        /*
           Local Variable Declarations - do not modify
         */    
        F3 = new JFrame();
        AllButtons bts = new AllButtons();
        JPanel Panel1 = new JPanel();
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12,l13;
        JComboBox<String> jCBox1 , jCBox2;
        JTextField idField, width, depth;

        jCBox1 = new JComboBox<>();
        jCBox2 = new JComboBox<>();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l11 = new JLabel();
        l12 = new JLabel();
        l13 = new JLabel();
        idField = new JTextField();
        width = new JTextField();
        depth = new JTextField();
        // End of variables declaration
        /**
         * Variable Fonts setting
         */
        // Labels
        l1.setBackground(new java.awt.Color(51, 204, 255));
        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setText("Add_Desk");
        l1.setOpaque(true);

        l2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l2.setText("Item_ID");

        l3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l3.setText("Quantity");

        l4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l4.setText("Type_Of_Wood");

        l5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l5.setText("Number_Of_Drawers");

        l6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l6.setText("Height");

        l7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l7.setText("Width");

        l8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l8.setText("Depth");

        l9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l9.setText("80 cm.");

        l10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l10.setText("cm.");

        l11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l11.setText("cm");

        l12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l12.setText("Dimensions of Desk");
        
        l13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l13.setText("x");


        // JComboBox
        jCBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Walnut Wood", "Oak Wood"}));
        jCBox2.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        // JTextFields
        idField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idField.setText("u003");
        idField.setOpaque(true);
        Quantity.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        Quantity.setHorizontalAlignment(JLabel.CENTER);
        Quantity.setText("1");
        Quantity.setOpaque(true);
        width.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        width.setText("50");
        width.setOpaque(true);
        depth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        depth.setText("50");
        depth.setOpaque(true);
        

        /**
         * Layouts of Add_Desk Frame
         */
        GroupLayout jPanel1Layout = new GroupLayout(Panel1);
        Panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(l12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l4, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBox1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l13, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            )
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l9, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l8, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(depth))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(width, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l10, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(l11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(l13, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addComponent(l3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l4, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBox2, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jCBox1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l12, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l6, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(l10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(width)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(l7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
                    .addComponent(l11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depth, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(l8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        );// End of Layout Declaration

        // Frame - Add_Desk
        F3.setTitle("Add Desk");
        F3.add(Panel1);
        F3.setSize(386, 285);
        F3.pack();
        F3.setVisible(false);
        F3.setResizable(false);
        c = JOptionPane.showConfirmDialog(F3, Panel1, "Furniture System", JOptionPane.OK_CANCEL_OPTION);
        /**
         * Validation of Item Chair
         */
        // when Cancel button is opted  // Not Wanted to buy a chair 
        if (c == JOptionPane.CANCEL_OPTION) {
            JOptionPane.getRootFrame();
        }
        boolean ans = ValidateID(idField.getText()); /// confirming iTem Id
        boolean ans2 = ValidateWidthandDepth(width.getText(), depth.getText());   /// Confirming Item Width and Depth
        
        if (ans2 == false) {
            JOptionPane.showMessageDialog(null, "Wrong Depth and Width of Desk, Please Re-Enter", "Furniture System", JOptionPane.INFORMATION_MESSAGE);
            Frame3();
            pnt--;;
        } else if (ans == false) {
            JOptionPane.showMessageDialog(null, "Wrong ItemID !!. Please Re-Enter","Furniture System",JOptionPane.INFORMATION_MESSAGE);
            Frame3();
            pnt--;
        }
        else {
        // update the classes (Desk Class)
        objDesk.setId(idField.getText());
        objDesk.setQyt(Integer.parseInt(Quantity.getText()));
        int a = jCBox1.getSelectedIndex();
        objDesk.setWoodType(jCBox1.getItemAt(a));
        int b = jCBox2.getSelectedIndex();
        objDesk.setdrawerNum(Integer.parseInt(jCBox2.getItemAt(b)));
        objDesk.setwidth(Integer.parseInt(width.getText()));
        objDesk.setdepth(Integer.parseInt(depth.getText()));
        objDesk.setprice(p.DeskPrice(objDesk));
            do {
                if (c == JOptionPane.OK_OPTION) {
                    double DeskPrice = p.DeskPrice(objDesk);
                    k = JOptionPane.showConfirmDialog(null, "Your Item Price is : £"+DeskPrice, "Furniture System", JOptionPane.OK_CANCEL_OPTION , JOptionPane.INFORMATION_MESSAGE);

                    if (k == JOptionPane.CANCEL_OPTION) {
                        Frame3();
                        pnt--;
                    } else {
                        list.add(objDesk.toString());
                        System.out.println(list);
                    }
                    break;
                }

            } while (k != JOptionPane.OK_OPTION);
            if (c == JOptionPane.CANCEL_OPTION) {
                pnt--;
            }
        }
  pnt++; 
}// </editor-fold> // Trigger Add-Table Button

    /**
     * Validation methods 
     * @return 
     */
    public static int getListSize() {
        return pnt;
    }

    public static void setListSize(int pntt) {
        pnt = pntt;
    }
    public boolean ValidateID(String txt){           
        if(null == txt ){
        return false;}else // valadating ID
     switch (txt) {
         case "u001":
             return true;
         case "u002":
             return true;
         case "u003":
             return true;
         default:
             return false;
     }
       
    }
    public boolean ValidateWidthandDepth(String width, String depth){
        int w = Integer.parseInt(width);      // valaditating Depth and Width
        int d = Integer.parseInt(depth);
        if(w >=50 && d >=50){
            return true;
        }else if(w>=50 && d<50){
           return false; 
        }else if(w<50 && w>=50){
           return false; 
        }else{
        return false;}
       
    }
  
}

