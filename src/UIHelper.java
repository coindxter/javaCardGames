package src;
import java.awt.*;
import javax.swing.*;

public class UIHelper {
    public static class ColorPalette {
        public static final Color GREEN = new Color(53, 103, 48); 
        public static final Color RED = new Color(166, 26, 30);   
        public static final Color BLUE = new Color(135, 206, 235); 
        public static final Color YELLOW = new Color(255, 223, 0);  
        public static final Color BLACK = new Color(20, 20, 20); 
        public static final Color ORANGE = new Color(255, 69, 0);  
        public static final Color PURPLE = new Color(120, 81, 169);
        public static final Color PINK = new Color(255, 105, 180);  
    }
    public static JButton createButton(String text, Color backgroundColor, int width, int height, Container container, int x, int y, int containerWidth, int containerHeight) {
        JButton button = new JButton(text);
        button.setBackground(backgroundColor);
        button.setPreferredSize(new Dimension(width, height));
        addToContainer(container, button, x, y, containerWidth, containerHeight);
        return button;
    }
    public static JPanel createPanel(Color backgroundColor, LayoutManager layout) {
        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.setLayout(layout);
        return panel;
    }
    public static JScrollPane createScrollPane(JComponent component, int width, int height) {
        JScrollPane scrollPane = new JScrollPane(component);
        scrollPane.setPreferredSize(new Dimension(width, height));
        return scrollPane;
    }
    public static JTextField createTextField(int x, int y, int width, int height, Container container) {
        JTextField textField = new JTextField(); 
        textField.setBounds(x, y, width, height); 
        container.add(textField); 
        return textField;  
    }
    public static void addToContainer(Container container, JComponent component, int x, int y, int width, int height) {
        component.setBounds(x, y, width, height);
        container.add(component);
    }
    public static class CustomFrame extends JFrame {
        public CustomFrame(int width, int height, Color backgroundColor, boolean isVisible) {
            setSize(width, height);
            getContentPane().setBackground(backgroundColor);
            setLayout(null);
            setVisible(isVisible);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void setFrameTitle(String title) {
           setTitle(title);
        }

    }
    public static JFrame createFrame(int width, int height, Color backgroundColor, boolean isVisible) {
        JFrame frame = new JFrame(); 
        frame.setSize(width, height); 
        frame.getContentPane().setBackground(backgroundColor);  
        frame.setLayout(null);  
        frame.setVisible(isVisible); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        return frame;
    }
}
