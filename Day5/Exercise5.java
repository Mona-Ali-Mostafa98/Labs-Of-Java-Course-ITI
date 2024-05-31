import java.util.Objects;
import java.util.Optional;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        // Find the highest populated capital city
		Optional<City> highestPopulatedCapital = countryDao.findAllCountries()
                .stream()
                .map(Country::getCapital)
                .map(cityDao::findCityById)
                .filter(Objects::nonNull)
                .collect(maxBy(comparing(City::getPopulation)));

        highestPopulatedCapital.ifPresent(out::println);
System.out.println(highestPopulatedCapital.get());
        
    }

}