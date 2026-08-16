 class Point {

    private int x;
    private int y;

    // Object Count
    private static int objCount = 0;


    // Null / Default Constructor
    public Point() {
        x = 0;
        y = 0;
        objCount++;
    }


    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        objCount++;
    }


    // Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
        objCount++;
    }


    // Setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    // Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // Object Count
    public static int getObjCount() {
        return objCount;
    }


    // toString
    public String toString() {
        return "X = " + x + ", Y = " + y;
    }


    // Display
    public void display() {
        System.out.println(toString());
    }
}