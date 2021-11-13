/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furnituremain;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author JATIN ANEJA
 */
public final class First_Page extends JPanel {

    private final JLabel label1;

    private JButton login, Shop;

    public First_Page() {
        AllButtons bt = new AllButtons();
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.yellow);
        Dimension d = new Dimension(300, 30);

        label1 = new JLabel("Welcome to Real Office Furniture Company ");
        label1.setBackground(new java.awt.Color(102, 102, 255));
        label1.setForeground(new java.awt.Color(255, 255, 0));
        label1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 0)));
        label1.setPreferredSize(d);
        label1.setOpaque(true);
        add(label1, 0, 0, 1, 1, true);
        add(bt.Shop, 0, 1, 1, 1, false);
        add(bt.Load_Records, 0, 2, 1, 1, false);
        add(bt.exit, 0, 1, 1, 1, true);
    }

    public void add(Component c, int x, int y, int w, int h, boolean isLabel) {

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        if (isLabel) {
            gbc.anchor = GridBagConstraints.LINE_END;
        } else {
            gbc.anchor = GridBagConstraints.LINE_START;
        }
        gbc.insets = new Insets(5, 5, 5, 5);
        add(c, gbc);
    }
}
