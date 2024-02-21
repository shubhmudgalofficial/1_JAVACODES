class student{
  private int age=21;
private String name="shubh";
public void setdata(){
age =18;
name="hanuman";
}
public void show(){
    System.out.println(name+" "+ age);
}

}
public class encapsulation_1 {
    public static void main(String[] args) {
        
    
    student obj= new student();
    // obj.show();
    // obj.name="jai shree ram";
    // obj.age=1008 ; 
    // System.out.println(obj.age); age variable is private 
  obj.setdata();
    obj.show();
    }
}
