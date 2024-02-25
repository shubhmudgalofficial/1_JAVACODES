import java.lang.Math;
class pattern10{
    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==Math.pow(i, -2)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        System.out.println();
            }
        }
System.out.println(Math.pow(2, 4));
    }
}