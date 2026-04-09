
public class encapsulationDemo {
    private String name = "john";
    private int age = 24;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        encapsulationDemo obj = new encapsulationDemo();
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        obj.setName("Doe");
        obj.setAge(30);

        System.out.println("Updated Name: " + obj.getName());
        System.out.println("Updated Age: " + obj.getAge());
    }
}
