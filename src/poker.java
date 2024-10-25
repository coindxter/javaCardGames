package src;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class poker {
  
    JPanel pokerPanel;
    @SuppressWarnings("Convert2Lambda")
    public poker(CardLayout cardLayout, JFrame frame) {

        pokerPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);

        JButton checkButton = UIHelper.createButton("Check", UIHelper.ColorPalette.BLUE, 100, 50, pokerPanel, 300, 300, 100, 50);
        JButton betButton = UIHelper.createButton("Bet", UIHelper.ColorPalette.BLUE, 100, 50, pokerPanel, 450, 300, 100, 50);
        JButton mainMenu = UIHelper.createButton("Main Menu", UIHelper.ColorPalette.RED, 100, 50, pokerPanel, 600, 300, 100, 50);
        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, pokerPanel, 50, 700, 200, 50);
        JTextField pokerText = UIHelper.createTextField(500, 400, 400, 250, pokerPanel);
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu");  
            }
        });
    }
    public JPanel getPanel() {
        return pokerPanel;
    }

    
}
