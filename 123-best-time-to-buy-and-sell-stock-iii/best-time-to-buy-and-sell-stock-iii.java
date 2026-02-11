// class Solution {  //RECURSION: TC = O(N^2), SC = O(N)
//     public static int f(int i, int canBuy, int transactionLeft, int[] prices){
//         if(transactionLeft == 0 || i==prices.length) return 0;
//         if(canBuy == 1){
//             int buy = -prices[i] + f(i+1, 0, transactionLeft, prices);
//             int notBuy = 0 + f(i+1, 1, transactionLeft, prices);
//             return Math.max(buy, notBuy);
//         } else {
//             int sell = prices[i] + f(i+1, 1, transactionLeft-1, prices);
//             int notSell = 0 + f(i+1, 0, transactionLeft, prices);
//             return Math.max(sell, notSell);
//         }
//     }
//     public int maxProfit(int[] prices) {
//         return f(0, 1, 2, prices); //transactionLeft = 2, bcs you hv to complete atmost 2 transactions
//     }
// }     //OPTIMISED VERSION

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;

        int buy1 = Integer.MIN_VALUE; // constant that represents the smallest possible integer value
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for(int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        return sell2;
    }
}