import java.util.*;
public class ifelse {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter age");
        int age=obj.nextInt();
        if(age>=18){
            System.out.println("legal adult");
        }
        else{
            System.out.println("not adult");
        }
    }

}
