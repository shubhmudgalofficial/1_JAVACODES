import java.util.*;
public class patternshubh {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

Scanner sc =new Scanner (System.in);
System.out.println("enter n");
int n=sc.nextInt();

for(int i=0;i<=n;i++){
    for(int j=0;j<=n;j++){
        if(i==0||i==n||j==0&&i<n/2||j==n&&i>n/2||i==n/2){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
            }System.out.print("   ");
            for(int j=0;j<=n;j++){
                if(j==0||j==n||i==n/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    }System.out.print("   ");
                    for(int j=0;j<=n;j++){
                        if(i==n||j==0||j==n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                            }System.out.print("   ");
                            for(int j=0;j<=n;j++){
                                if(i==0||i==n||j==0||i==n/2||j==n){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                                    }
                                    System.out.print("   ");
                            for(int j=0;j<=n;j++){
                                if(j==0||j==n||i==n/2){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                                    }
                                    
                    
                    System.out.println();
}

    }
}
