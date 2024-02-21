public class string11 {
    public static void main(String[] args) {
       final StringBuffer sb = new StringBuffer("virat");
        sb.append("kohli");
        System.out.println(sb);
        // sb = new StringBuffer("sachin"); invalid bcz final
        System.out.println(sb);

    }
}