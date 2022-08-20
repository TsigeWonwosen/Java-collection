public class Machine {
    String machineName;
    String manufacturedDate;
    int price;
    String location;


    public void setMachine(String name ,String date, int price , String location) {
        this.machineName = name;
        this.manufacturedDate = date;
        this.price = price;
        this.location = location;
    }
    public  void machineInfo() {
        System.out.println("Machine Name \t" + " Manufactured Date \t" + " Price \t" + " Location");
        System.out.printf("%-2s \t %-2s \t %7d \t %-2s ", machineName, manufacturedDate, price, location);
        System.out.println();
    }
    
}
