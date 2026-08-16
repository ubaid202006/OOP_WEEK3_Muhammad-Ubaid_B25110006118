public class mainRationalNumber {
    public static void main(String[] args) {
        // =========================
        // RATIONAL NUMBER
        // =========================

        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        System.out.println("\nRational Numbers:");

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);


        // Addition
        Rational rAdd = r1.add(r2);

        System.out.println("Addition = " + rAdd);


        // Subtraction
        Rational rSub = r1.subtract(r2);

        System.out.println("Subtraction = " + rSub);


        // Copy Constructor
        Rational rCopy = new Rational(r1);

        System.out.println("Copy = " + rCopy);
    }
}
