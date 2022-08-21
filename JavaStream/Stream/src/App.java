import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Java Stream!");

        List<Person> persons = getPeople();

        //persons.forEach(person -> System.out.println(person)); 
            
        // Imperative approach ❌

    
    List<Person> females = new ArrayList<>();
    for (Person person : persons) {
      if (person.getGender().equals(Gender.FEMALE)) {
        females.add(person);
      }
    }
    //females.forEach(System.out::println);
    
    // Declarative approach ✅

    // Filter
    List<Person> females2 = persons.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
            .collect(Collectors.toList());
    
    //females2.forEach(System.out::println);
    
    // Sort
    List<Person> sorted = persons.stream()
        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
        .collect(Collectors.toList());

    //sorted.forEach(System.out::println);

    // All match
    boolean allMatch = persons.stream()
        .allMatch(person -> person.getAge() > 8);

//    System.out.println(allMatch);
    // Any match
    boolean anyMatch = persons.stream()
        .anyMatch(person -> person.getAge() > 121);

    //    System.out.println(anyMatch);

    // None match
    boolean noneMatch = persons.stream()
        .noneMatch(person -> person.getName().equals("Antonio"));

   // System.out.println(noneMatch);

    // Max
    persons.stream()
        .max(Comparator.comparing(Person::getAge))
        .ifPresent(System.out::println);

    // Min
    persons.stream()
        .min(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

    // Group
    Map<Gender, List<Person>> groupByGender = persons.stream()
        .collect(Collectors.groupingBy(Person::getGender));

   groupByGender.forEach((gender, people1) -> {
     System.out.println(gender);
     people1.forEach(System.out::println);
     System.out.println();
   });

    Optional<String> oldestFemaleAge = persons.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

    

    private static List<Person> getPeople() {
    return List.of(
        new Person("Antonio", 20, Gender.MALE),
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE),
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE),
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE)
    );
  }
}
