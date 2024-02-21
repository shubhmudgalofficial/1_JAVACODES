
public class ternaryoperator {
    public static void main(String[] args) {
        // syntax-->   (condition)?true:false
        int a=10;
    int b=20; int c=30;
    int result=(a<b)?a:b; //true-->a false-->b
    System.out.println(result);
    String res =(a>b)?"a is less" : "b is less";
    System.out.println(res);
    // greatest of 3 numbers
    int result1=(a>b)?((a>c)?a:c):(b>c)?b:c;
    System.out.println(result1);
    // smallest of 3 numbers
    int result2=(a<b)?((a<c)?a:c):(b<c)?b:c;
    System.out.println(result2);
    // if else
    if(a<b){
        if(a<c){
            System.out.println("a is smallest");}
            else{
                System.out.println("c is smallest");
            }
        }
        else{
            if(b<c){
                System.out.println("b is smallest");
            }
            else{
                System.out.println("c is smallest");
            }
        }
    
    }
}
