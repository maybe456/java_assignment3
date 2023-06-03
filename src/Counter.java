import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {

    private final JLabel numberLabel;
    private final JButton upButton;
    private final JButton downButton;
    private final JButton resetButton;
    private int currentNumber;

    public Counter() {
        super("Counter");

        // set size of JFrame
        setSize(700, 300);

        // set layout of JFrame
        setLayout(null);

        // create and add number label
        numberLabel = new JLabel("1");
        numberLabel.setBounds(300,10,100,50);
        numberLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(numberLabel);

        // create and add up button
        upButton = new JButton("Up");
        upButton.addActionListener(this);
        upButton.setBounds(190,70,100,50);
        add(upButton);

        // create and add down button
        downButton = new JButton("Down");
        downButton.addActionListener(this);
        downButton.setBounds(300,70,100,50);
        add(downButton);

        // create and add reset button
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        resetButton.setBounds(410,70,100,50);
        add(resetButton);

        // set initial value of currentNumber to 0
        currentNumber = 0;
    }

    public void actionPerformed(ActionEvent e) {
        // determine which button was clicked
        if (e.getSource() == upButton) {
            // sets currentNumber to 0 if the upButton is pressed at 7
            if (currentNumber == 7) {
                currentNumber = 0;
                numberLabel.setText(Integer.toString(currentNumber));
            }
            // increment currentNumber and display it
            else if (currentNumber < 7) {
                currentNumber++;
                numberLabel.setText(Integer.toString(currentNumber));
            }
        } else if (e.getSource() == downButton) {
            // sets currentNumber to 7 if the downButton is pressed at 0
            if (currentNumber == 0) {
                currentNumber = 7;
                numberLabel.setText(Integer.toString(currentNumber));
            }
            // decrement currentNumber and display it
            else if (currentNumber > 0) {
                currentNumber--;
                numberLabel.setText(Integer.toString(currentNumber));
            }
        } else if (e.getSource() == resetButton) {
            // reset currentNumber to 0 and display it
            currentNumber = 0;
            numberLabel.setText(Integer.toString(currentNumber));
        }
    }

    public static void main(String[] args) {
        // create and display JFrame
        Counter frame = new Counter();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
