public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "large", 100);
        //doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        //doAnimalStuff(dog, "fast");

        Dog miniBulle = new Dog("Miniature Bullterrier", 20);
        doAnimalStuff(miniBulle, "slow");

        Dog miniSchnauzer = new Dog("Miniature Schnauzer", 7, "V shape", "Sabre");
        doAnimalStuff(miniSchnauzer, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}