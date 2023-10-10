public class Fish extends  Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("Moves muscles");
    }

    private void moveBackFins() {
        System.out.println("Back fin moving");
    }
}
