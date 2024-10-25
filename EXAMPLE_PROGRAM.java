//This class takes care of the graphical user interface (GUI)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EXAMPLE_PROGRAM {

    // Make a frame
    JFrame frame = new JFrame("Example App");

    //Make a text field
    JTextField a = new JTextField();

    //Make a button
    JButton b = new JButton("Get Weather");

     public EXAMPLE_PROGRAM() {

        //Add buttons to the frame
        frame.add(a);
        frame.add(b);

        //Set up the frame
        frame.setSize(400, 225);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Make the button clickable
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("The button was pressed!");
            }
        });

     }

}

