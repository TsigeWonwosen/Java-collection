public class Runner{
    public void run(Lambda a) {
        System.out.println("Executer Code block.");

        int value = a.execute(20);
        System.out.println("Return value is : " + value);

    }

    public void execute(int a) {
        System.out.println("result : " + a * 2);
    }

}