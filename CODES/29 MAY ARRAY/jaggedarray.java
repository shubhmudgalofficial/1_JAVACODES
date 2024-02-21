
public class jaggedarray {
    public static void main(String[] args) {
        // 2d array
        // int nums[][]=new int[3][2];
        // nums[0][0]=23;
        // nums[0][1]=454;
        // nums[1][0]=346;
        // nums[1][1]=344;
        // nums[2][0]=342;
        // nums[2][1]=3;

        int nums[][] = { { 5, 2, 4, 6 }, { 3, 6 }, { 2, 7, 3 } }; // rox fix coloumn not fix >> jagged array

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < nums[i].length; j++) //to get coloumns
             {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
