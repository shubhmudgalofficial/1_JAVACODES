class calc {

    public int add(int a, int b) {
         int result=a + b;
         return result;
    }
    public int add(int a, int b,int c) {
        //example of method overloading
        //if method name is same the parameters should be diff
         int result=a + b+c;
         return result;
    }
    public double add(double a,double b){
        double result=a+b;
return result;
    }


    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

}

public class demo {
    public static void main(String[] args) {
calc obj =new calc();
 int result= obj.add(40, 05);
 int result1= obj.add(40, 05,4);
 double result3= obj.add(4.5, 2.3);
 System.out.println(result);
 System.out.println(result1);
 System.out.println(result1);
 System.out.println(result3);
    }
}
