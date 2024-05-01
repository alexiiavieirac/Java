package projects.java.static_modifier.test;

import projects.java.static_modifier.domain.Countries;

public class CountriesTest01 {
    public static void main(String[] args) {
        Countries.setCountryGPD(5000000);

        Countries countries = new Countries("Germany", 838000000);
        Countries countriesTwo = new Countries("Netherlands", 177000000);
        Countries countriesThree = new Countries("France", 679700000);

        countries.showScreen();
        countriesTwo.showScreen();
        countriesThree.showScreen();
    }
}
