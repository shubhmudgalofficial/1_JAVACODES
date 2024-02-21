class student {
    private String name = "shubh";
    private int age = 21;

    void show() {
        System.out.println(age + " " + name);
    }
    // right click > source action>getters and setters  easy

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

}

public class settergetter {
    public static void main(String[] args) {
        student a = new student();
        student a1 = new student();
        a.show();

        // a.name="shree ram";
        a.show();
        a1.show();
        a.setName("hanuman");
        a1.setName("shree ram");
        a.setAge(12);
        a1.setAge(23);
        int stud1Age = a.getAge();
        System.out.println(stud1Age);
        String stud1Name = a.getName();
        System.out.println(stud1Name);
    }
}
