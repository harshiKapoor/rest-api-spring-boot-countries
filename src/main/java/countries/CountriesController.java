package countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.ws.rs.Produces;
import java.util.List;


@Controller
public class CountriesController {

    @Autowired
    private CountryService service;

    @RequestMapping("/countries")
    @ResponseBody
    public List<Country> getAllCountries() {
       return service.getAllCountries();
    }

    //http://localhost:8080/countries/name?name=Japan
    @RequestMapping("/countries/name")
    @ResponseBody
    public Country getCountryByName(@RequestParam String name) {
        return service.getCountryByName(name);

    }

    //    http://localhost:8080/countries/continent?continent=Asia
    @RequestMapping("/countries/continent")
    @ResponseBody
    public List<Country> getCountriesByContinent(@RequestParam String continent) {
        List<Country> list = service.getCountryByContinent(continent);
        return list;
    }

    //http://localhost:8080/countries/NewDelhi
    @RequestMapping("/countries/{capital}")
    @ResponseBody
    public Country getCountryByCapital(@PathVariable String capital) {
        return service.getCountryByCapital(capital);
    }

    @RequestMapping(method=RequestMethod.POST,value="/countries")
    public void addCountry(@RequestBody Country country) {
        service.addCountry(country);
    }




}
