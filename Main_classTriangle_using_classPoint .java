public class Main_classTriangle_using_classPoint {

    public static void main(String[] args) {


        // Parameterized Point Objects
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);


        // Parameterized Triangle
        Triangle t1 = new Triangle(p1, p2, p3);

        System.out.println("Triangle 1:");
        t1.display();


        // Copy Constructor
        Triangle t2 = new Triangle(t1);

        System.out.println("\nTriangle 2 (Copy):");
        t2.display();


        // Default Constructor
        Triangle t3 = new Triangle();

        System.out.println("\nTriangle 3 (Default):");
        t3.display();


        // Setter
        p1.setX(10);
        p1.setY(20);

        System.out.println("\nAfter Setter:");
        p1.display();


        // Getter
        System.out.println("\nGetter:");
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());


        // Object Count
        System.out.println("\nObject Count:");
        System.out.println("Point Objects = " + Point.getObjCount());
        System.out.println("Triangle Objects = " + Triangle.getObjCount());
    }
}
