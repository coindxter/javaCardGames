package src;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class war {

    JPanel warPanel;

    @SuppressWarnings("Convert2Lambda")
    public war(CardLayout cardLayout, JFrame frame) {

        warPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);

        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, warPanel, 50, 700, 200, 50);
        JButton playButton = UIHelper.createButton("Play Card", UIHelper.ColorPalette.BLUE, 400, 250, warPanel, 300, 200, 400, 250);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu");  
            }
        });
    }
    public JPanel getPanel() {
        return warPanel;
    }
}
