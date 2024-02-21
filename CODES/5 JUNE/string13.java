public class string13 {
    public static void main(String[] args) {
        StringBuffer sb3 = new StringBuffer("sachin");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.capacity());
        System.out.println(sb3.charAt(0));
       sb3.setCharAt(1,'A');
       System.out.println(sb3);
       StringBuilder sb4 =new StringBuilder(150);
       sb4.append("java");
       System.out.println(sb4);
       sb4.trimToSize();
System.out.println(sb4.capacity());
StringBuilder sb=new StringBuilder("pwjava");
System.out.println(sb);
System.out.println(sb.reverse());// to reverse a string
    }
}
