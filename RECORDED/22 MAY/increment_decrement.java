class increment_decrement{
public static void main(String[] args) {
    int a=5;
    a=a+1;
    System.out.println(a);
    a++;//postincrement
    System.out.println(a);
    a--;//postdecrement
    System.out.println(a);
    //example
    int b,c;
    b=3;
    System.out.println(b);
    c=b++;
    System.out.println(b);
    System.out.println(c);
    b=3;
    System.out.println(b);
    c=++b;
    System.out.println(b);
    System.out.println(c);
    b=3;
    System.out.println(b);
    c=b--;
    System.out.println(b);
    System.out.println(c);
    b=3;
    System.out.println(b);
    c=--b;
    System.out.println(b);
    System.out.println(c);
    System.out.println("question");
  {  int d=5;
    int e=d++ + ++d + --d;
    System.out.println(e);

  }
  {
    int f=5;
    int g= f++ + ++f + ++f  + f++ + --f +f--;
    System.out.println(f+" "+g);
  }
}
}