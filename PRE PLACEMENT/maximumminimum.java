public class maximumminimum {
    public static void main(String[] args) {
        int a[]={1,2,7,4,5,67};
        int max = Integer.MIN_VALUE; // Declare max variable
        int min = Integer.MAX_VALUE; // Declare max variable
        for(int i=0;i<a.length;i++){
            max = Math.max(max, a[i]); // Update max value
        }
        for(int i=0;i<a.length;i++){
            min = Math.min(min, a[i]); // Update max value
        }
        System.out.println(min);
        System.out.println(max);
    }
}
