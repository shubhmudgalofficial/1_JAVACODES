import java.util.*;

public class logicaloperators {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a == b && a < b && a > b);
        System.out.println(a < b && a <= b && a <= c);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter age");
            int age = sc.nextInt();
            System.out.println(age);
            if(age>18&&age<60){
                // && sare true tabhi true
                System.out.println("maze hi maze");
            }
            else{
                System.out.println("moye moye");
            }
        }
        System.out.println(10== 100||10==20||10>20);
        // || or me ek bhi true to true
System.out.println(!true);
System.out.println(!false);

    }
}
