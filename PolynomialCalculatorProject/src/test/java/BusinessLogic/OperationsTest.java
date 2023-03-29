package BusinessLogic;

import DataModels.Monomial;
import DataModels.Polynomial;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    public OperationsTest(){}
    private static int succes;
    private static int fail;

    @Test
    void addPolynoms() {
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations=new Operations();
        Monomial m3 = new Monomial(2, 3);
        Monomial m1 = new Monomial(4, 1);
        Monomial n2 = new Monomial(1, 3);

        Monomial n3 = new Monomial(5, 2);
        Monomial n1 = new Monomial(5, 1);
        Monomial n4 = new Monomial(5, 0);

        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);

        String result= operations.addPolynoms(polynom1, polynom2);
        assertEquals(result, " 5.0x^0+9.0x^1+5.0x^2+3.0x^3");


    }

    @Test
    void subPolynoms() {
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.subPolynoms(polynom1, polynom2);
        Assertions.assertEquals(result, " -5.0x^0-1.0x^1-5.0x^2+1.0x^3");

    }

    @Test
    void mulPolynoms() {
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.mulPolynoms(polynom1, polynom2);
        Assertions.assertEquals(result, " +20.0x^1+20.0x^2+30.0x^3+14.0x^4+10.0x^5+2.0x^6");

    }

    @Test
    void derPolynoms() {
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.derPolynoms(polynom2);
        Assertions.assertEquals(result, " 5.0x^0+10.0x^1+3.0x^2");

    }

    @Test
    void intPolynoms() {
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.intPolynoms(polynom2);
        Assertions.assertEquals(result, " +5.0x^2+2.5x^3+0.3333333333333333x^4");

    }

    @Test
    void failTest(){
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.derPolynoms(polynom2);
        Assertions.assertEquals(result, "5.0x^0+10.0x^1+3.0x^2");

    }
    @Test
    void failTest2(){
        Polynomial polynom1 = new Polynomial();
        Polynomial polynom2 = new Polynomial();
        Operations operations = new Operations();
        Monomial m3 = new Monomial(2.0, 3);
        Monomial m1 = new Monomial(4.0, 1);
        Monomial n2 = new Monomial(1.0, 3);
        Monomial n3 = new Monomial(5.0, 2);
        Monomial n1 = new Monomial(5.0, 1);
        Monomial n4 = new Monomial(5.0, 0);
        polynom1.addMonom(m3);
        polynom1.addMonom(m1);
        polynom2.addMonom(n4);
        polynom2.addMonom(n3);
        polynom2.addMonom(n2);
        polynom2.addMonom(n1);
        String result = operations.intPolynoms(polynom2);
        Assertions.assertEquals(result, " +5.0x^2+2.5x^3+0.33333333333x^4");

    }
}