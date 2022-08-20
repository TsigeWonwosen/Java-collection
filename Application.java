import java.util.Scanner;

public class Application {
    public static void sayHello(){

        System.out.println("Application Class");
        System.out.println();
    }

    public void info(String name) {

        System.out.println("Full Name : " + name);
    }

    public void forLoop(int number ) {
        
        int total = 0 ;
        
        for (int i = 0; i <=  number; i++) {
            total = total  + i;
           //System.out.print("- " + total);
            
        }
        System.out.println();
        System.out.printf("Total Sum : %f \n", (float)total);
       
     
}
    public void whileLoop() {
        int num = 10;

        while(num < 50){
            System.out.println(num);

            num = num * 2;
        }
    }

    public static void ScannerDemo()
    {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // Initialize sum and count of input elements
        int sum = 0, count = 0;
 
        // Check if an int value is available sc.hasNextInt(6)
        while (sc.hasNextInt())
        {
            // Read an int value
            System.out.println("Enter Integer : ");
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean + " Sum : " + sum + " Count : " + count);
        sc.close();
    }
}