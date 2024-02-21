public class string5 {
    public static void main(String[] args) {
 String s1 =new String("pw");
 s1.concat("skills");
 System.out.println(s1); //non immutable
 s1=s1.concat("skills");
 System.out.println(s1);
    }

}
