public class calculator {
    public int add(int a,int b){
int c=a+b;
return c;
    }
    public int sub(int a,int b){
int c=a-b;
return c;
    }
    public int mul(int a,int b){
int c=a*b;
return c;
    }
    public int div(int a,int b){
int c=a/b;
return c;
    }
    public int add(int a,int b,int c){
 int d =a+b;
return c;
    }
    
    public static void main(String []args){
calculator casio=new calculator();
System.out.println(casio.add(7,9));
System.out.println(casio.sub(7,9));
System.out.println(casio.mul(7,9));
System.out.println(casio.div(7,9));
System.out.println(casio.add(7,9,8));

    }
}
