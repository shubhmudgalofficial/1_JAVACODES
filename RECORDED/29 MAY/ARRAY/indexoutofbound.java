public class indexoutofbound {
    public static void main(String[] args) {
        int a[]={1,2,3,5};
        System.out.println(a[0]); 
        System.out.println(a[a.length-1]); //ArrayIndexOutOfBoundsException
        System.out.println("bye"); 
        for(int i:a){
            System.out.println(i);
        }
    }
}
