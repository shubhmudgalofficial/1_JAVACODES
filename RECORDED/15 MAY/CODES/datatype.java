public class datatype {
    public static void main(String[] args) {
        
        byte a = 127;
        System.out.println(a); // range -128 -->127
        short b = -32768;
        System.out.println(b); // range -32768-->32767
        int c = 1318398549; /// mostly used
        System.out.println(c); // range -2147485648 -->2147485647
        // or bada number ho to long
        long data = 612873681723l; // use l no ke baad me
        System.out.println(data);
        // operation result always in int
        // int is most preferred
        // realnumber
        float e = 45.5f; // use f as suffix
        System.out.println(e);
        double h = 45.9;
        System.out.println(h);
        boolean word = true;
        System.out.println(word);
        // type casting
        int num = 455;
        double num2 = num;
        System.out.println(num2); // implicit
        int num3;
        double num4 = 764.96;
        num3 = (int) num4;
        System.out.println(num3);// explicit type casting
        int n1 = 5;
        int n2 = 12;
        float n3 = n2 / n1;
        System.out.println(n3);

    }
}
