class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    // Object Count
    private static int objCount = 0;


    // Null / Default Constructor
    public Triangle() {

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();

        objCount++;
    }


    // Parameterized Constructor
    public Triangle(Point p1, Point p2, Point p3) {

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        objCount++;
    }


    // Copy Constructor
    public Triangle(Triangle t) {

        p1 = new Point(t.p1);
        p2 = new Point(t.p2);
        p3 = new Point(t.p3);

        objCount++;
    }


    // Setter
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }


    // Getter
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }


    // Object Count
    public static int getObjCount() {
        return objCount;
    }


    // toString
    public String toString() {

        return "Triangle:\n"
                + "P1: " + p1 + "\n"
                + "P2: " + p2 + "\n"
                + "P3: " + p3;
    }


    // Display
    public void display() {
        System.out.println(toString());
    }
}