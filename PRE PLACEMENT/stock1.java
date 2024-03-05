class solution{
    public int profit(int prices [] )
    { 
        int profit=0;
        int minimum=prices[0];
        if(prices.length==0){
            return 0;
        }
        if(prices.length==1){
            return prices[0];
        }
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit, prices[i]-minimum);
            minimum=Math.min(minimum,prices[i] );
        }
        return profit;
    }
}

class stock1{
    public static void main(String[] args) {
        solution s = new solution();
      int profit=  s.profit(new int[]{7, 1, 5, 3, 6, 4});
System.out.println(profit);
    }
}