import java.util.ArrayList;

public class BirdWatchers {

    private String name;
    private String latinName;
    private int observations;

    public BirdWatchers(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public boolean containsName (String searchedName) {
        return this.name.contains(searchedName);
    }

    public void addObservation () {
        observations = this.observations + 1;
        }

    public String toString () {
        return this.name + "(" + this.latinName + "): " +  observations + " observations";
    }

}
