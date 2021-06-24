package framedemo_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo1 extends JFrame implements ActionListener, WindowListener {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    private JTextField textField1;
    private int count;

    public FrameDemo1(String title) {
        super(title);
        button1 = new JButton("Print Hello!");
        button2 = new JButton("Print GoodBye!");
        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        textField1 = new JTextField(20);
        getContentPane().add(textField1);
        getContentPane().add(panel, BorderLayout.SOUTH);
        getContentPane().add(new DrawingPanel());
        button1.addActionListener(this);
        button2.addActionListener(this);
        addWindowListener(this);
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
        if (event.getSource() == button1) {
            textField1.setText("Hello");
        } else if (event.getSource() == button2) {
            textField1.setText("GoodBye!");
        }
    }

    public static void main(String[] args) {
        new FrameDemo1("My example of Frame");
    }

    private class DrawingPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.drawRect(30, 750, 100, 50);
            g.drawOval(30,400, 50, 50);
            g.draw3DRect(600, 750, 20, 30, false);
            g.drawString("Java", 100, 200);
        }
    }
}

