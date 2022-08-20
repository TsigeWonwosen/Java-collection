public class Student {
    int id;
    String name;
    String age;

    public Student(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public Student(String name, String age) {
        this.id = 48484;
        this.name = name;
        this.age = age;
    }
    
     public Student() {
        this.id = 1;
        this.name = "Abel";
        this.age = "32";
        System.out.println("Constrictor Class.");
    }
    public int  getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }

    public void  studentInfo (){

        System.out.println("Id : " + id + " Name : " + name + " Age :" + age );

    }
}
