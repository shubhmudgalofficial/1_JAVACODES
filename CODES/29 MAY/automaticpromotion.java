class calc {
    public void show(int n) {
        System.out.println("int" + n);
    }

    public void show(double n) {
        System.out.println("double" + n);
    }

    public void show(short n) {
        System.out.println("short" + n);
    }

    public void show(char n) {
        System.out.println("char" + n);
    }

    public class automaticpromotion {
        public static void main(String[] args) {
            calc obj1 = new calc();
            short b =2;
            obj1.show(b);

        }
    }
}
