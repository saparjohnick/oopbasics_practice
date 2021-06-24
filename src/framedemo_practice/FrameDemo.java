package framedemo_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo extends JFrame implements ActionListener, WindowListener {
    private JButton button1;
    private JTextField textField1;
    private int count;

    public FrameDemo(String title) {
        super(title);
        button1 = new JButton("OK");
        textField1 = new JTextField(20);
        getContentPane().add(textField1);
        getContentPane().add(button1, BorderLayout.SOUTH);
        button1.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void windowOpened(WindowEvent event) {}
    public void windowIconified(WindowEvent event) {}
    public void windowDeiconified(WindowEvent event) {}
    public void windowClosed(WindowEvent event) {}
    public void windowActivated(WindowEvent event) {}
    public void windowDeactivated(WindowEvent event) {}
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent event) {
        textField1.setText("You clicked " + ++count + " times so far.");
    }

    public static void main(String[] args) {
        new FrameDemo("My example of Frame");
    }
}
