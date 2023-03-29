package BusinessLogic;
import DataModels.Monomial;
import DataModels.Polynomial;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Operations {
    public Operations() {
    }

    public String addPolynoms(Polynomial polynom1, Polynomial polynom2) {
        Map<Integer, Monomial> result = new HashMap<>();
        for (int key : polynom1.getPolynom().keySet()) {
            if (polynom2.getPolynom().containsKey(key)) {
                Monomial maux = new Monomial(polynom1.getPolynom().get(key).getCoefficient() + polynom2.getPolynom().get(key).getCoefficient(), key);
                result.put(key, maux);
                polynom2.getPolynom().remove(key);
            } else {

                result.put(key, polynom1.getPolynom().get(key));
            }
            for (int key2 : polynom2.getPolynom().keySet()){
                result.put(key2, polynom2.getPolynom().get(key2));
            }
        }
        Polynomial fin=new Polynomial();
        fin.setPolynom(result);
        return fin.toString();
    }

    public String subPolynoms(Polynomial polynom1, Polynomial polynom2) {
        Map<Integer, Monomial> result = new HashMap<>();
        for (int key : polynom1.getPolynom().keySet()) {
            if (polynom2.getPolynom().containsKey(key)) {
                Monomial maux = new Monomial(polynom1.getPolynom().get(key).getCoefficient() - polynom2.getPolynom().get(key).getCoefficient(), key);
                result.put(key, maux);
                polynom2.getPolynom().remove(key);
            } else {

                result.put(key, polynom1.getPolynom().get(key));
            }
            for (int key2 : polynom2.getPolynom().keySet()){
                Monomial maux2 = new Monomial(-polynom2.getPolynom().get(key2).getCoefficient(), key2);
                result.put(key2, maux2);
                //result.put(key2, (polynom2.getPolynom().get(key2)));
            }
        }
        Polynomial fin=new Polynomial();
        fin.setPolynom(result);
        return fin.toString();
    }

    public String mulPolynoms (Polynomial polynom1, Polynomial polynom2){
        Map <Integer, Monomial> result= new HashMap<>();
        for(int key:polynom1.getPolynom().keySet()){
            for(int key2:polynom2.getPolynom().keySet()){
               Monomial maux=new Monomial(polynom1.getPolynom().get(key).getCoefficient()*
                        polynom2.getPolynom().get(key2).getCoefficient(), key+key2);
                int newPower=key+key2;
                double newCoefficient=polynom1.getPolynom().get(key).getCoefficient()*polynom2.getPolynom().get(key2).getCoefficient();
                if(result.containsKey(newPower))
                {
                    double oldCoefficient=result.get(newPower).getCoefficient();
                    Monomial maux2=new Monomial(newCoefficient+oldCoefficient, newPower);
                    result.put(newPower,maux2);

                }
                else {
                    result.put(newPower, maux);
                }
            }

        }
        Polynomial fin=new Polynomial();
        fin.setPolynom(result);
        return fin.toString();
    }



    public String derPolynoms (Polynomial polynom1){
        Map<Integer, Monomial> result = new HashMap<>();
        for(int key:polynom1.getPolynom().keySet()){
            int newPower=key-1;
            Monomial maux=new Monomial(key*polynom1.getPolynom().get(key).getCoefficient(), newPower);
            if(newPower >= 0 && (key*polynom1.getPolynom().get(key).getCoefficient()) != 0){
                result.put(newPower, maux);
            }

        }
        Polynomial fin=new Polynomial();
        fin.setPolynom(result);
        return fin.toString();

    }

    public String intPolynoms (Polynomial polynom1){
        Map<Integer, Monomial> result = new HashMap<>();
        for(int key:polynom1.getPolynom().keySet()) {
            int newPower = key + 1;
            if (key != 0) {
                Monomial maux = new Monomial(polynom1.getPolynom().get(key).getCoefficient() / key, newPower);
                if (((polynom1.getPolynom().get(key).getCoefficient()) / key) != 0) {
                    result.put(newPower, maux);
                }

            }
        }
        Polynomial fin=new Polynomial();
        fin.setPolynom(result);
        return fin.toString();

    }

    public Polynomial transform(String pol){
            Polynomial result = new Polynomial();
            Pattern pattern = Pattern.compile("([+-]?\\d*x\\^\\d+)");
            Matcher matcher = pattern.matcher(pol);
            while (matcher.find()) {
                Monomial newMonom1 = new Monomial();
                String newMonom = matcher.group();
                Pattern patternMonom = Pattern.compile("([+-]?\\d+)");
                Matcher matcherMonom = patternMonom.matcher(newMonom);
                double coefficient = (matcherMonom.find() ? parseDouble(matcherMonom.group()) : 0);
                Integer power = (matcherMonom.find() ? parseInt(matcherMonom.group()) : 0);
                newMonom1.setPower(power);
                newMonom1.setCoeficient(coefficient);
                result.addMonom(newMonom1);

            }
            return result;
    }

}
