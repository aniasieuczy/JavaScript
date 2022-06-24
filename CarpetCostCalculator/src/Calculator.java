public class Calculator {

    private Floor Floor;
    private Carpet Carpet;

    public Calculator (Floor Floor, Carpet Carpet) {
    }

    public double getTotalCost (){
        double totalCost;
        return totalCost =  Floor.getArea() * Carpet.getCost();

    }

}
