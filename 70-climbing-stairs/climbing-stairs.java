class Solution {
    public static int[] dp=new int[46];
    static{
        Arrays.fill(dp,-1);
    }
    public int climbStairs(int n) {
        if(n==0)return 1;
        if(n==1)return 1;
        if(n<0)return 0;
        int first,second;
        if(dp[n-1]!=-1)first=dp[n-1];
        else first=climbStairs(n-1);
        if(dp[n-2]!=-1)second=dp[n-2];
        else second=climbStairs(n-2);
        
        return dp[n]=first+second;
     
    }
}