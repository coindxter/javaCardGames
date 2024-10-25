import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class blackjack {
    JPanel blackjackPanel;
    @SuppressWarnings({ "Convert2Lambda", "unused" })
    public blackjack(CardLayout cardLayout, JFrame frame) {
        blackjackPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);

        JButton hitButton = UIHelper.createButton("Hit", UIHelper.ColorPalette.BLUE, 100, 50, blackjackPanel, 300, 200, 100, 50);
        JButton standButton = UIHelper.createButton("Stand", UIHelper.ColorPalette.BLUE, 100, 50, blackjackPanel, 450, 200, 100, 50);
        JButton betButton = UIHelper.createButton("Bet", UIHelper.ColorPalette.BLUE, 100, 50, blackjackPanel, 600, 200, 100, 50);
        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, blackjackPanel, 50, 700, 200, 50);
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu");  
            }
        });
    }
    public JPanel getPanel() {
        return blackjackPanel;
    }
}
