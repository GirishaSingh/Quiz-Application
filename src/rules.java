import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    rules(String name) {
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the Quiz");
        heading.setBounds(150, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD, 28));//FONT COLOUR
        heading.setForeground(new Color(30, 144, 254));
        add(heading); 

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma" , Font.PLAIN, 16));//FONT COLOUR
        String rulesText = "<html>"+ 
                "1. You are some first year B.Tech student don't make any story answer point to point." + "<br><br>" +
                "2. Kindly do your work only.Don't think that your friend knows better than you, can be worse." + "<br><br>" +
                "3. All the questions are compulsory,Don't think you are having any choice." + "<br><br>" +
                "4. You can cry without disturbing others." + "<br><br>" +
                "5. Focus on you and not he/she because they'll not your paper" + "<br><br>" +
                "6. If your friend is doing more question,don't think they're better may be he is giving random ansers" + "<br><br>" +
                "7. Do not feel stress about the paper,Basic knowledge of Programming will work." + "<br><br>" +
                "8. All the Best, May be Jai Mata Di will work in your case." + "<br><br>" +
            "<html>";
        rules.setText(rulesText);
        add(rules);

        // Start Button
        start = new JButton("Start");
        start.setBounds(250,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        add(start);
        start.addActionListener(this);

        // Back Button
        back = new JButton("Back");
        back.setBounds(400,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        add(back);
        back.addActionListener(this); 

        setSize(800,650);
        setTitle("Rules");
        setLocation(300,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == start) {
            setVisible(false);
            new quiz(name);
        }
        else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new rules("User");
    }
}
