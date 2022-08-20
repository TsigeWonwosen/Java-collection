import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.RunElement;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner input = new Scanner(System.in);
        //     System.out.println("Enter full Name : ");
        //     String fullName = input.nextLine();
        //     System.out.println("Enter Number : ");
        //     int Limit = input.nextInt();
        //     input.close();

        // Application application = new Application();

        // application.info(fullName);
        // application.forLoop(Limit);

        // application.whileLoop();

        // Application.sayHello();

        // Application.ScannerDemo();
        //ArrayClass.SingleDimensionArray();
        //ArrayClass.doubleDimensionArray();

        // Student st = new Student();
        //st.studentInfo();
        // Student st2 = new Student("Wonde", "34");

        // st2.studentInfo();

        // Student st3 = new Student(345, "Fasil", "35");

        // st3.studentInfo();

        // String firstName = st.getName();
        // String SecondName = st2.getName();
        // String thirdName = st3.getName();

        // System.out.println("First student \t" + "Second Student \t" + "Third Student ");
        // System.out.println(firstName + " \t \t" + SecondName + " \t \t" + thirdName );

        //StringBuilder

        // StringBuilder sb = new StringBuilder();
        //    sb.append("I am Wondwosen.");
        //    sb.append(" i am  Computer Engineer.");
        //    sb.append(" And also a fullstack Developer.");

        //  //  System.out.println(sb.toString());

        //    Machine m1 = new Machine();

        //    m1.setMachine("M234 - f", "Jun 2003", 182828, "Torino");
        //    m1.machineInfo();

        //    Car car = new Car();

        //    car.setMachine("C134", "Sep 2001", 20000, "London");
        //    car.machineInfo();

        //WildCards - Genereic 

        // ArrayList<GenericWildCards> list1 = new ArrayList<GenericWildCards>();

        //         list1.add(new GenericWildCards());
        //         list1.add(new GenericWildCards());

        //         ArrayList<Camera> list2 = new ArrayList<Camera>();

        //         list2.add(new Camera());
        //         list2.add(new Camera());

        //         System.out.println(" >>>>  list2 ");
        //         GenericWildCards.showList(list2);

        //         System.out.println(" **** list1 ");
        //         GenericWildCards.showList2(list1);
        //         GenericWildCards.showList3(list1);

        //         System.out.println("**** List 3");

        //         ArrayList<GenericWildCards> list3 = new ArrayList<>();

        //         list3.add(new Lense());
        //         list3.add(new Camera());
        //         list3.add(new GenericWildCards());

        //         GenericWildCards.showList(list3);
        //         // GenericWildCards.showList2(list3);
        //         // GenericWildCards.showList3(list3);

        //         System.out.println("**** List 4 - Overriding");
        //     ArrayList<GenericWildCards> list4 = new ArrayList<GenericWildCards>() {

        //      @Override
        //     public void start() {
        //     System.out.println("Camera starting.");
        // }
        // };

        // File Read

        //FileRead.getFile();
        //ExceptionHandling.printANumber();

        // System.out.println( "Factorial : \n" + Factorial.factorial(5));

        // printText("Hi Wonde");
        App app = new App();
        //  Animal cat = app.new Animal("kkk", 20);
        //System.out.println(cat);

        // ArrayList<Animal> animal = new ArrayList<Animal>();
        // animal.add(app.new Animal("Cat", 2));
        // animal.add(app.new Animal("Pig", 3));
        // animal.add(app.new Animal("Sheep", 1));

        // Collections.sort(animal);
        // for(Animal list : animal){

        //     System.out.println(list);
        //     System.out.println("****");
        //     printText(list);

        // }

        String[][] drivers = {
                { "Fred", "Sue", "Pete" },
                { "Sue", "Richard", "Bob", "Fred" },
                { "Pete", "Mary", "Bob" }
        };
        // String[] persons = drivers[1];
        // for (String person : persons) {

        //     System.out.print(" " + person);
        // }
        // System.out.println();
        // System.out.println("Driver " + drivers[1]);
        // System.out.println("Driver " + Arrays.toString(drivers[1]));

        //ComplexData.matchVehiclesDriver();

        Map<Integer, String> student = new TreeMap<Integer, String>();

        student.put(10, "Wonde");
        student.put(5, "Abel");
        student.put(3, "Chuchu");
        student.put(11, "John");
        student.put(4, "Feven");
        student.put(22, "Hiwot");
        //student.forEach((id,name)-> System.out.println(" Id:" + id + " - Name : " + name));

        // Anonymous class
        Runner runner = new Runner();
        runner.run(new Lambda() {
            public int execute(int a) {
                System.out.println("Java 7 >  Implementation .");
                return a;
            }
        });

        //Lambda Expiration 
        System.out.println("*** Lambda Expiration. Java 8 <  Implementation ");
        Lambda result = (x) -> x + 10;
        runner.run(result);
        System.out.println(" Override runner method.");

        runner.execute(10);

    }
    

    private static <T> void printText(T anyValue){
        System.out.println(anyValue + "!!!!");
    }
    
    public class Animal {
        private String name;
        private int age;
    
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;

        }
        
        public String toString() {
            return ("Name: " + name + " Age: " + age);
        }
    }
}
