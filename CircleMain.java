import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Exception;
import java.lang.IllegalArgumentException;

public class CircleMain {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double radius = 0;

        try {
            System.out.print("Enter radius of Circle: ");
            radius = input.nextDouble();

            CircleWithException circle = new CircleWithException();
            circle.setRadius(radius);

            System.out.print("Area of circle is: " + df.format(circle.getArea()));
            System.out.print("\nThe perimeter of the circle is: " + df.format(circle.getPerimeter()));
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        } catch (Exception i) {
            System.out.println(i.getMessage());
        }

        input.close();

    }
}
