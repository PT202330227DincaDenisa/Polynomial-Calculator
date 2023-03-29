package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame{
    private JLabel firstPolynomLabel;
    private JLabel secondPolynomLabel;
    private JLabel resultPolynomLabel;
    private JTextField firstPolynomField;
    private JTextField secondPolynomField;
    private JTextField resultField;
    private JButton btnAdd = new JButton("Add");

    private JButton btnSub = new JButton("Substract");
    private JButton btnMul = new JButton("Multiply");
    private JButton btnDiv = new JButton("Divide");
    private JButton btnDer = new JButton("Derivative");
    private JButton btnInt = new JButton("Integration");
    public View(){
        this.firstPolynomLabel = new JLabel("First polynom:");
        //this.firstPolynomLabel.setPreferredSize(100,20);
        this.secondPolynomLabel = new JLabel("Second polynom:");
        //this.secondPolynomLabel.setPreferredSize(100,20);
        this.resultPolynomLabel = new JLabel("Result:");
        //this.resultPolynomLabel.setPreferredSize(100,20);
        this.btnAdd.setPreferredSize(new Dimension(100, 20));
        this.btnSub.setPreferredSize(new Dimension(100, 20));
        this.btnDer.setPreferredSize(new Dimension(100, 20));
        this.btnDiv.setPreferredSize(new Dimension(100, 20));
        this.btnMul.setPreferredSize(new Dimension(100, 20));
        this.btnInt.setPreferredSize(new Dimension(100, 20));

        this.firstPolynomField = new JTextField();
        this.firstPolynomField.setPreferredSize(new Dimension(200,20));
        this.secondPolynomField = new JTextField();
        this.secondPolynomField.setPreferredSize(new Dimension(200,20));
        this.resultField = new JTextField();
        this.resultField.setPreferredSize(new Dimension(200,20));

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(Box.createRigidArea(new Dimension(0, 10)));
        content.add(this.firstPolynomLabel);
        content.add(Box.createRigidArea(new Dimension(0, 10)));
        content.add(this.firstPolynomField);
        setPreferredSize(new Dimension(200, 20));

        JPanel content2 = new JPanel();
        content2.setLayout(new FlowLayout());
        content2.add(Box.createRigidArea(new Dimension(0, 10)));
        content2.add(this.secondPolynomLabel);
        content2.add(Box.createRigidArea(new Dimension(0, 10)));
        content2.add(this.secondPolynomField);
        setPreferredSize(new Dimension(200, 20));

        JPanel content3 = new JPanel();
        content3.setLayout(new FlowLayout());
        content3.add(Box.createRigidArea(new Dimension(0, 10)));
        content3.add(this.resultPolynomLabel);
        content3.add(Box.createRigidArea(new Dimension(0, 10)));
        content3.add(this.resultField);
        setPreferredSize(new Dimension(200, 20));

        JPanel content4 = new JPanel();
        content4.setLayout(new FlowLayout());
        content4.add(Box.createRigidArea(new Dimension(0, 10)));
        content4.add(this.btnAdd);
        content4.add(Box.createRigidArea(new Dimension(0, 10)));
        content4.add(this.btnSub);
        setPreferredSize(new Dimension(200, 20));

        JPanel content5 = new JPanel();
        content5.setLayout(new FlowLayout());
        content5.add(Box.createRigidArea(new Dimension(0, 10)));
        content5.add(this.btnMul);
        content5.add(Box.createRigidArea(new Dimension(0, 10)));
        content5.add(this.btnDiv);
        setPreferredSize(new Dimension(200, 20));

        JPanel content6 = new JPanel();
        content6.setLayout(new FlowLayout());
        content6.add(Box.createRigidArea(new Dimension(0, 10)));
        content6.add(this.btnDer);
        content6.add(Box.createRigidArea(new Dimension(0, 10)));
        content6.add(this.btnInt);
        setPreferredSize(new Dimension(200, 20));

        JPanel verticalContent = new JPanel();
        verticalContent.setLayout(new BoxLayout(verticalContent, BoxLayout.Y_AXIS));
        verticalContent.add(content);
        verticalContent.add(Box.createRigidArea(new Dimension(0, 5)));
        verticalContent.add(content2);
        verticalContent.add(Box.createRigidArea(new Dimension(0, 5)));
        verticalContent.add(content3);
        verticalContent.add(Box.createRigidArea(new Dimension(0, 5)));
        verticalContent.add(content4);
        verticalContent.add(Box.createRigidArea(new Dimension(0, 5)));
        verticalContent.add(content5);
        verticalContent.add(Box.createRigidArea(new Dimension(0, 5)));
        verticalContent.add(content6);

        this.setContentPane(verticalContent);
        this.pack();
        this.setSize(600, 300);
        this.setTitle("CALCULATOR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
    public String getFirstPolynom(){
        return this.firstPolynomField.getText();
    }


    public String getSecondPolynom(){
        return this.secondPolynomField.getText();
    }

    public void addButtonListener(ActionListener actionListener){
        this.btnAdd.addActionListener(actionListener);
    }

    public void subButtonListener(ActionListener actionListener){
        this.btnSub.addActionListener(actionListener);
    }
    public void mulButtonListener(ActionListener actionListener){
        this.btnMul.addActionListener(actionListener);
    }
    public void derButtonListener(ActionListener actionListener){
        this.btnDer.addActionListener(actionListener);
    }

    public void intButtonListener(ActionListener actionListener){
        this.btnInt.addActionListener(actionListener);
    }

    public void updateResult(String newValue)
    {
        this.resultField.setText(newValue);
    }

    public void showError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
