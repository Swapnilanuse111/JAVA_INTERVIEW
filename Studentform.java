import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Studentform extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3;
    JRadioButton r1, r2;
    JComboBox<String> courseBox;
    JButton b1, b2;

    Studentform() {

        setTitle("Student Registration Form");

        // Background color
        getContentPane().setBackground(new Color(200, 230, 255));
        setLayout(null);

        // Labels
        l1 = new JLabel("Student Name:");
        l2 = new JLabel("Roll Number:");
        l3 = new JLabel("Age:");
        l4 = new JLabel("Gender:");
        l5 = new JLabel("Course:");

        // Text fields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        // Radio buttons
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.setBackground(new Color(200, 230, 255));
        r2.setBackground(new Color(200, 230, 255));

        // ComboBox
        String courses[] = {"Select", "Java", "Python", "Web Development", "Data Science"};
        courseBox = new JComboBox<>(courses);

        // Buttons
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        // Set bounds
        l1.setBounds(50, 40, 120, 30);
        t1.setBounds(180, 40, 160, 30);

        l2.setBounds(50, 80, 120, 30);
        t2.setBounds(180, 80, 160, 30);

        l3.setBounds(50, 120, 120, 30);
        t3.setBounds(180, 120, 160, 30);

        l4.setBounds(50, 160, 120, 30);
        r1.setBounds(180, 160, 70, 30);
        r2.setBounds(260, 160, 80, 30);

        l5.setBounds(50, 200, 120, 30);
        courseBox.setBounds(180, 200, 160, 30);

        b1.setBounds(90, 260, 100, 35);
        b2.setBounds(210, 260, 100, 35);

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(r1); add(r2);
        add(l5); add(courseBox);
        add(b1); add(b2);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Frame settings
        setSize(420, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
                return;
            }

            String gender = r1.isSelected() ? "Male" : r2.isSelected() ? "Female" : "Not Selected";
            String course = courseBox.getSelectedItem().toString();

            JOptionPane.showMessageDialog(this,
                    "Name: " + t1.getText() +
                    "\nRoll No: " + t2.getText() +
                    "\nAge: " + t3.getText() +
                    "\nGender: " + gender +
                    "\nCourse: " + course);
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            courseBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new Studentform();
    }
}
