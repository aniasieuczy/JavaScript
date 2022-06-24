public class Floor {

    private double width;
    private double lenght;
    private double area;

    public Floor (double width, double lenght) {
    if(width < 0) {
        width = 0;
    } else {
        width = this.width;
    }
    if(lenght < 0) {
        lenght = 0;
    } else {
        lenght = this.lenght;
    }
    }


    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea () {
        double area;
        return area = width * lenght;

    }
}
