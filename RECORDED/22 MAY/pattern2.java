public class pattern2 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n/2;j++){
                if(j==0||j==n/2||i==(n)/2||i==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
