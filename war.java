import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class war {

    @SuppressWarnings("unused")
    JFrame mainFrame; 

    @SuppressWarnings("Convert2Lambda")
    public war(JFrame mainFrame) {
        this.mainFrame = mainFrame;  

        JFrame f = UIHelper.createFrame(1600, 800, UIHelper.ColorPalette.GREEN, true);

        JButton mainMenu = UIHelper.createButton("Main Menu", UIHelper.ColorPalette.RED, 100, 50, f.getContentPane(), 0, 0, 100, 50);
        JButton playButton = UIHelper.createButton("Play Card", UIHelper.ColorPalette.BLUE, 400, 250, f.getContentPane(), 300, 200, 400, 250);

        mainMenu.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true); 
                f.setVisible(false); 
            }
        });

        playButton.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                System.out.println("Play Card button clicked");
            }
        });
    }
}
