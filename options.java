import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class options extends JFrame{

    public static void main(String[] args) {
        new Namer();
    }

    private JButton buttonCA;
    private JTextField textName;

    public options() {

        ButtonListener bl = new ButtonListener();

        JPanel panel1 = new JPanel();
        buttonCA = new JButton("Create account");
        buttonCA.addActionListener(bl);
        panel1.add(buttonCA);
        this.add(panel1);

        JPanel panel2 = new JPanel();
        buttonCA = new JButton("Deposit");
        buttonCA.addActionListener(bl);
        panel2.add(buttonCA);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
