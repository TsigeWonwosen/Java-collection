public class Factorial {

    public static int factorial(int num) {
        
            System.out.print(num );
            if (num > 1) {
                System.out.print(" * ");
            }
           
            if (num < 2) {
            System.out.println();;
            return 1;

        } else {
            return factorial(num - 1) * num;
        }
       
    }
    
    
    
}
