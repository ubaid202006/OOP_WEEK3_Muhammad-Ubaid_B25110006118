class Point {

    private int x;
    private int y;


    // Default / Null Constructor
    public Point() {
        x = 0;
        y = 0;
    }


    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
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


    // Addition of Points
    public Point add(Point p) {

        Point result = new Point();

        result.x = this.x + p.x;
        result.y = this.y + p.y;

        return result;
    }


    // Subtraction of Points
    public Point subtract(Point p) {

        Point result = new Point();

        result.x = this.x - p.x;
        result.y = this.y - p.y;

        return result;
    }


    // toString
    public String toString() {

        return "(" + x + ", " + y + ")";
    }


    // Display
    public void display() {

        System.out.println(toString());
    }
}