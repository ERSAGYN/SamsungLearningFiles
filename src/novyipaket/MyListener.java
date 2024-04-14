package novyipaket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    JFrame frame;

    public MyListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        String c = e.getActionCommand();
        if(c.equals("выхд")) {
            System.exit(0);
        } else if (c.equals("желт")) {
            frame.getContentPane().setBackground(Color.ORANGE);
        } else if(c.equals("син")){
            frame.getContentPane().setBackground(Color.CYAN);
        }
    }
}
