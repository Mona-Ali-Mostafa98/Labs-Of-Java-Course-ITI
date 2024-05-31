import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import static java.util.stream.Collectors.toList;

public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao = InMemoryWorldDao.getInstance();
       // Find the highest populated city of each country
      List<City> highest_populated_city_for_country =  countryDao.findAllCountries()
            .stream()
            .map(country -> country.getCities()
                  .stream()
                  .max(Comparator.comparing(City::getPopulation)))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .collect(toList());
      
      highest_populated_city_for_country.forEach(System.out::println);
   }
}