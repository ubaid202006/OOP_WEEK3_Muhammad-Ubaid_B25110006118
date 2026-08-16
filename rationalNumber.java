class Rational {

    private int numerator;
    private int denominator;


    // Default Constructor
    public Rational() {
        numerator = 0;
        denominator = 1;
    }


    // Parameterized Constructor
    public Rational(int numerator, int denominator) {

        this.numerator = numerator;

        if (denominator != 0) {
            this.denominator = denominator;
        } 
        else {
            this.denominator = 1;
        }
    }


    // Copy Constructor
    public Rational(Rational r) {

        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }


    // Addition
    public Rational add(Rational r) {

        Rational result = new Rational();

        result.numerator =
                (this.numerator * r.denominator)
                + (r.numerator * this.denominator);

        result.denominator =
                this.denominator * r.denominator;

        return result;
    }


    // Subtraction
    public Rational subtract(Rational r) {

        Rational result = new Rational();

        result.numerator =
                (this.numerator * r.denominator)
                - (r.numerator * this.denominator);

        result.denominator =
                this.denominator * r.denominator;

        return result;
    }


    // toString
    public String toString() {

        return numerator + "/" + denominator;
    }


    // Display
    public void display() {

        System.out.println(toString());
    }
}

