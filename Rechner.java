package Taschenrechner;

public class Rechner {
    

// Diese Klasse führt die Berechnungen der Grundrechenarten aus


    public double addieren(double a, double b) {
        return a + b;
    }

    public double subtrahieren(double a, double b) {
        return a - b;
    }

    public double multiplizieren(double a, double b) {
        return a * b;
    }

    public double dividieren(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }
}


