public class conditionals {
    public static void main(String[] args) {
        // if else statement

        int age =18;
        if(age>=18)
        {
            System.out.println("legal adult");
        }
        else
        {
            System.out.println("kid");
        }
        // DRIVING ELIGIBLITY
        int age1=35;
        if(age1>=18 && age1<61)
        {
            System.out.println("YOU MAY DRIVE");

        }
        else if(age1>=61)
        {
            System.out.println("DRIVING RISKY OLD MAN NOW");
        }
        else{
            System.out.println("U CANT DRIVE KID");
        }    

        if(age1>=18 && age1<61)
        {if(age1>=20&&age1<=30){
            System.out.println("YOU ARE IN YOUR 20'S");// nested if else
        }
        else if(age1>=30&&age1<=40)
        {
            System.out.println("u are in ur 30s");// nested if else
        }
        }
        else if(age1>=61)
        {
            System.out.println("DRIVING RISKY OLD MAN NOW");
        }
        else{
            System.out.println("U CANT DRIVE KID");
        }    
        
    }
}
