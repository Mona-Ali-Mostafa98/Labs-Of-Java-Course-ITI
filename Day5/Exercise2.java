import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        // Find the most populated city of each continent
        Map<String, Optional<City>> highPopulatedCitiesByContinent = countryDao.findAllCountries()
                .stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.groupingBy(
                        city -> countryDao.findCountryByCode(city.getCountryCode()).getContinent(),
                        Collectors.maxBy(Comparator.comparing(City::getPopulation))
                ));

        highPopulatedCitiesByContinent.forEach((continent, city) -> {
            System.out.println(city.get());
        });
    }
}