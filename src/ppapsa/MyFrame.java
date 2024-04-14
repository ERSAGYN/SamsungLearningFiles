package ppapsa;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JTextField emailtf;
    private JTextField nametf;
    private JCheckBox news;
    public MyFrame (){
        super("Моя программа");
        setBounds(300,300,850,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        JLabel labelTitle = new JLabel("Моя форма");
        labelTitle.setFont(new Font("Arial",Font.BOLD,22));
        top.add(labelTitle);
        add(top,BorderLayout.NORTH);
        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());

        JLabel nameL = new JLabel("Имя: ");
        nametf = new JTextField();
        nametf.setPreferredSize(new Dimension(200,40));
        JLabel emailL = new JLabel("e-mail: ");
        emailtf = new JTextField();
        nameL.setHorizontalAlignment((SwingConstants.RIGHT));
        emailL.setHorizontalAlignment((SwingConstants.RIGHT));
        emailtf.setPreferredSize(new Dimension(200,40));
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0,0,10,15);
        form.add(nameL,c);
        c.gridx = 1;
        form.add(nametf,c);
        c.gridx = 0;
        c.gridy = 1;
        JPanel bottom = new JPanel();
        form.add(emailL,c);
        c.gridx = 1;
        form.add(emailtf,c);
        add(form,BorderLayout.CENTER);
        add(top,BorderLayout.NORTH);
        add(bottom,BorderLayout.SOUTH);


        news = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("Отправить");
        button.setPreferredSize(new Dimension(200,50));
        bottom.add(news);
        bottom.add(button);
        add(bottom,BorderLayout.SOUTH);
        bottom.setBorder(new EmptyBorder(0,0,20,0));
        top.setBorder(new EmptyBorder(20,0,0,0));

        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                top.setBackground(Color.GREEN);
                form.setBackground(Color.RED);
                bottom.setBackground(Color.YELLOW);
                labelTitle.setForeground(Color.WHITE);
            }
        });*/
        button.addActionListener(this);
        news.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("Подписаться на новости")){
            System.out.println("Нажат чекбокс");
        } else if(e.getActionCommand().equals("Отправить")){
            System.out.println("Нажата кнопка");
            String name = nametf.getText();
            String email = emailtf.getText();
            boolean bnews = news.isSelected();
            try {
                    User user = new User(name, email, bnews);
                    User.add(user);
                    User.printAllUsers();
            } catch (UserException exception) {
                    if(exception.getCode() == UserException.NO_NAME) showError("NOWNOWNONONO");
                    else if(exception.getCode() == UserException.NO_EMAIL) showError("ENOENRONSODA");
            }
        }
    }
    private void showError(String strtet) {
            JOptionPane.showMessageDialog(this, strtet, "ERR", JOptionPane.ERROR_MESSAGE);
    }
}
