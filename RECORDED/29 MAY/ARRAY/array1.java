class array1{
public static void main(String[] args) {
    int num[] = {1,2,3,4,5,23,32};
    int a=8;
    System.out.println(a);
    System.out.println(num[0]);
    System.out.println(num[1]);
    System.out.println(num[2]);
    System.out.println(num[3]);
    System.out.println(num[4]);
    for(int i=0;i<num.length;i++){
        System.out.print(num[i]+"  ");
    }System.out.println();
   int num1[]=new int[5];
   num1[0]=1; 
   num1[1]=1; 
   num1[2]=1; 
   num1[4]=1; 
   num1[3]=1; 
//    num1[30]=1; //ArrayIndexOutOfBoundsException
   for(int i=0;i<num1.length;i++){
    System.out.print(num[i]+"  ");
}System.out.println();
String name[]=new String[5];
name[1]="Shubh";
name[2]="Shubham";
name[3]="Shubhi";
name[4]="Shubhankar";
// name[0]="Shubhashish";
for(int i=0;i<name.length;i++){
    System.out.println(name[i]);
}
}


}
