package countries;

public class Country {
    private String name;
    private String capital;
    private String continent;

    public Country(String name, String capital , String continent) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }
}
