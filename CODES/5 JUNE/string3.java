public class string3 {
    public static void main(String[] args) {
        String brand="pw";
        System.out.println(brand);
        // type 2
        String brand2=" pw";
        System.out.println(brand2);
        // what is the difference?

     String s1="pwskill";// store in scp refernece 1
    
     String s2="pwskills";// store in scp same as 1 reference
     System.out.println(s1);
     System.out.println(s2);
     String s3=new String("pwskills");
     String s4=new String("pwskills");
    //  DIFFERENT OBJECT CREATE FOR S3 AND S4 WITH DIFFERTENT REFERENCE
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s1==s2); //same reference
    System.out.println(s3==s4);// different reference
    System.out.println(s3.equals(s4));
    System.out.println(s1.equals(s4));
    // equals used to compare actual object
    String s5="pwskills";
    String s6="pwskills";
    String s7="pwSKILLS";
    System.out.println(s5==s6);
    System.out.println(s6==s7);
    System.out.println(s5.equals(s6));
    System.out.println(s5.equals(s7));

    }
}
