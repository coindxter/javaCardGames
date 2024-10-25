package src;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class trash {
    JPanel trashPanel;
    ArrayList<JButton> list = new ArrayList<>();

    @SuppressWarnings("Convert2Lambda")
    public trash(CardLayout cardLayout, JFrame frame) {
        trashPanel = UIHelper.createPanel(UIHelper.ColorPalette.GREEN, null);

        JButton drawCardButton = UIHelper.createButton("Draw Card", UIHelper.ColorPalette.RED, 100, 50, trashPanel, 50, 300, 100, 50);
        JButton backButton = UIHelper.createButton("Back to Menu", UIHelper.ColorPalette.RED, 200, 50, trashPanel, 50, 700, 200, 50);

        int x = 530;
        int y = 10;
        for (int i = 0; i < 10; i++) {
            JButton card = UIHelper.createButton("Card", UIHelper.ColorPalette.BLUE, 100, 50, trashPanel, x, y, 100, 50);
            x += 110;
            if ((i + 1) % 5 == 0) {
                y += 160;
                x = 530;
            }
            list.add(card);
        }

        int a = 530;
        int b = 370;
        for (int j = 0; j < 10; j++) {
            JButton playerCard = UIHelper.createButton("Card", UIHelper.ColorPalette.BLUE, 100, 50, trashPanel, a, b, 100, 50);
            a += 110;
            if ((j + 1) % 5 == 0) {
                b += 160;
                a = 530;
            }
            list.add(playerCard);
        }

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Main Menu");
            }
        });
    }

    public JPanel getPanel() {
        return trashPanel;
    }
}
