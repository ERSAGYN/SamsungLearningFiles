package novyipaket;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("jjkjkj");
        frame.setBounds(300, 300, 850, 400);


        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("PECHAT");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("KEY PPPRESED");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("ERALEESDA");
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 27) System.exit(0);
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
