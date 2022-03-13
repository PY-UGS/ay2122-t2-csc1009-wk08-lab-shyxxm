import java.lang.Math;

public class CircleWithException {
    private double radius;

    CircleWithException() {

    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        if (radius < 0) {
            throw new IllegalArgumentException("Enter a radius more than 0");
        }

        this.radius = radius;
    }

    public double getArea() throws Exception {

        double area = Math.PI * Math.pow(radius, 2);

        if (area > 1000) {
            throw new Exception("Area more than 1000, please reduce radius");
        }
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
