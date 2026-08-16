class Complex {

    private int real;
    private int imaginary;


    // Default Constructor
    public Complex() {
        real = 0;
        imaginary = 0;
    }


    // Parameterized Constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    // Copy Constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }


    // Addition
    public Complex add(Complex c) {

        Complex result = new Complex();

        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;

        return result;
    }


    // Subtraction
    public Complex subtract(Complex c) {

        Complex result = new Complex();

        result.real = this.real - c.real;
        result.imaginary = this.imaginary - c.imaginary;

        return result;
    }


    // toString
    public String toString() {

        return real + " + " + imaginary + "i";
    }


    // Display
    public void display() {

        System.out.println(toString());
    }
}

