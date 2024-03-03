class calc {
    public int add(int a[]) {
        int result = 0;
        for (int i : a) {
            result += i;
        }    
        return result;
    }

}

public class anonymousarray {
    public static void main(String[] args) {
        
        calc obj = new calc();
        int result = obj.add(new int[] { 5, 4, 2, 4 }); // anonymous array
        System.out.println(result);
        int a[]=new int[0];
        System.out.println(a.length);
        int arr[]=new int[5];
        System.out.println(arr);

    }
}
