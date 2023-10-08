public class StudentMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S1234" + i,
                    switch(i) {
                        case 1 -> "Helena";
                        case 2 -> "Doris";
                        case 3 -> "Tore";
                        case 4 -> "Nisse";
                        case 5 -> "Janne";
                        default -> "Anonymous";
                    },
                    "21/09/1985",
                    "Java Programming");

            System.out.println(s);
        }
    }
}
