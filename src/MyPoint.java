public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        super();
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.x - this.x, 2) + Math.pow(another.y - this.y, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
    }
}
