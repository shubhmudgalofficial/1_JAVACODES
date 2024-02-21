public class enhancedforloop {
public static void main(String[] args) {
    int nums[]={5,4,7,8};
for(int n:nums){
    System.out.println(n);
}
// for 2d array
int nums2[][]={{5,2},{3,6},{2,7}};
for(int a[]:nums2){
    for(int b:a){
        System.out.print(b+" ");
    }System.out.println();
}
}    
}
