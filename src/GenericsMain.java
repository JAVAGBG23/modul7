public class GenericsMain {
    public static void main(String[] args) {
        // GENERICS CLASS
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generics class returns: " + intObj.getData());

        GenericsClass<String> stringObj = new GenericsClass<>("Java programming");
        System.out.println("Generics class returns: " + stringObj.getData());

        // GENERICS METHOD
        GenericsMethod demoMethod = new GenericsMethod();

        demoMethod.<Integer>genericsMethod(5);

        demoMethod.<String>genericsMethod("Java programing");

        demoMethod.genericsMethod(5);
    }
}
