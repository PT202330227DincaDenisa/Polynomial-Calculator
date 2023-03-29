package GraphicalUserInterface;

import BusinessLogic.Operations;
import DataModels.Polynomial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Controller  {

    private View view;
    private Operations operations;
    private Polynomial polynomial;

    public  Controller(View view, Operations operations, Polynomial polynomial) {
        this.view=view;
        this.operations=operations;
        this.polynomial=polynomial;
        this.view.addButtonListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Operations op=new Operations();
//                Polynomial polynomial1=new Polynomial();
//                Polynomial polynomial2=new Polynomial();
                try {
                    Polynomial polynomial1 = op.transform(view.getFirstPolynom());
                    Polynomial polynomial2 = op.transform(view.getSecondPolynom());
                    String s = op.addPolynoms(polynomial1, polynomial2);
                    view.updateResult(s);
                    if(s.equals(" ")){
                        view.showError("Wrong input!");
                    }
                }
                catch (Exception ex){
                    //view.showError("Wrong input!");
                    JOptionPane.showMessageDialog(new JPanel(), "Wrong Input!");

                }
            }
        });
        this.view.subButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operations op = new Operations();
                try {
                    Polynomial polynomial1 = op.transform(view.getFirstPolynom());
                    Polynomial polynomial2 = op.transform(view.getSecondPolynom());
                    String s = op.subPolynoms(polynomial1, polynomial2);
                    view.updateResult(s);
                    if(s.equals(" ")){
                        view.showError("Wrong input!");
                    }
                }
                catch (Exception ex){
                    //view.showError("Wrong input!");
                    JOptionPane.showMessageDialog(new JPanel(), "Wrong Input!");

                }

            }
        });
        this.view.mulButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operations op = new Operations();
                try {
                    Polynomial polynomial1 = op.transform(view.getFirstPolynom());
                    Polynomial polynomial2 = op.transform(view.getSecondPolynom());
                    String s = op.mulPolynoms(polynomial1, polynomial2);
                    view.updateResult(s);
                    if (s.equals(" ")) {
                        view.showError("Wrong input!");
                    }
                }
                catch (Exception ex){
                    //view.showError("Wrong input!");
                    JOptionPane.showMessageDialog(new JPanel(), "Wrong Input!");

                }

            }
        });

        this.view.derButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operations op = new Operations();
                try {
                    Polynomial polynomial1 = op.transform(view.getFirstPolynom());
                    String s = op.derPolynoms(polynomial1);
                    view.updateResult(s);
                    if (s.equals(" ")) {
                        view.showError("Wrong input!");
                    }
                }
                catch (Exception ex){
                    //view.showError("Wrong input!");
                    JOptionPane.showMessageDialog(new JPanel(), "Wrong Input!");

                }

            }
        });

        this.view.intButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operations op = new Operations();
                try {
                    Polynomial polynomial1 = op.transform(view.getFirstPolynom());
                    String s = op.intPolynoms(polynomial1);
                    view.updateResult(s);
                    if (s.equals(" ")) {
                        view.showError("Wrong input!");
                    }
                }catch (Exception ex){
                    //view.showError("Wrong input!");
                    JOptionPane.showMessageDialog(new JPanel(), "Wrong Input!");

                }

            }
        });


    }



}
