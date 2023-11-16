package Javaprogrammes;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
    public static void main(String[] args) {

        //Test Code:
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());

        Cylinder cyclinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radium = " + cyclinder.getRadius());
        System.out.println("cylinder.height = " + cyclinder.getHeight());
        System.out.println("cylinder.area = " + cyclinder.getArea());
        System.out.println("cylinder.volume = " + cyclinder.getVolume());

    }
}





