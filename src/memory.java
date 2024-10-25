package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class memory {

    JPanel memoryPanel; 
    ArrayList<JButton> list = new ArrayList<>(); 

    @SuppressWarnings("Convert2Lambda")
    public memory(CardLayout cardLayout, JFrame frame) {
        memoryPanel = UIHelper.createPanel(UIHelper.ColorPalette.YELLOW, null);

        JButton pickCard = UIHelper.createButton("Pick up a card", UIHelper.ColorPalette.BLUE, 100, 50, memoryPanel, 0, 0, 60, 45);

        int x = 0;
        int y = 50; 
        for (int i = 0; i < 52; i++) {
            JButton memoryButton = UIHelper.createButton("Card", UIHelper.ColorPalette.BLUE, 100, 50, memoryPanel, x, y, 60, 45);
            x += 65;
            if ((i + 1) % 13 == 0) {
                y += 50;
                x = 0;
            }
            list.add(memoryButton); 
        }

        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, memoryPanel, 50, 700, 200, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu");  
            }
        });
    }

    public JPanel getPanel() {
        return memoryPanel;
    }
}
