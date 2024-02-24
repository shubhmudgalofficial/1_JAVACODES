public class increment_and_decrementOperator {
    public static void main(String[] args) {
        int a = 5;
        a = a + 1;
        System.out.println(a);
        a = a - 1;
        System.out.println(a);
        a++;//post increment (one operator no effect ) first assign then increment
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a; //pre increment9(one operator no effect) first increment then assign
        System.out.println(a);
        --a;
        System.out.println(a);
        int b = 2, c ,d;
        c=b++;
        System.out.println(b);// b becomes 3 instantly
        System.out.println(c);// c uneffected
        //now b is 3
        d=++b;
        System.out.println(b);
        System.out.println(d);
        // now d=b=4
        b=--d;
        System.out.println(b);
        System.out.println(d);
        int x=5,y;
        y=x++ + ++x +--x;
        System.out.println(x);
        System.out.println(y);
int m=5,n;
n=m++ + ++m + ++m +m++ +--m +m--;
System.out.println(m); //7
System.out.println(n); //44




    }
}
