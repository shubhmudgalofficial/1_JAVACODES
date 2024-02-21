class student{
    private String name="shubh";
     int age =21;
   void show(){
System.out.println(age+" "+name);
   }
   void setName(String s){
name=s;
   }
   void setAge(int a){
age=a;
   }
}
public class shubh {
    public static void main(String[] args) {
        student a=new student();
        student a1=new student();
        a.show();
        
        // a.name="shree ram";
        a.show();
        a1.show();
        a.setName("hanuman");
        a1.setName("shree ram");
        a.setAge(12);
        a1.setAge(23);
        a.show();
        a1.show();
    }
}
