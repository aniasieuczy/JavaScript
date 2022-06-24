public class Point {

    private int x;
    private int y;

    public Point () {
    }

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double calculateDistance () {
    return Math.sqrt((this.x*this.x) + (this.y * this.y));
    }

    public double calculateDistance (int x, int y) {
        return Math.sqrt(((x - this.x)*(x - this.x)) + ((y - this.y)*(y - this.y)));
    }

    public double calculateDistance (Point anotherPoint) {
        return Math.sqrt(((this.x - anotherPoint.x)*(this.x - anotherPoint.x)) + ((this.y - anotherPoint.x)*(this.y - anotherPoint.x)));
    }

}
