public class enhancedforloop {
    public static void main(String[] args) {

        int nums[] = { 5, 34, 5, 2 };
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println();

        int array2d[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        for (int i[] : array2d) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
