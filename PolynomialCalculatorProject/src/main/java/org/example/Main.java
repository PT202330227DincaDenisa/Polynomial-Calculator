package org.example;

import BusinessLogic.Operations;
import DataModels.Monomial;
import DataModels.Polynomial;
import GraphicalUserInterface.Controller;
import GraphicalUserInterface.View;

public class Main {
    public static void main(String[] args) {
         View view = new View();
         Polynomial polynomial=new Polynomial();
         Operations operations=new Operations();
        Controller controller = new Controller(view, operations, polynomial);
        //view.setVisible(true);

//        Polynomial polynom1 = new Polynomial();
//        Polynomial polynom2 = new Polynomial();
//        Monomial m3 = new Monomial(2, 3);
//        Monomial m1 = new Monomial(4, 1);
//        Monomial n2 = new Monomial(1, 3);
//
//        Monomial n3 = new Monomial(3, 2);
//        Monomial n1 = new Monomial(2, 1);
//        Monomial n4 = new Monomial(5, 0);
//
//        polynom1.addMonom(m3);
//        polynom1.addMonom(m1);
//        polynom2.addMonom(n4);
//        polynom2.addMonom(n3);
//        polynom2.addMonom(n2);
//        polynom2.addMonom(n1);
//        Operations op = new Operations();
//        //op.addPolynoms(polynom1, polynom2);
//        System.out.println(op.addPolynoms(polynom1, polynom2));
//        //op.subPolynoms(polynom1, polynom2);
//        System.out.println(op.subPolynoms(polynom1, polynom2));
//        op.mulPolynoms(polynom1, polynom2);
//
//        System.out.println(op.mulPolynoms(polynom1, polynom2));
//        op.derPolynoms(polynom2);
//        System.out.println(op.derPolynoms(polynom2));
//        op.intPolynoms(polynom2);
//        System.out.println(op.intPolynoms(polynom2));
    }
    //2x^3+4x
    //x^3+3x^2+2x+5
    //mul: 2x^6+10x^5+14x^4+14x^3+20x^2+20x
}