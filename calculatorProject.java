import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.net.ssl.TrustManagerFactorySpi;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.TextUI;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class calculatorProject implements ActionListener {

    JFrame jf;
    JLabel Displaylabel;
    JButton sevenButton, eightButton, nineButton;
    JButton fourButton, fiveButton, sixButton;
    JButton oneButton, twoButton, threeButton;
    JButton zeroButton, equalbutton, dotButton, clearButton, backButton, percentageButton;
    JButton additonButton, subsctrationButton, multipicationButton, divisionButton;

    Boolean operatorClicked = false, clickedNextButton = false;
    String oldValue, newValue, operator;
    float result, adddemo;;

    public calculatorProject() {

        jf = new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(585, 600);
        jf.setVisible(true);
        jf.setLocation(200, 80);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Displaylabel = new JLabel();
        Displaylabel.setBounds(30, 40, 510, 60);
        Displaylabel.setFont(new Font("Arial", Font.PLAIN, 30));
        Displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        Displaylabel.setForeground(Color.white);
        Displaylabel.setBackground(Color.gray);
        Displaylabel.setOpaque(true);
        jf.add(Displaylabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(140, 120, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(250, 120, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(140, 220, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(250, 220, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(140, 320, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(250, 320, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        equalbutton = new JButton("=");
        equalbutton.setBounds(30, 420, 80, 80);
        equalbutton.setFont(new Font("Arial", Font.PLAIN, 30));
        equalbutton.addActionListener(this);
        jf.add(equalbutton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(140, 420, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(250, 420, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(360, 120, 80, 80);
        divisionButton.setFont(new Font("Arial", Font.PLAIN, 30));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);

        multipicationButton = new JButton("*");
        multipicationButton.setBounds(360, 220, 80, 80);
        multipicationButton.setFont(new Font("Arial", Font.PLAIN, 30));
        multipicationButton.addActionListener(this);
        jf.add(multipicationButton);

        subsctrationButton = new JButton("-");
        subsctrationButton.setBounds(360, 320, 80, 80);
        subsctrationButton.setFont(new Font("Arial", Font.PLAIN, 30));
        subsctrationButton.addActionListener(this);
        jf.add(subsctrationButton);

        additonButton = new JButton("+");
        additonButton.setBounds(360, 420, 80, 80);
        additonButton.setFont(new Font("Arial", Font.PLAIN, 30));
        additonButton.addActionListener(this);
        jf.add(additonButton);

        clearButton = new JButton("Clr");
        clearButton.setBounds(460, 340, 80, 160);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        backButton = new JButton("<");
        backButton.setBounds(460, 120, 80, 80);
        backButton.setFont(new Font("Arial", Font.PLAIN, 30));
        backButton.addActionListener(this);
        jf.add(backButton);

        percentageButton = new JButton("%");
        percentageButton.setBounds(460, 220, 80, 80);
        percentageButton.setFont(new Font("Arial", Font.PLAIN, 30));
        percentageButton.addActionListener(this);
        jf.add(percentageButton);
    }

    public static void main(String[] args) {
        new calculatorProject();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "7");
        } else if (e.getSource() == eightButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "8");
        } else if (e.getSource() == nineButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "9");
        } else if (e.getSource() == fourButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "4");
        } else if (e.getSource() == fiveButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "5");
        } else if (e.getSource() == sixButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "6");
        } else if (e.getSource() == oneButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "1");
        } else if (e.getSource() == twoButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "2");
        } else if (e.getSource() == threeButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "3");
        } else if (e.getSource() == zeroButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + "0");
        } else if (e.getSource() == dotButton) {
            if (operatorClicked) {
                Displaylabel.setText("");
                operatorClicked = false;
            }
            Displaylabel.setText(Displaylabel.getText() + ".");
        } else if (e.getSource() == clearButton) {
            Displaylabel.setText(" ");
            operator = "";
        } else if (e.getSource() == equalbutton) {

            newValue = Displaylabel.getText();

            float oldValuef = Float.parseFloat(oldValue);
            float newvaluev = Float.parseFloat(newValue);
            switch (operator) {
                case "+":
                    result = oldValuef + newvaluev;
                    Displaylabel.setText(result + "");
                    break;
                case "-":
                    result = oldValuef - newvaluev;
                    Displaylabel.setText(result + "");
                    break;
                case "*":
                    result = oldValuef * newvaluev;
                    Displaylabel.setText(result + "");
                    break;
                case "/":
                    result = oldValuef / newvaluev;
                    Displaylabel.setText(result + "");
                    break;
                default:
                    Displaylabel.setText("");
            }
            operatorClicked = true;
        } else if (e.getSource() == additonButton) {
            if (operator == "+") {

                float oldValuef = Float.parseFloat(oldValue);
                newValue = Displaylabel.getText();
                float newvaluev = Float.parseFloat(newValue);
                result = oldValuef + newvaluev;
                oldValue = result + ("");
                Displaylabel.setText("");

            } else {
                oldValue = Displaylabel.getText();
                operator = "+";
                Displaylabel.setText("");
            }
        } else if (e.getSource() == subsctrationButton) {
            if (operator == "-") {

                float oldValuef = Float.parseFloat(oldValue);
                newValue = Displaylabel.getText();
                float newvaluev = Float.parseFloat(newValue);
                result = oldValuef - newvaluev;
                oldValue = result + ("");
                Displaylabel.setText("");
            } else {
                oldValue = Displaylabel.getText();
                operator = "-";
                Displaylabel.setText(" ");
            }
        } else if (e.getSource() == multipicationButton) {
            oldValue = Displaylabel.getText();
            operator = "*";
            Displaylabel.setText(" ");
        } else if (e.getSource() == divisionButton) {
            oldValue = Displaylabel.getText();
            operator = "/";
            Displaylabel.setText(" ");
        } else if (e.getSource() == backButton) {

            Displaylabel.setText(Displaylabel.getText().substring(0, Displaylabel.getText().length() - 1));
        } else if (e.getSource() == percentageButton) {
            oldValue = Displaylabel.getText();
            float oldValuef = Float.parseFloat(oldValue);
            result = oldValuef / 100;
            Displaylabel.setText(result + "");
        }
    }
}
