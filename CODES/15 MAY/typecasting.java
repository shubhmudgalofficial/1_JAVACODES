public class typecasting {
    public static void main(String[] args) {
        int a = 45;
        double b;
        b = a;// implicit typecasting
        System.out.println(b);
        double num1 = 45.5;
        int num2 = (int) num1;// explicit typecasting
        System.out.println(num2);
        int n1 = 12;
        int n2 = 5;
        float result = n1 / n2;
        System.out.println(result); // truncated 2.0 instead of 2.4

    }
}
