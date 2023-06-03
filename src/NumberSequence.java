import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberSequence extends JFrame {
    private int currentNumber = 1;
    private JLabel numberLabel;

    public NumberSequence() {
        super("Number Sequence");

        // Create the label
        numberLabel = new JLabel(" " + currentNumber + " ");
        numberLabel.setBorder(BorderFactory.createEtchedBorder());
        numberLabel.setFont(new Font("Arial", Font.BOLD, 30));
        numberLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create the buttons
        JButton upButton = new JButton("Up");
        upButton.setPreferredSize(new Dimension(80, 30));
        JButton downButton = new JButton("Down");
        downButton.setPreferredSize(new Dimension(80, 30));
        JButton resetButton = new JButton("Reset");
        resetButton.setPreferredSize(new Dimension(80, 30));

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        buttonPanel.add(resetButton);

        // Add action listeners to the buttons
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber = currentNumber == 7 ? 0 : currentNumber + 1;
                numberLabel.setText(" " + currentNumber + " ");
            }
        });
        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber = currentNumber == 0 ? 7 : currentNumber - 1;
                numberLabel.setText(" " + currentNumber + " ");
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber = 0;
                numberLabel.setText(" " + currentNumber + " ");
            }
        });

        // Add components to the frame
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(numberLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.setPreferredSize(new Dimension(250, 140));
        add(mainPanel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberSequence();
    }
}
