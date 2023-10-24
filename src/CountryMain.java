public class CountryMain {
    public static void main(String[] args) {
       // System.out.println("Number of countries: " + Country.getNumberOfCountries());

       /* Country sweden = new Country("Sweden", 10000000, "Stockholm");
        System.out.println("Number of countries: " + sweden.getNumberOfCountries());
        Country finland = new Country("Finland", 5000000, "Helsinki");
        Country norway = new Country("Norway", 5000000, "Oslo");
        System.out.println("Number of countries: " + sweden.getNumberOfCountries());
        System.out.println("Number of countries: " + norway.getNumberOfCountries());*/

        /*System.out.println("Number of countries: " + Country.getNumberOfCountries());
        Country sweden = new Country("Sweden", 10000000, "Stockholm");
        Country finland = new Country("Finland", 5000000, "Helsinki");
        Country norway = new Country("Norway", 5000000, "Oslo");
        System.out.println("Number of countries: " + Country.getNumberOfCountries());*/


        System.out.println("Number of countries: " + Country.getNumberOfCountries());
        Country sweden = new Country("Sweden", 10000000, "Stockholm");
        sweden.getDetails();
        Country finland = new Country("Finland", 5000000, "Helsinki");
        finland.getDetails();
        Country norway = new Country("Norway", 5000000, "Oslo");
        norway.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCountries());







    }
}
