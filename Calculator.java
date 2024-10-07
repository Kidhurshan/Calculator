import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    //initializing fields
    JFrame frame ;
    JButton[] functionButtons;
    JButton[] numberButtons;
    JPanel panel;

    //creating constructor to perform methods
    public Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,550);

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
