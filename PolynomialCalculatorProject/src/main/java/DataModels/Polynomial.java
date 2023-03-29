package DataModels;
import java.util.HashMap;
import java.util.Map;

public class Polynomial {
    private Map<Integer, Monomial> polynom1;

    public Polynomial() {
        this.polynom1 = new HashMap<>();

    }

    public Map<Integer, Monomial> getPolynom() {
        return polynom1;
    }
    public void setPolynom(Map<Integer, Monomial> polynom1) {
        this.polynom1 = polynom1;
    }

    public void addMonom(Monomial m) {
        polynom1.put(m.getPower(), m);
    }


    @Override
    public String toString() {
        String s = " ";
        for (int key : this.polynom1.keySet()) {
            if(key==0||this.polynom1.get(key).getCoefficient()<0)
                s +=  this.polynom1.get(key).getCoefficient() + "x^" + key ;
            else
                s += "+" +  this.polynom1.get(key).getCoefficient() + "x^" + key;

        }
        return s;
    }
}
