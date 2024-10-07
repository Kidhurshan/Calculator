import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    //initializing fields
    JFrame frame ;
    JButton[] functionButtons;
    JButton[] numberButtons;
    JPanel panel;
    JTextField textField;
    //Buttons used
    JButton addButton, subButton, mulButton, divButton;
    JButton equButton, decButton, clearButton, backButton;

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



        frame.add(textField);
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
