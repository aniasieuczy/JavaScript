import java.util.ArrayList;

public class Box {

    private double weight;
    private ArrayList <Packable> packables;

    public Box () {
    }

    public Box (double weight) {
        this.weight = weight;
        this.packables = new ArrayList<>();
    }

    public void add (Packable packable){
        this.packables.add(packable);
    }


    public double items () {
        return this.packables.size();
    }

    public double packBox () {
        double weight = 0;
        for(Packable box: packables) {
            weight = weight + box.weight();
        }
        return weight;
    }

    public double weight () {
        double weight = 0;

        return weight;
    }


    public String toString () {
        return "Box: " + this.packables.size() + " items, total weight " + weight;
    }

}