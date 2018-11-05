import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.geom.*;
public class ChristmasTree
{
    JFrame frame;
    JPanel intro;
    
    public ChristmasTree()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon border = new ImageIcon("christmas-holly-930.png");
        JLabel label3 = new JLabel(border);
        
        frame.add(label3);
        
        intro = new JPanel();
        
        frame.setPreferredSize(new Dimension(900, 1000));
        
        
        
        frame.getContentPane().add(intro);
        frame.pack();
        frame.setVisible(true);
    }
}
