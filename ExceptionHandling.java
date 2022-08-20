public class ExceptionHandling {
    
    public static int printANumber(){
        try {
            int a = Integer.parseInt("30");
            System.out.println("Try Executed.  => " + a);
            return 3;
        } catch (Exception e) {
            System.out.println("Catch Executed." + e.getCause());
            return 4;

        }finally{
            System.out.println("Program Finished.");
                }
     }
    
}
