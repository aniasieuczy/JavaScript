
public class AreaCalculator {

    public static final double PI = Math.PI;

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double areaOfCircle = radius * radius * PI;
            return areaOfCircle;
        }
    }

    public static double area (double x, double y) {
        if ((x < 0 ) || (y < 0)) {
            return -1;
        } else {
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }

    }

}
