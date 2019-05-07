package countries;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @AllArgsConstructor
@Document(collection = "countries")
public class Country {

    @Id
    private int id;

    private String name;
    private String capital;
    private String continent;

//    public Country(Integer id, String name, String capital , String continent) {
//        this.id = id;
//        this.name = name;
//        this.capital = capital;
//        this.continent = continent;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCapital() {
//        return capital;
//    }
//
//    public String getContinent() {
//        return continent;
//    }
//
//    public void setName(String name) {this.name = name; }
//
//    public void setCapital(String capital) {this.capital = capital; }
//
//    public void setContinent(String continent) { this.continent = continent; }
}
