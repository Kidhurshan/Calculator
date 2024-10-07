import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    //initializing fields
    JFrame frame ;
    JButton[] functionButtons =new JButton[8];
    JButton[] numberButtons = new JButton[10];
    JPanel panel;
    JTextField textField;
    //Buttons used
    JButton addButton, subButton, mulButton, divButton;
    JButton equButton, decimalButton, clearButton, backButton;

    //set up the font
    Font font = new Font("Arial",Font.BOLD, 20);

    //creating constructor to perform methods
    public Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,550);
        frame.setLayout(null);

        //set up the text field
        textField = new JTextField();
        textField.setFont(font);
        textField.setEditable(false);
        textField.setBounds(50,25,300,50);

        //set up the panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,10,10));

        //set up the Function Button
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clearButton = new JButton("C");
        decimalButton = new JButton(".");
        backButton = new JButton("<");

        clearButton.setBounds(75,90,100,50);
        backButton.setBounds(225,90,100,50);

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = clearButton;
        functionButtons[6] = decimalButton;
        functionButtons[7] = backButton;

        for(int i =0; i<8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);

        }

        for(int i =0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);

        }

        panel = new JPanel();
        panel.setBounds(50,150,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);




        frame.add(clearButton);
        frame.add(backButton);
        frame.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Run the Gui
    public static void main(String[] args){
        Calculator calculator = new Calculator();
    }
}
