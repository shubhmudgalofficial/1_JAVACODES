public class pattern5 {
    public static void main(String[] args) {
        // pattern to print E
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
if( i==0||i==(n-1)/2||i==n-1||j==0){
System.out.print("*");
}
else{System.out.print(" ");

}
            }System.out.println();
        }
    }
}

