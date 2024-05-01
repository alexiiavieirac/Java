package projects.java.static_modifier.domain;

public class Countries {
    private String nameCountry;
    private double countryPopulation;
    private static double countryGPD = 4591000;

    public Countries(String nameCountry, double countryPopulation) {
        this.nameCountry = nameCountry;
        this.countryPopulation = countryPopulation;
    }

    public void showScreen() {
        System.out.println("-------------------------");
        System.out.println("Country Name: " + this.nameCountry);
        System.out.println("Country Population: " + this.countryPopulation);
        System.out.println("Country GPD: " + Countries.countryGPD);
    }

    public static void setCountryGPD(double countryGPD) {
        Countries.countryGPD = countryGPD;
    }

    public static double getCountryGPD() {
        return Countries.countryGPD;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }
}
