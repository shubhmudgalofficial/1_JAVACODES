class student {
    private int age;
    private String name;

    void show() {
        System.out.println(age + " " + name);
    }

    public student(String name, int age) // constructor
    {
        this.age = age;
        this.name = name;
    }
}

public class constructor_java {
    public static void main(String[] args) {
        student shubh = new student("shubh", 21);
        student manu = new student("manu", 22);

        shubh.show();
        manu.show();
    }

}
