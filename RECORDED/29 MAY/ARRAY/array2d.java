public class array2d {
    public static void main(String[] args) {
      int arr[][]=new int[3][2];
      arr[0][0]=1;
      arr[0][1]=2;
      arr[1][0]=3;
      arr[1][1]=4;
      arr[2][0]=5;
      arr[2][1]=6;

for(int i=0;i<=2;i++){
    for(int j=0;j<=1;j++){
        System.out.print(arr[i][j]+" ");

}  
System.out.println();

}System.out.println();
int arr2[][]={{2,3},{4,5,6},{6,7},{8,9}};
for(int i=0;i<=3;i++){
    for(int j=0;j<arr2[i].length;j++){
        System.out.print(arr2[i][j]+" ");

}System.out.println();

    }
    // how to do it in the other syntax #jagged array dont declare column size
    int arr3[][]=new int[3][]; //jagged array
    arr3[0]=new int[3];
    arr3[1]=new int[2];
    arr3[2]=new int[4];

}
}