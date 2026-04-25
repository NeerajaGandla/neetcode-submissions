class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = 0
        var sell = 1
        var maxProfit = 0
        while(sell < prices.size) {
            if(prices[buy] < prices[sell]) {
                val profit = prices[sell] - prices[buy]
                maxProfit = maxOf(maxProfit, profit)
            } else {
                buy = sell
            }
            sell++
        }
        return maxProfit
    }
}
