public class WallArea {

    private double width;
    private double height;

    public WallArea() {
    }

    public WallArea(double width, double height) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    if (height < 0) {
        this.height = 0;
    } else {
        this.height = height;
    }
    }


    public double getWidht () {
        return this.width;
    }

    public void setWidth (double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight (double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        double area = getWidht() * getHeight();
        return area;
    }

}

