class solution {
    public int maxprofit(int prices[]) {
int minimumvalue=Integer.MAX_VALUE;
int profit=0;
for(int i=0;i<prices.length;i++){
   if(minimumvalue>prices[i])
{
    minimumvalue=prices[i];
}
else if(prices[i]-minimumvalue>profit){
    profit=prices[i]-minimumvalue;
}
}return profit;
    }
}

public class stockleetcode {
    public static void main(String[] args) {
        // int prices[] = { 7, 5, 4, 3, 1, 6 };
        solution s = new solution();
        System.out.println(s.maxprofit(new int[]{7,1,6,5,3,4}));
    }
}
