public class InterfaceMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        AnimalInterface animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        //flier.move();
        //tracked.move();


        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
