package in.himkush.calculator.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JButton a1Button;
    public JPanel panel1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton addButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton subButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divButton;
    private JButton a0Button;
    private JButton mulButton;
    public JTextField textField1;
    private JButton button1;
    private JButton clrButton;

    private int firstNumber = 0;
    private int operator = 0;
    private int secondNumber;
    private int result;

    public Calculator(){


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textField1.setText(textField1.getText().concat("1"));
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textField1.setText(textField1.getText().concat("2"));

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("3"));

            }

        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("4"));

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("5"));

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("6"));

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              textField1.setText(textField1.getText().concat("7"));

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("8"));

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("9"));

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat("0"));

            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(textField1.getText());
                operator = 1;
                textField1.setText("");

            }
        });


        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(textField1.getText());
                operator = 2;
                textField1.setText("");
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(textField1.getText());
                operator = 3 ;
                textField1.setText("");
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Integer.parseInt(textField1.getText());
                operator = 4;
                textField1.setText("");
            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNumber = Integer.parseInt(textField1.getText());
                switch (operator){
                    case 1:
                        result = firstNumber + secondNumber;
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        break;
                    case 3:
                        result = firstNumber / secondNumber;                        break;
                    case 4:
                        result = firstNumber * secondNumber;
                        break;
                    default :
                        result = 0;
                }
                textField1.setText("" + result);

            }
        });
        clrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
    }


}
