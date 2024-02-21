public class string7 {
    public static void main(String[] args) {
        String s1="pw";
        String s2="pw"+"java";
        String s3="pw"+"java"+"skills";
        //inside scp
        String s4=s1+s2; //outside scp
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        String str="shubh";
        str=str+100+99;
        System.out.println(str);
    }
}
