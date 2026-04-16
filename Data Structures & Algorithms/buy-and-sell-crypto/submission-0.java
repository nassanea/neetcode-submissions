class Solution {
    public int maxProfit(int[] prices) {
        // 每日價格變化
        
        // 如果陣列為嚴格遞減，那不交易，profit =0
        // 找到一個區間他是左邊做小值右邊最大值，然後右邊-左邊

        int left=0; // 代表「目前看過最小值」
        int right=left; // 初始值設定為買入當天就賣出
            // 右邊邊界會不斷向外擴展
        int profit = 0;
        while(right < prices.length){
            if(prices[right] < prices[left]){ // 找到更低的買入價格
                left = right;
            }else{ //prices[right] >= prices[left]
                if(profit < prices[right]-prices[left]){
                    profit = prices[right]-prices[left];
                }
            }
            right++;
        }
        return profit;
        
    }
}
