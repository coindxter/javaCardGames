// Imports
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class trash {

    @SuppressWarnings("unused")
    JFrame mainFrame;  
    JFrame f = new JFrame();  


    @SuppressWarnings("Convert2Diamond")
    ArrayList<JButton> list = new ArrayList<JButton>();

    @SuppressWarnings("Convert2Lambda")
    public trash(JFrame mainFrame) {
        this.mainFrame = mainFrame; 

        JFrame f = UIHelper.createFrame(1600, 800, UIHelper.ColorPalette.GREEN, true);


        JButton mainMenu = UIHelper.createButton("Main Menu", UIHelper.ColorPalette.RED, 100, 50, f.getContentPane(), 10, 700, 100, 50);
        JButton drawCard = UIHelper.createButton("Draw Card", UIHelper.ColorPalette.RED, 100, 50, f.getContentPane(), 50, 300, 100, 50);

        int x = 530;
        int y = 10;
        for (int i = 0; i < 10; i++) {
            JButton card = UIHelper.createButton("Card", UIHelper.ColorPalette.BLUE, 100, 50, f.getContentPane(), x, y, 100, 50);
            x = x + 110;
            if ((i + 1) % 5 == 0) {
                y = y + 160;
                x = 530;
            }
            list.add(card); 
        }

        int a = 530;
        int b = 370;
        for (int j = 0; j < 10; j++) {
            JButton playerCard = UIHelper.createButton("Card", UIHelper.ColorPalette.BLUE, 100, 50, f.getContentPane(), a, b, 100, 50);
            a = a + 110;
            if ((j + 1) % 5 == 0) {
                b = b + 160;
                a = 530;
            }
            list.add(playerCard); 
        }

        mainMenu.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true); 
                f.setVisible(false);  
            }
        });

        drawCard.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                System.out.println("Draw card clicked");
            }
        });
    }
}
