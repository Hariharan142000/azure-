package in.himkush.calculator.main;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {


        JFrame f1 = new JFrame();
        Calculator l = new Calculator();
        f1.add(l.panel1);

        f1.pack();

        f1.setVisible(true);
    }

}
