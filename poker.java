// Imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class poker {
  
    @SuppressWarnings("unused")
    JFrame mainFrame; 
    JFrame f = new JFrame(); 

    @SuppressWarnings("Convert2Lambda")
    public poker(JFrame mainFrame) {
        this.mainFrame = mainFrame; 

        JFrame f = UIHelper.createFrame(1600, 800, UIHelper.ColorPalette.GREEN, true);


        JButton checkButton = UIHelper.createButton("Check", UIHelper.ColorPalette.BLUE, 100, 50, f.getContentPane(), 300, 300, 100, 50);
        JButton betButton = UIHelper.createButton("Bet", UIHelper.ColorPalette.BLUE, 100, 50, f.getContentPane(), 450, 300, 100, 50);
        JButton mainMenu = UIHelper.createButton("Main Menu", UIHelper.ColorPalette.RED, 100, 50, f.getContentPane(), 600, 300, 100, 50);

        JTextField pokerText = UIHelper.createTextField(500, 400, 400, 250, f);

        mainMenu.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true); 
                f.setVisible(false); 
            }
        });

        checkButton.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                System.out.println("Check button clicked");
            }
        });

        betButton.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bet button clicked");
            }
        });
    }
}
