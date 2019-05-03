package countries;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CountryService {


    ArrayList<Country> countryList = new ArrayList<>(Arrays.asList(
            new Country("India","NewDelhi","Asia"),
            new Country("Japan","Tokyo","Asia"),
            new Country("Israel","Jerusalem","Asia"),
            new Country("Russia","Moscow","Asia"),
            new Country("France","Paris","Europe")
    ));




    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountryByName(String name) {
        return countryList.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public List<Country> getCountryByContinent(String continent) {
        ArrayList<Country> filteredList = new ArrayList<>();

       countryList.stream().filter(t -> t.getContinent().equals(continent)).collect(Collectors.toCollection(() -> filteredList));
       return filteredList;


    }

    public Country getCountryByCapital(String capital) {
        return countryList.stream().filter(t -> t.getCapital().equals(capital)).findFirst().get();
    }


    public void addCountry(Country country) {
       countryList.add(country);
    }


}
