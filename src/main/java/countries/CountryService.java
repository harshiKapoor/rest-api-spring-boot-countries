package countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CountryService {


    @Autowired
    private CountriesRepository repository;


    public List<Country> getAllCountries() {

        return repository.findAll();

    }

    public Country getCountryByName(String name) {

        return repository.findCountryByNameEquals(name);

    }

    public List<Country> getCountryByContinent(String continent) {

        return repository.findCountryByContinentEquals(continent);

    }

    public Country getCountryByCapital(String capital) {

        return repository.findCountryByCapitalEquals(capital);
    }


    public String addCountry(Country country) {

        repository.save(country);
        return "Added Country successfully";
    }


}
