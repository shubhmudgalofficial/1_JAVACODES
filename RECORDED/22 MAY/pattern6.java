public class pattern6 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==0&&i>0||j==n&&i>0||i==n/2||i==0&&j>0&&j<n)
              {  System.out.print("*");}
            else{
            System.out.print(" ");}
               
            }
            System.out.println();
              }
        }
}

