public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius () {
        return this.radius;
    }

    public double getArea () {
        double area;
        return area = radius * radius * Math.PI;
    }

}

