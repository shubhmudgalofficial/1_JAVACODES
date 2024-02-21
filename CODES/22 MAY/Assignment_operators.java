public class Assignment_operators {
    public static void main(String[] args) {
        int a=10; // a variable assigned value 10
        int age=21; //age variable assigned 21
        int b,c,d;//same datatypes variable declared together
        b=1;
        c=1;d=1;
        int marks1,marks2,marks3; //same datatypes variable declared together
        marks1=marks2=marks3=100;//assigned to same value together
        int e;
        e=10;
        System.out.println(marks1);
        System.out.println(marks1+" "+marks2+" "+marks3);//printing values together
        int f=10;
        f=f+5;
        System.out.println(f);
        int g=10;
        g+=5;//compound assignment
        System.out.println(g);
        g-=5;
        g/=5;
        g*=5;
        System.out.println(g);
System.out.println(a);
System.out.println(e);
System.out.println(age);

System.out.println(b==c);
System.out.println(d==c);
System.out.println(c==d);

    }
}
