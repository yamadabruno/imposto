package entities;

public class Individual extends TaxPayer {

    private Double healthExtenditures;

    public Individual(Double healthExtenditures) {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExtenditures) {
        super(name, anualIncome);
        this.healthExtenditures = healthExtenditures;
    }

    public Double getHealthExtenditures() {
        return healthExtenditures;
    }

    public void setHealthExtenditures(Double healthExtenditures) {
        this.healthExtenditures = healthExtenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getAnualIncome() < 20000.0) {
            basicTax = getAnualIncome() * 0.15;
        }
        else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthExtenditures() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
