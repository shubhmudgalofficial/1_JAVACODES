public class logicaloperators {
    public static void main(String[] args) {
        // logical operators
        // && logical and --> all true only then true
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        boolean result = (a < b) && (b < c) && (c > a);
        System.out.println(result);
        System.out.println((a > b) && (b < c) && (c > a)); // if even one false exprn evaluates to false
        // logical or ||
        // if all false then false
        // if even one true --> true
        boolean result1=(a<b)||(b>c)||(c<a); //one true then true
        System.out.println(result1);
        System.out.println((a>b)||(b>c)||(c<a)); //all false then false
        // System.out.println(10==100 || 10<20 || 20<30);
        System.out.println(!true);
        System.out.println(!false);
    }
}