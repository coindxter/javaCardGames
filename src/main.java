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

        //Main Menu Panel
        JPanel mainMenuPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);
        f.add(mainMenuPanel, "Main Menu");

        //Game Panels
        blackjack blackjackGame = new blackjack(cardLayout, f);
        gofish gofishGame = new gofish(cardLayout, f);
        memory memoryGame = new memory(cardLayout, f);
        poker pokerGame = new poker(cardLayout, f);
        trash trashGame = new trash(cardLayout, f);
        war warGame = new war(cardLayout, f);

        // Add game panels to CardLayout
        f.add(blackjackGame.getPanel(), "Blackjack");
        f.add(gofishGame.getPanel(), "Go Fish");
        f.add(memoryGame.getPanel(), "Memory");
        f.add(pokerGame.getPanel(), "Poker");
        f.add(trashGame.getPanel(), "Trash");
        f.add(warGame.getPanel(), "War");

        //Main Menu buttons
        JButton blackjackButton = UIHelper.createButton("Blackjack", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 100, 100, 400, 250);
        JButton gofishButton = UIHelper.createButton("Go Fish", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 600, 100, 400, 250);
        JButton memoryButton = UIHelper.createButton("Memory", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 1100, 100, 400, 250);  
        JButton pokerButton = UIHelper.createButton("Poker", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 600, 400, 400, 250);
        JButton trashButton = UIHelper.createButton("Trash", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 100, 400, 400, 250);
        JButton warButton = UIHelper.createButton("War", UIHelper.ColorPalette.BLUE, 400, 250, mainMenuPanel, 1100, 400, 400, 250);

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

        memoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "Memory");  
            }    
        });

        pokerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "Poker");  
            }    
        });

        trashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "Trash");
            }
        });

        warButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(f.getContentPane(), "War");
            }
        });
        f.setVisible(true);
    }
}
