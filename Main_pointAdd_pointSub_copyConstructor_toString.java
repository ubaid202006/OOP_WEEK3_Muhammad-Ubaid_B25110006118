public class Main_pointAdd_pointSub_copyConstructor_toString {
    public static void main(String[] args) {


        // Creating Points
        Point p1 = new Point(10, 20);
        Point p2 = new Point(5, 8);


        // Display Points
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);


        // Addition
        Point addition = p1.add(p2);

        System.out.println("\nAddition:");
        System.out.println(addition);


        // Subtraction
        Point subtraction = p1.subtract(p2);

        System.out.println("\nSubtraction:");
        System.out.println(subtraction);


        // Copy Constructor
        Point copy = new Point(p1);

        System.out.println("\nCopy Constructor:");
        System.out.println(copy);
    }
}
