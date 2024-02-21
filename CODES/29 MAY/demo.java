class calc{
public int add(int a,int b){
    int result =a+b;
    return result;
}
public int add(int a,int b,int c){
    int result =a+b+c;
    return result;
}
public double add(double a,double b,double c){
    double result =a+b+c;
    return result;
}
}
public class demo {
    public static void main(String[] args) {
        calc obj1=new calc();
       int result= obj1.add(4,3);
       int result1= obj1.add(4,3,5);
       double result2= obj1.add(4.5,3.5,5.5);
       System.out.println(result);
       System.out.println(result1);
       System.out.println(result2);
    }
}
