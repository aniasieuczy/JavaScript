public class Carpet {

    private double cost;

    public Carpet () {
    }

    public Carpet (double cost) {
        if(cost < 0) {
            cost = 0;
        } else {
            cost = this.cost;
        }
    }


    public double getCost () {
        return cost = this.cost;
    }

}
