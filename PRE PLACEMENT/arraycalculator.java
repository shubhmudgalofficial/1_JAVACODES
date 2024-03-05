
import java.util.*;

class calculator {

    public int add(int a[]) {
        int sum = 0;
        for(int i :a) {
            sum += i;

        }
        return sum;
    }

    public int mul(int a[]) {
        int mul = 1;
        for (int i :a) {
            mul *= i;

        }
        return mul;
    }

}

public class arraycalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("ENTER A[" + (i) + "]");
            a[i] = sc.nextInt();
        }
        calculator c = new calculator();
        System.out.println("sum is" + c.add(a));
        System.out.println("multiply is" + c.mul(a));

    }
}