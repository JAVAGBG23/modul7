public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Companion dog", "medium", 20);
    }

    public Dog (String type, double weight) {
        this(type, weight, "Pointy", "Tapering");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type == "Basenji") {
            System.out.println("Yodel! ");
            System.out.println();
        } else {
            bark();
            System.out.println();
        }
       // bark();
      //  System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dog walk, run or wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    public void bark() {
        System.out.println("Woof! ");
    }

    public void run() {
        System.out.println("Dog running ");
    }

    public void walk() {
        System.out.println("Dog walking ");
    }

    public void wagTail() {
        System.out.println("Tail wagging ");
    }
}
