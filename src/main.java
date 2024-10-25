package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        
        JFrame f = UIHelper.createFrame(1600, 800, UIHelper.ColorPalette.GREEN, true);
        CardLayout cardLayout = new CardLayout();
        f.setLayout(cardLayout);

        JPanel mainMenuPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);
        f.add(mainMenuPanel, "Main Menu");

        blackjack blackjackGame = new blackjack(cardLayout, f);
        gofish gofishGame = new gofish(cardLayout, f);

        f.add(blackjackGame.getPanel(), "Blackjack");
        f.add(gofishGame.getPanel(), "Go Fish");

        JButton blackjackButton = UIHelper.createButton("Blackjack", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 100, 100, 400, 250);
        JButton gofishButton = UIHelper.createButton("Go Fish", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 600, 100, 400, 250);

        blackjackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "Blackjack");  
            }
        });
        gofishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "Go Fish");  
            }
        });
        f.setVisible(true);
    }
}
