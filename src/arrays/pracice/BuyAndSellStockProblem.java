package arrays.pracice;

public class BuyAndSellStockProblem {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buy = 0;
//        int diff = 0, max = 0, buypoint = 0, sellePoint = 0;
//        for (int sell = 1 ; sell < prices.length ; sell++) {
//            if(prices[sell] > prices[buy]) {
//                diff = prices[sell] - prices[buy];
//                if(diff >  max) {
//                    buypoint = buy;
//                    sellePoint = sell;
//                    max = diff;
//
//
//
//                }
//            }
//            else {
//                buy = sell;
//                //sell = buy + 1;
//
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(buypoint + "  " + sellePoint);
//        System.out.println("================");
        StocksProblem(prices);
    }


    public static void StocksProblem(int[] array) {
        int[] prices = {7,1,5,3,6,4};
        int buy = 0;
        int maxProfilt = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int sell = 1 ; sell < prices.length ; sell++) {
            if(prices[buy] < prices[sell]) {
                int diff = prices[sell] - prices[buy];
                if(maxProfilt < diff) {
                    maxProfilt = diff;
                    start = buy;
                    end = sell;
                }
            }
            else {
                buy = sell;
            }
        }
        System.out.println(maxProfilt);
        System.out.println(prices[start] + "  "+ prices[end]);
    }
}
