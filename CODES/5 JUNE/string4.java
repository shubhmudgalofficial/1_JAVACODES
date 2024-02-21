public class string4 {
    public static void main(String[] args) {
        String s1="jai shree ram";
        String s2= new String("jai Hanuman");
        String s3=new String("jai hanuman");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        System.out.println(s2.equalsIgnoreCase(s3)); //ignore case sensitivity

    }
}
