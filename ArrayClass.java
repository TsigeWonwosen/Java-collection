import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayClass {


   public static int count = 0; 
    
   public ArrayClass() {
       count++;
       System.out.println("Number Of Counts :" + count);
   }
    
   public static void SingleDimensionArray() {

       String[] Fruits = new String[10];

       ArrayList<String> lists = new ArrayList<String>();

       Scanner item = new Scanner(System.in);
       String value = "Avocado";
       String end = "Exit";
       int index = 0;
       while (!value.equals(end)) {
           System.out.println("Enter Fruit : ");
           value = item.nextLine();
           if (!value.equals(end ) && !value.equals("exit")) {

               Fruits[index] = value;
               lists.add(value);
           }
           index++;

       }

       System.out.println("Non Generic Array.");

       Collections.sort(lists); // Sort cars
       
       for (String fruit : Fruits) {

           System.out.print(" " + fruit);

       }
System.out.println();
       System.out.println("Generic Array List. ");

       item.close();
       for (String list : lists) {

           System.out.print(" " + list);

       }
       System.out.println();
   }
    public static void doubleDimensionArray() {
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-3d :",i+1);
            for (int j = 0; j < 10; j++) {
                 
                if(i > j){

                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
    
}
