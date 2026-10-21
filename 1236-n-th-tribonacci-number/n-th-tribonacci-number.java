class Solution {
    public static int[] dp=new int[38];
    static{
        Arrays.fill(dp,-1);
    }
    public int tribonacci(int n) {
        if(n<2)return n;
        if(n==2)return 1;

        int first,second,third;
        if(dp[n-1]!=-1)first=dp[n-1];
        else first=tribonacci(n-1);

        if(dp[n-2]!=-1)second=dp[n-2];
        else second=tribonacci(n-2);

        if(dp[n-3]!=-1)third=dp[n-3];
        else third=tribonacci(n-3);

        return dp[n]=first+second+third;
        

        
    }
}