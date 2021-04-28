import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Namer extends JFrame
{

    public static void main(String [] args)
    {
        new Namer();
    }

    private JButton buttonOK;
    private JTextField textName;
    private JTextField textPw;
    public Namer()
    {
        this.setSize(800,300);
        this.setTitle("Create account");
        this.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        ButtonListener bl = new ButtonListener();

        JPanel panel1 = new JPanel();

        JLabel user = new JLabel("Enter your username: ");
        textName = new JTextField(15);
        user.setBounds(481,170,281,68);
        JLabel password = new JLabel("Enter Password: ");
        panel1 = new JPanel(new GridLayout(3, 1));
        textPw = new JTextField(15); 
        password.setBounds(481,286,281,68);
        panel1.add(user);
        panel1.add(textName);
        panel1.add(password);
        panel1.add(textPw);

        buttonOK = new JButton("OK");
        buttonOK.addActionListener(bl);
        panel1.add(buttonOK);

        this.add(panel1);

        this.setVisible(true);
    }

    private class ButtonListener implements
            ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == buttonOK)
            {
                String name = textName.getText();
                if (name.length() == 0)
                {
                    JOptionPane.showMessageDialog(
                            Namer.this,
                            "You didn't enter a name",
                            "ERROR",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(
                            Namer.this,
                            "Your account has been created. " + name,
                            "Salutations",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                textName.requestFocus();
            }
        }
    }
}
