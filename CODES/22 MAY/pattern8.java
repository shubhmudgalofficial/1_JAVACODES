public class pattern8 {
    public static void main(String[] args) {
        // pattern to print D
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 &&j<n-1  || i == (n - 1)&&j<n-1 || j == 0||j==n-1&&i> 0&&i<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }System.out.print (" ");
             for (int j = 0; j < n; j++) {
                if (i == 0 &&j<n-1  || i == (n - 1)&&j<n-1 || j == 0||j==n-1&&i> 0&&i<n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
