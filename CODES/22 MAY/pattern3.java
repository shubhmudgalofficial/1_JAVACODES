public class pattern3 {
    public static void main(String[] args) {
        // pattern to print A
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==(n/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
