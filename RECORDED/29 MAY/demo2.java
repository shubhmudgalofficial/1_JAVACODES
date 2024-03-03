class show{
    public void display(int a){
System.out.println("int"+a);
    
    }
    public void display(byte a){
System.out.println("byte"+a);
    
    }
    public void display(short a){
System.out.println("short"+a);
    
    }
    public void display(char a){
System.out.println("char"+a);
    
    }
    public void display(long a){
System.out.println("long"+a);
    
    }
    public void display(double a){
System.out.println("double"+a);
    
    }
}

public class demo2 {
    public static void main(String[] args) {
        show obj=new show();
        obj.display(2.4 );
        obj.display('o');
        byte b=3;
        obj.display(b);
        double c=3;
        obj.display(c);
        

    }
}
