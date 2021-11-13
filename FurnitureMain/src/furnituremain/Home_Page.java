/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituremain;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * W9359412
 * Layout setup of Home Page
 * @author JATIN ANEJA
 */
public  class Home_Page extends JPanel  implements MouseListener{
    JFrame F1,F2,F3;  // Chair , Table , Desk frames
    JLabel Title = new JLabel();
    static JLabel Ml1, Ml2, Ml3, Ml4, Ml5, Ml6, Ml7, Ml8, Ml9; // ImageIcon Labels
    Dimension d = new Dimension(300, 300);
    JPanel ImgPanel ;
SystemFrames f = new SystemFrames();

/*
    Default Contructors
*/
public Home_Page() {
        AllButtons mybt = new AllButtons();

        Title = new JLabel();
        ImgPanel = new JPanel();

        Ml1 = new  JLabel();
        Ml2 = new  JLabel();
        Ml3 = new  JLabel();
        Ml4 = new  JLabel();
        Ml5 = new  JLabel();
        Ml6 = new  JLabel();
        Ml7 = new  JLabel();
        Ml8 = new  JLabel();
        Ml9 = new  JLabel();

        // Add mouse Listener
        Ml1.addMouseListener(this);
        Ml2.addMouseListener(this);
        Ml3.addMouseListener(this);
        Ml4.addMouseListener(this);
        Ml5.addMouseListener(this);
        Ml6.addMouseListener(this);
        Ml7.addMouseListener(this);
        Ml8.addMouseListener(this);
        Ml9.addMouseListener(this);



        Title.setBackground(new  Color(255, 0, 51));
        Title.setFont(new  Font("Trebuchet MS", 1, 20)); // NOI18N
        Title.setForeground(new  Color(255, 255, 0));
        Title.setText("Real Office  Furniture Company (ROFC).");
        Title.setOpaque(true);

        this.setBackground(Color.decode("#0033EE"));
        this.setOpaque(true);

        mybt.Add_Chair.setFont(new  Font("Tahoma", 1, 11)); // NOI18N
        mybt.Add_Chair.setText("ADD_Chair");

        mybt.Add_Desk.setFont(new  Font("Tahoma", 1, 11)); // NOI18N
        mybt.Add_Desk.setText("ADD_Desk");

        mybt.Add_Table.setFont(new  Font("Tahoma", 1, 11)); // NOI18N
        mybt.Add_Table.setText("ADD_Table");

        mybt.Save.setFont(new  Font("Tahoma", 1, 12)); // NOI18N
        mybt.Save.setText("Save");

        mybt.ToTal_Price.setFont(new  Font("Tahoma", 1, 12)); // NOI18N
        mybt.ToTal_Price.setText("Total");

        mybt.Load_Data.setFont(new  Font("Tahoma", 1, 12)); // NOI18N
        mybt.Load_Data.setText("Load");

        mybt.ClearAll.setFont(new  Font("Tahoma", 1, 12)); // NOI18N
        mybt.ClearAll.setText("ClearAll");


        ImgPanel.setBackground(new  Color(0, 51, 51));

        Ml1.setOpaque(true); //2
        Ml2.setOpaque(true);//3
        Ml3.setOpaque(true);//4
        Ml4.setOpaque(true);//5
        Ml5.setOpaque(true);//6
        Ml6.setOpaque(true);//7
        Ml7.setOpaque(true);//8
        Ml8.setOpaque(true);//9
        Ml9.setOpaque(true);//10

    /**
     * Horizontal Layout grouping of Labels , panel2 etc...
     */
         GroupLayout jPanel2Layout = new  GroupLayout(ImgPanel);
        ImgPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ml7,  GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(Ml4,  GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(Ml1,  GroupLayout.DEFAULT_SIZE,  123, Short.MAX_VALUE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ml2,  GroupLayout.DEFAULT_SIZE,  123, Short.MAX_VALUE)
                    .addComponent(Ml5,  GroupLayout.DEFAULT_SIZE,  123, Short.MAX_VALUE)
                    .addComponent(Ml8,  GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(Ml3,  GroupLayout.DEFAULT_SIZE,123, Short.MAX_VALUE)
                    .addComponent(Ml6,  GroupLayout.DEFAULT_SIZE,  123, Short.MAX_VALUE)
                    .addComponent(Ml9,  GroupLayout.DEFAULT_SIZE,  123, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ml3,  GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(Ml2,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE)
                    .addComponent(Ml1,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ml6,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE)
                    .addComponent(Ml5,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE)
                    .addComponent(Ml4,  GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(Ml9,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE)
                    .addComponent(Ml8,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE)
                    .addComponent(Ml7,  GroupLayout.DEFAULT_SIZE,  102, Short.MAX_VALUE))
                .addContainerGap())
        );
    /**
     * Horizontal Layout grouping of Labels , panel1(main panel) etc...
     */
         GroupLayout jPanel1Layout = new  GroupLayout(this);
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(Title,  GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(mybt.Add_Chair,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.Add_Desk,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.Add_Table,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.Save,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.ToTal_Price,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.Load_Data,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(mybt.ClearAll,  GroupLayout.PREFERRED_SIZE, 97,  GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ImgPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
            /**
     * vertical Layout grouping of Labels , panel etc...
     */
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title,  GroupLayout.PREFERRED_SIZE, 51,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mybt.Add_Chair,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.Add_Desk,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.Add_Table,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.Save,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.ToTal_Price,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.Load_Data,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mybt.ClearAll,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ImgPanel,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

}

/**
 * Mouse Click Events 
 * Remove on Middle Click , DisPlay Details of Item on Left Click and Edit Item On Right Click
 * @param e 
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        AllButtons bts = new AllButtons();
        if (e.getSource() == Ml1) {
            switch (e.getButton()) {
                // remove
                case 2:            /// mouse Middle Click
                   int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml1.setIcon(Ml2.getIcon());
                    Ml2.setIcon(Ml3.getIcon());
                    Ml3.setIcon(Ml4.getIcon());
                    Ml4.setIcon(Ml5.getIcon());
                    Ml5.setIcon(Ml6.getIcon());
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(0)); // removing the item and iterating the items to deleted item position
                    System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:           // mouse Right Click
                    if (Ml1.getIcon() == bts.a || Ml1.getIcon() == bts.b || Ml1.getIcon() == bts.c || Ml1.getIcon() == bts.d) {
                        Ml1.setIcon(Ml2.getIcon());
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(0));
                        f.pnt--;
                        bts.Add_Chair.doClick();
                    } else if (Ml1.getIcon() == bts.e || Ml1.getIcon() == bts.f) {
                        Ml1.setIcon(Ml2.getIcon());
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(0));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml1.getIcon() == bts.g || Ml1.getIcon() == bts.h) {
                        Ml1.setIcon(Ml2.getIcon());
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(0));
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:            // Mouse Left Click
                    if (Ml1.getIcon() == bts.a || Ml1.getIcon() == bts.b || Ml1.getIcon() == bts.c || Ml1.getIcon() == bts.d) {
                        DetailsChair(0);
                    } else if (Ml1.getIcon() == bts.e || Ml1.getIcon() == bts.f) {
                        DetailsTable(0);
                    } else if (Ml1.getIcon() == bts.g || Ml1.getIcon() == bts.h) {
                        DetailsDesk(0);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml2) {
            switch (e.getButton()) {
                // remove
                case 2:           /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml2.setIcon(Ml3.getIcon());
                    Ml3.setIcon(Ml4.getIcon());
                    Ml4.setIcon(Ml5.getIcon());
                    Ml5.setIcon(Ml6.getIcon());
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(1));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:           // mouse Right Click
                    if (Ml2.getIcon() == bts.a || Ml2.getIcon() == bts.b || Ml2.getIcon() == bts.c || Ml2.getIcon() == bts.d) {
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(1));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml2.getIcon() == bts.e || Ml2.getIcon() == bts.f) {
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(1));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml2.getIcon() == bts.g || Ml2.getIcon() == bts.h) {
                        Ml2.setIcon(Ml3.getIcon());
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(1));
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:          // Mouse Left Click
                    if (Ml2.getIcon() == bts.a || Ml2.getIcon() == bts.b || Ml2.getIcon() == bts.c || Ml2.getIcon() == bts.d) {
                        DetailsChair(1);
                    } else if (Ml2.getIcon() == bts.e || Ml2.getIcon() == bts.f) {
                        DetailsTable(1);
                    } else if (Ml2.getIcon() == bts.g || Ml2.getIcon() == bts.h) {
                        DetailsDesk(1);
                    }
                    break;
                default:
                    break;
            }

        } else if (e.getSource() == Ml3) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                 int c =  JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml3.setIcon(Ml4.getIcon());
                    Ml4.setIcon(Ml5.getIcon());
                    Ml5.setIcon(Ml6.getIcon());
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(2));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml3.getIcon() == bts.a || Ml3.getIcon() == bts.b || Ml3.getIcon() == bts.c || Ml3.getIcon() == bts.d) {
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(2));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml3.getIcon() == bts.e || Ml3.getIcon() == bts.f) {
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(2));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml3.getIcon() == bts.g || Ml3.getIcon() == bts.h) {
                        Ml3.setIcon(Ml4.getIcon());
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(2));
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml3.getIcon() == bts.a || Ml3.getIcon() == bts.b || Ml3.getIcon() == bts.c || Ml3.getIcon() == bts.d) {
                        DetailsChair(2);
                    } else if (Ml3.getIcon() == bts.e || Ml3.getIcon() == bts.f) {
                        DetailsTable(2);
                    } else if (Ml3.getIcon() == bts.g || Ml3.getIcon() == bts.h) {
                        DetailsDesk(2);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml4) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml4.setIcon(Ml5.getIcon());
                    Ml5.setIcon(Ml6.getIcon());
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(3));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml4.getIcon() == bts.a || Ml4.getIcon() == bts.b || Ml4.getIcon() == bts.c || Ml4.getIcon() == bts.d) {
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(3));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml4.getIcon() == bts.e || Ml4.getIcon() == bts.f) {
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(3));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml4.getIcon() == bts.g || Ml4.getIcon() == bts.h) {
                        f.list.remove(f.list.get(3));
                        Ml4.setIcon(Ml5.getIcon());
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml4.getIcon() == bts.a || Ml4.getIcon() == bts.b || Ml4.getIcon() == bts.c || Ml4.getIcon() == bts.d) {
                        DetailsChair(3);
                    } else if (Ml4.getIcon() == bts.e || Ml4.getIcon() == bts.f) {
                        DetailsTable(3);
                    } else if (Ml4.getIcon() == bts.g || Ml4.getIcon() == bts.h) {
                        DetailsDesk(3);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml5) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml5.setIcon(Ml6.getIcon());
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(4));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml5.getIcon() == bts.a || Ml5.getIcon() == bts.b || Ml5.getIcon() == bts.c || Ml5.getIcon() == bts.d) {
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(4));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml5.getIcon() == bts.e || Ml5.getIcon() == bts.f) {
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(4));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml5.getIcon() == bts.g || Ml5.getIcon() == bts.h) {
                        f.list.remove(f.list.get(4));
                        Ml5.setIcon(Ml6.getIcon());
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml5.getIcon() == bts.a || Ml5.getIcon() == bts.b || Ml5.getIcon() == bts.c || Ml5.getIcon() == bts.d) {
                        DetailsChair(4);
                    } else if (Ml5.getIcon() == bts.e || Ml5.getIcon() == bts.f) {
                        DetailsTable(4);
                    } else if (Ml5.getIcon() == bts.g || Ml5.getIcon() == bts.h) {
                        DetailsDesk(4);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml6) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml6.setIcon(Ml7.getIcon());
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(5));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml6.getIcon() == bts.a || Ml6.getIcon() == bts.b || Ml6.getIcon() == bts.c || Ml6.getIcon() == bts.d) {
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(5));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml6.getIcon() == bts.e || Ml6.getIcon() == bts.f) {
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(5));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml6.getIcon() == bts.g || Ml6.getIcon() == bts.h) {
                        f.list.remove(f.list.get(5));
                        Ml6.setIcon(Ml7.getIcon());
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml6.getIcon() == bts.a || Ml6.getIcon() == bts.b || Ml6.getIcon() == bts.c || Ml6.getIcon() == bts.d) {
                        DetailsChair(5);
                    } else if (Ml6.getIcon() == bts.e || Ml6.getIcon() == bts.f) {
                        DetailsTable(5);
                    } else if (Ml6.getIcon() == bts.g || Ml6.getIcon() == bts.h) {
                        DetailsDesk(5);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml7) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml7.setIcon(Ml8.getIcon());
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(6));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml7.getIcon() == bts.a || Ml7.getIcon() == bts.b || Ml7.getIcon() == bts.c || Ml7.getIcon() == bts.d) {
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(6));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml7.getIcon() == bts.e || Ml7.getIcon() == bts.f) {
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(6));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml7.getIcon() == bts.g || Ml7.getIcon() == bts.h) {
                        f.list.remove(f.list.get(6));
                        Ml7.setIcon(Ml8.getIcon());
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml7.getIcon() == bts.a || Ml7.getIcon() == bts.b || Ml7.getIcon() == bts.c || Ml7.getIcon() == bts.d) {
                        DetailsChair(6);
                    } else if (Ml7.getIcon() == bts.e || Ml7.getIcon() == bts.f) {
                        DetailsTable(6);
                    } else if (Ml7.getIcon() == bts.g || Ml7.getIcon() == bts.h) {
                        DetailsDesk(6);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml8) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml8.setIcon(Ml9.getIcon());
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(7));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml8.getIcon() == bts.a || Ml8.getIcon() == bts.b || Ml8.getIcon() == bts.c || Ml8.getIcon() == bts.d) {
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(7));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml8.getIcon() == bts.e || Ml8.getIcon() == bts.f) {
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(7));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml8.getIcon() == bts.g || Ml8.getIcon() == bts.h) {
                        f.list.remove(f.list.get(7));
                        Ml8.setIcon(Ml9.getIcon());
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml8.getIcon() == bts.a || Ml8.getIcon() == bts.b || Ml8.getIcon() == bts.c || Ml8.getIcon() == bts.d) {
                        DetailsChair(7);
                    } else if (Ml8.getIcon() == bts.e || Ml8.getIcon() == bts.f) {
                        DetailsTable(7);
                    } else if (Ml8.getIcon() == bts.g || Ml8.getIcon() == bts.h) {
                        DetailsDesk(7);
                    }
                    break;
                default:
                    break;
            }
        } else if (e.getSource() == Ml9) {
            switch (e.getButton()) {
                // remove
                case 2:         /// mouse Middle Click
                    int c = JOptionPane.showConfirmDialog(null,"Do you want to Remove thsi Item?? " , "Furniture System" , JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(c == JOptionPane.OK_OPTION){
                    Ml9.setIcon(null);
                    f.list.remove(f.list.get(8));
                     System.out.println(f.list);
                    f.pnt--;}
                    break;
                // edit
                case 3:       // mouse Right Click
                    if (Ml9.getIcon() == bts.a || Ml9.getIcon() == bts.b || Ml9.getIcon() == bts.c || Ml9.getIcon() == bts.d) {
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(8));
                        f.pnt--;
                        bts.Add_Chair.doClick();

                    } else if (Ml9.getIcon() == bts.e || Ml9.getIcon() == bts.f) {
                        Ml9.setIcon(null);
                        f.list.remove(f.list.get(8));
                        f.pnt--;
                        bts.Add_Table.doClick();
                    } else if (Ml9.getIcon() == bts.g || Ml5.getIcon() == bts.h) {
                        f.list.remove(f.list.get(8));
                        Ml9.setIcon(null);
                        f.pnt--;
                        bts.Add_Desk.doClick();
                    }
                    break;
                // details
                case 1:         // Mouse Left Click
                    if (Ml9.getIcon() == bts.a || Ml9.getIcon() == bts.b || Ml9.getIcon() == bts.c || Ml9.getIcon() == bts.d) {
                        DetailsChair(8);
                    } else if (Ml9.getIcon() == bts.e || Ml9.getIcon() == bts.f) {
                        DetailsTable(8);
                    } else if (Ml9.getIcon() == bts.g || Ml5.getIcon() == bts.h) {
                        DetailsDesk(8);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Details Methods to Be displayed on Left Click
     * @param i 
     */
    public void DetailsChair(int i) {

        String[] str;
        str = f.list.get(i).split(",");

        String output = "Item_Name : Chair \n"+"ItemId : " + str[0] + "\n" + "Quantity : " + str[1] + "\n"
                + "Type_Of_Wood : " + str[2]+ "\n" + "Price of Item :" + str[3]+ "\n" + "Armrest_Required :" + str[4];
        JOptionPane.showMessageDialog(null, output);

    }

    public void DetailsTable(int i) {

        String[] str;
        str = f.list.get(i).split(",");

        String output = "Item_Name : Table \n"+ "ItemId : " + str[0] + "\n" + "Quantity : " + str[1] + "\n"
                + "Type_Of_Wood : " + str[2] + "\n" + "Price of Item :" + str[3]+"\n"+ "Diameter :" + str[4] +" cm"+ "\n"
                + "Base Type :" + str[5] + "\n";
        JOptionPane.showMessageDialog(null, output);

    }

    public void DetailsDesk(int i) {

        String[] str;
        str = f.list.get(i).split(",");

        String output = "Item_Name : Desk \n" +"ItemId : " + str[0] + "\n" + "Quantity : " + str[1] + "\n"
                + "Type_Of_Wood : " + str[2] + "\n" + "Price of Item :" + str[3]+"\n"+ "Height :" + str[4]  + " cm"+ "\n"
                + "Width:" + str[5] + " cm" + "\n" + "depth :" + str[6] +" cm"+ "\n" +
                "Number of Drawers :" + str[7] +"\n";
        JOptionPane.showMessageDialog(null, output);

    }

}
