public class mainComplexNumber {

    public static void main(String[] args) {


        // =========================
        // COMPLEX NUMBER
        // =========================

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.println("Complex Numbers:");

        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);


        // Addition
        Complex cAdd = c1.add(c2);

        System.out.println("Addition = " + cAdd);


        // Subtraction
        Complex cSub = c1.subtract(c2);

        System.out.println("Subtraction = " + cSub);


        // Copy Constructor
        Complex cCopy = new Complex(c1);

        System.out.println("Copy = " + cCopy);
    }
}