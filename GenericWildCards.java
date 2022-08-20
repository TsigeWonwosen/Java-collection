import java.util.ArrayList;

public class GenericWildCards {
    
    @Override
    public String toString() {
        return "I am a machine";
    }
    
    public void start() {
        System.out.println("Machine starting.");
    }

    public static void showList(ArrayList<? extends GenericWildCards> list) {
        for (GenericWildCards value : list) {
            System.out.println(value);
            value.start();
        }

    }
    
    public static void showList2(ArrayList<? super Lense> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
    
    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}


class Camera extends GenericWildCards {
    @Override
    public String toString() {
        return "I am a camera";
    }
    
    public void snap() {
        System.out.println("snap!");
    }
}

class Lense extends Camera {

    @Override
    public String toString() {
     return "I am a Lense.";
    }

    @Override
    public void start() {
        System.out.println("Lense starting.");
    }
}