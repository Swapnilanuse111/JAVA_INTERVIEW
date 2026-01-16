import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Studentform extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;

    Studentform() {
        // Frame title
        setTitle("Student Form");

        // Labels
        l1 = new JLabel("Student Name:");
        l2 = new JLabel("Roll Number:");
        l3 = new JLabel("Age:");

        // TextFields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        // Buttons
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        // Set layout
        setLayout(null);

        // Set positions
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(160, 50, 150, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(160, 100, 150, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(160, 150, 150, 30);

        b1.setBounds(70, 220, 100, 30);
        b2.setBounds(190, 220, 100, 30);

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);

        // Button actions
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Frame settings
        setSize(400, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String name = t1.getText();
            String roll = t2.getText();
            String age = t3.getText();

            JOptionPane.showMessageDialog(this,
                    "Name: " + name + "\nRoll No: " + roll + "\nAge: " + age);
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        new Studentform();
    }
}
