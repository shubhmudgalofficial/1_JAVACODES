public class Datatype {
    public static void main(String[] args) {
        // for numeric data
        // whole numbers
        byte age = 45;
        // byte range :- -128 to 127
        short b = 3353;
        System.out.println(b);
        // short range :- -32768 to 32767
        int c = 78645;
        System.out.println(c);
        // int range =-2147485648 to 2147485647 sufficient range use this always
        // long range -2^64 to 2^64 -1 large range
        long data = 760832178l; // use L OR l in last as per syntax otherwise by default int is considered
        System.out.println(data);
        System.out.println(age);
        System.out.println(b);
        System.out.println(c);
        System.out.println(data);
        // JUST USE INT 99% CASES WITHOUT ANY SECOND THOUGHT
        //  for real numbers 
        // use float and double(default)
        float g=45.6f; // syntax 4 bytes float
        System.out.println(g);
        double h=66.383;
        System.out.println(h); //8 bytes use for high precision
        // float is more preffered generally
        // boolean datatype
        boolean shubh=true; // only true or false
        System.out.println(shubh);
        //  char datatype
        char a='A';
        System.out.println(a);
        
    }
}
