public class pattern9 {
    public static void main(String[] args) {
        // pattern programming part2 
        // diagonal print square design
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||(i+j)==n-1||i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
