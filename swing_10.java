import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swing_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY); // Set background color to gray

        JLabel l1 = new JLabel("First number: ");
        l1.setBounds(50, 10, 100, 30);
        JTextField f1 = new JTextField();
        f1.setBounds(150, 15, 100, 20);

        JLabel l2 = new JLabel("Second number: ");
        l2.setBounds(50, 30, 100, 30);
        JTextField f2 = new JTextField();
        f2.setBounds(150, 35, 100, 20);

        JLabel l3 = new JLabel("Result: ");
        l3.setBounds(50, 90, 100, 30);
        JTextField f3 = new JTextField();
        f3.setBounds(150, 100, 100, 20);
        f3.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(f1.getText());
                int second = Integer.parseInt(f2.getText());
                int result = first + second;
                f3.setText(String.valueOf(result));
            }
        });
        addButton.setBounds(50, 130, 80, 25);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setText("");
                f2.setText("");
                f3.setText("");
            }
        });
        clearButton.setBounds(150, 130, 80, 25);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setBounds(120, 160, 80, 25);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(f1);
        frame.add(f2);
        frame.add(f3);
        frame.add(addButton);
        frame.add(clearButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
