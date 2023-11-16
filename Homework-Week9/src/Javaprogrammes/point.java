
package Javaprogrammes;

public class point {
    private int x;
    private int y;

    public point() {
    }

    public point(int x, int y) {
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

    public double distance() {
        return 0;

    }

    public static void main(String[] args) {
        point first = new point(6, 5);
        point second = new point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance());
        System.out.println("distance(2,2)= " + first.distance());
        point point = new point();
        System.out.println("distance()= " + point.distance());

    }

}
