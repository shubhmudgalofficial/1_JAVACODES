class test{ 
    int a=7; //default value of int is 0
    String name;
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //DECLARE A VARIABLE and create object
int num =9; //primitive variable
       test obj=new test(); //reference variable
       test obj2=new test(); //reference variable
       System.out.println(obj.name);
       System.out.println(obj.a);
       obj2.a=5;
         obj2.name="hello";
       System.out.println(obj2.a);
       System.out.println(obj2.name);

    }
}