package countries;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CountriesRepository extends MongoRepository<Country, Integer> {
    public Country findCountryByNameEquals(String name);
    public List<Country> findCountryByContinentEquals(String continent);
    public Country findCountryByCapitalEquals(String captial);


}
