package DataModels;

public class Monomial {
    private double coefficient;
    private Integer power;

    public Monomial(double coefficient, Integer power) {
        this.coefficient = coefficient;
        this.power = power;
    }

    public Monomial() {

    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoeficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
