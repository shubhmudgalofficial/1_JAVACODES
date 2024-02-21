class student{
  private int age=21;
private String name="shubh";
public void setage(int age ){
this.age = age;


}
public void setname(String name){
this.name=name; //this refers to the particular instance


}
public void show(){
    System.out.println(name+" "+ age);
}

}
public class shadowthis {
    public static void main(String[] args) {
        
    
    student obj= new student();
    student obj1=new student();
//    obj.age=23;
  obj.setage(25);
  obj.setname("krishna");
    obj1.setage(90);
        obj1.setname("hello");
    obj.show();
    obj1.show();
    }
}
/*So here's the main crux out of the whole problem. Here is that that in encapsulation, there lies a 
problem which is named that the shadowing problem in which, if we are defining the local and instance 
variables by the same name, then the compiler has a problem that it always gives priority to the local 
variable, not to the instance variable. So to separately specify that this is an instance variable,
so we have to use this keyword. So we use this.(instance variable) that is specific function in order to specify that
 this is an instance of variable, and not the local variable, so that the whole process can be executed,
 and the parameters that are passed on to that specific function is mentioned along with the data type.
  And then they are passed on in later use. And from there, the values are picked up and then sent to
   the function, and then whole process is executed.*/