public class dowhileloop {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println(i);
            System.out.println("*jai shree ram jai hanuman*");
            ++i;
        }while (i<5);
        System.out.println(i); /// now i is 5
         do{
            System.out.println(i);
            System.out.println("*jai shree ram jai hanuman*");
            ++i;
        }while (i<5); // atleast one time execution even if the condn is false
    }
}
