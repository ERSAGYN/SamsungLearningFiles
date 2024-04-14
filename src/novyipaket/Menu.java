package novyipaket;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("jjkjkj");
        MyListener listener = new MyListener(frame);
        frame.setBounds(300,300,850,400);
        JMenuBar mb = new JMenuBar();



        frame.setVisible(true);
        JMenu bg = new JMenu("FON");
        JMenu submenu = new JMenu("POD");
        JMenuItem blue = new JMenuItem("s");
        JMenuItem yellow = new JMenuItem("n");
        bg.add(blue);
        bg.add(yellow);
        bg.add(submenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Click");
                System.out.println(e.getX() + " " + e.getY());
                if(e.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("LKM");
                } else if(e.getButton() == MouseEvent.BUTTON2) {
                    System.out.println("WHL");
                } else if(e.getButton() == MouseEvent.BUTTON3){
                    System.out.println("PKM");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println("ZAJATA");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //System.out.println("OTJATA");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //System.out.println("VOSHLA");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
