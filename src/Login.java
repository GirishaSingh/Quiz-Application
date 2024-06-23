import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField usernameField;

    Login() {
        setTitle("Quiz Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        // Image Label
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jfif" ));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, i1.getIconWidth(), i1.getIconHeight());
        add(image);
        
        // Login Panel
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2, 10, 10));
        loginPanel.setBounds(50, 150, 300, 120);
        add(loginPanel);

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        loginPanel.add(usernameLabel);

        // Username TextField
        usernameField = new JTextField();
        loginPanel.add(usernameField);

        // Rules Button
        rules = new JButton("Rules");
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        loginPanel.add(rules);
        rules.addActionListener(this);

        // Back Button
        back = new JButton("Back");
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        loginPanel.add(back);
        back.addActionListener(this); 

        setSize(408, 300);
        setLocationRelativeTo(null); // Centers the frame on the screen
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == rules) {
            String name=usernameField.getText();
            //String password=passwordField.getText();
            setVisible(false);
            new rules(name);
        }
        else if(ae.getSource() == back) {
            this.setVisible(false);
        }
    }
}

