public class string12 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer ();
        System.out.println(sb.capacity());
        StringBuilder sb1=new StringBuilder ();
        System.out.println(sb1.capacity());
        sb.append("abcdefghijklmnop;");
        System.out.println(sb.capacity());
        sb.append("a");
        System.out.println(sb.capacity());//how many charavters can u keep
        System.out.println(sb.length());// hown many characters are present
        StringBuffer sb3 = new StringBuffer("sachin");
        System.out.println(sb3);
        
    }}