public class StringB {
    public static void main(String[] args) {
        // String
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        // StringBuilder
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        //printInfo(helloWorld);
        //printInfo(helloWorldBuilder);


        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        //printInfo(emptyStart);
        //printInfo(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        System.out.println(builderPlus);

        // deleteCharAt()
        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);

        // replace()
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        // reverse()
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);





    }

    public static void printInfo(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInfo(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
