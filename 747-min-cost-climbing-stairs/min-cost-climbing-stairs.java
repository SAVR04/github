class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,0),helper(cost,1));
        
        
    }
    public int helper(int[] cost,int i)
    {
        if(i>=cost.length)return 0;

        if(dp[i]!=-1)return dp[i];

        int take=cost[i]+helper(cost,i+1);
        int taketwo=cost[i]+helper(cost,i+2);

        return dp[i]=Math.min(take,taketwo);
    }
}