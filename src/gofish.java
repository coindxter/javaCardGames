package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gofish {
    JPanel gofishPanel; 

    @SuppressWarnings("Convert2Lambda")
    public gofish(CardLayout cardLayout, JFrame frame) {
        gofishPanel = UIHelper.createPanel(UIHelper.ColorPalette.BLUE, null);

        JButton askForCardButton = UIHelper.createButton("Ask for a card", UIHelper.ColorPalette.YELLOW, 150, 50, gofishPanel, 300, 200, 150, 50);
        JButton drawCardButton = UIHelper.createButton("Draw Card", UIHelper.ColorPalette.YELLOW, 150, 50, gofishPanel, 500, 200, 150, 50);
        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, gofishPanel, 50, 700, 200, 50);
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu"); 
            }
        });

        askForCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Player asked for a card!");
            }
        });

        drawCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Player drew a card!");
            }
        });
    }

    public JPanel getPanel() {
        return gofishPanel;
    }
}
