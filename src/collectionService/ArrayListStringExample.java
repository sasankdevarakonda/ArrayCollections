package collectionService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListStringExample {
    static Predicate<student> populationPredicate = name ->name.getCountry().equals("UK");
    public static void main(String[] args) {
        List<student> countries = new ArrayList<>();
        countries.add(new student("SASANK","INDIA"));
        countries.add(new student("SAI","USA"));
        countries.add(new student("Sudheer","INDIA"));
        countries.add(new student("Ramu","UK"));
        countries.add(new student("Chandu","UK"));

            List<student> filteredCountries = countries.stream().filter(populationPredicate).collect(Collectors.toList());
            System.out.println(filteredCountries);


        }

}
