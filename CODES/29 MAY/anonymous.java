class calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result += n;
            
        }return result;

    }
}

public class anonymous {
    public static void main(String[] args) {
        calc obj = new calc();
        // int nums[] = { 5, 3, 4, 7 };
        // int result1 = obj.add(nums);
        int result1=obj.add(new int[]{5,3,4,7});
        System.out.println(result1);
    
    }
}
