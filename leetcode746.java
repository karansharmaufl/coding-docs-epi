class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i=2; i<= cost.length ;i++){
            int currCost = 0;
            if(i==cost.length)
                currCost = 0;
            else
                currCost = cost[i];
            dp[i] = Math.min(dp[i-1]+currCost, dp[i-2]+currCost);
        }
        
        return dp[cost.length];
    }
}
