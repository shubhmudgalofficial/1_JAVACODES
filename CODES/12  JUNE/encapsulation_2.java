class student{
  private int age=21;
private String name="shubh";
public void setdata1(int a ){
age = a;


}
public void setdata2(){
name="shubh";


}
public void show(){
    System.out.println(name+" "+ age);
}

}
public class encapsulation_2 {
    public static void main(String[] args) {
        
    
    student obj= new student();
    student obj1=new student();
//    obj.age=23;
  obj.setdata1(25);
    obj1.setdata2();
    obj.show();
    obj1.show();
    }
}