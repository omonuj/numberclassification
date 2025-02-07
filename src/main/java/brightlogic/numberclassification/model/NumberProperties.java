package brightlogic.numberclassification.model;

import java.util.List;

public class NumberProperties {
    private int number;
    private boolean isPrime;
    private boolean isPerfect;
    private List<String> properties;
    private int digitSum;
    private String funFact;

    public NumberProperties(int number, boolean isPrime,
                            boolean isPerfect,
                            List<String> properties,
                            int digitSum, String funFact) {
        this.number = number;
        this.isPrime = isPrime;
        this.isPerfect = isPerfect;
        this.properties = properties;
        this.digitSum = digitSum;
        this.funFact = funFact;
    }

    public NumberProperties() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        this.isPrime = prime;
    }

    public boolean isPerfect(boolean perfect) {
        return isPerfect;
    }

    public void setPerfect(boolean perfect) {
        this.isPerfect = perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public int getDigitSum() {
        return digitSum;
    }

    public void setDigitSum(int digitSum) {
        this.digitSum = digitSum;
    }

    public String getFunFact() {
        return this.funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }
}
