import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.ListCellRenderer;
import javax.swing.event.ListDataEvent;

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
     //System.out.println(gender);
     //people1.forEach(System.out::println);
     //System.out.println();
   });

    Optional<String> oldestFemaleAge = persons.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    // oldestFemaleAge.ifPresent(System.out::println);
    System.out.println();
    System.out.println("Sum of numbers : " + SumIntegers(20,30,40,50));
    System.out.println("Sum of numbers : " + SumIntegers(1,2,4,5,6,7,8,90,4));

    String name = "wonde";
    int age = 34;
    String address = "Torino";

    List info = Arrays.asList(name, age, address,"Test");

    //System.out.println(info);
    Fabonacci(10);
    System.out.println();
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
static int SumIntegers(int ... numbers) {

    int sum = 0;
    for (Integer num : numbers) {
        sum += num; 
    }
    return sum;
}

static int Fabonacci(int num){
    // List<Integer> feb = new LinkedList<>();

    // feb = Stream.
    int[] fabonacci = new int[num];
    int sum = 0;
    fabonacci[0]= 1;
    fabonacci[1] = 1;
    for (int i = 2; i < num; i++) {
        fabonacci[i] = fabonacci[i - 1] + fabonacci[i - 2];

    }
    for(int i : fabonacci) {
        System.out.print(" " + i);
        sum += i;
    }
   // sum = fabonacci.stream().reduce(0,(subTotal ,element ) -> subTotal + element);
    return sum;

}
}
