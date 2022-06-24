public class Main {

    public static void main(String[] args) {

        WallArea pokoj1 = new WallArea(5.0, 4.0);
        System.out.println("area= " +  pokoj1.getArea());

        pokoj1.setHeight(-1.5);
        System.out.println("width= " + pokoj1.getWidht());
        System.out.println("height= " + pokoj1.getHeight());
        System.out.println("area= " + pokoj1.getArea());
    }
}
