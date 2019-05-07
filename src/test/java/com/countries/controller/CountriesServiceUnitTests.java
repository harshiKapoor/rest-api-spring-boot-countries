package com.countries.controller;

import countries.CountriesRepository;
import countries.Country;
import countries.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CountryService.class)
public class CountriesServiceUnitTests {

    // we are testing service
    @Autowired
    private CountryService service;

    // we are mocking mongodb repository
    @MockBean
    private CountriesRepository repository;

    @Test
    public void getAllCountriesTest() {
        when(repository.findAll()).thenReturn(Stream
            .of(new Country(1, "India","NewDelhi","Asia"),new Country(2, "China","Beijing","Asia")).collect(Collectors.toList()));
        assertEquals(2,service.getAllCountries().size());
    }

    @Test
    public void getCountriesByNameTest() {
        String countryName = "India";
        when(repository.findCountryByNameEquals(countryName)).thenReturn(new Country(1,"India","NewDelhi","Asia"));
        assertEquals("India",service.getCountryByName(countryName).getName());
    }

    @Test
    public void addCountryTest() {
        Country country = new Country(2,"China","Beijing","Asia");
        when(repository.save(country)).thenReturn(country);
        assertEquals(country,service.addCountry(country));
    }



}



