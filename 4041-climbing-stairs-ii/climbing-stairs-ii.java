// class Solution {
//     static int[] dp=new int[100010];
//     static{
//         Arrays.fill(dp,-1);
//     }
//     public int climbStairs(int n, int[] costs) {
//         if(n==0)return 0;
//         if(n<0)return Integer.MAX_VALUE-100;

//         if(dp[n]!=-1)return dp[n];

//         int first=climbStairs(n-1,costs)+1;
//         int second=climbStairs(n-2,costs)+4;
//         int third=climbStairs(n-3,costs)+9;


//         return dp[n]=Math.min(Math.min(first,second),third) + costs[n-1];
        
        

        
//     }
// }
class Solution {

    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n, costs, dp);
    }

    public int solve(int n, int[] costs, int[] dp) {

        if (n == 0) return 0;

        if (dp[n] != -1) return dp[n];

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        if (n >= 1)
            first = solve(n - 1, costs, dp) + 1;

        if (n >= 2)
            second = solve(n - 2, costs, dp) + 4;

        if (n >= 3)
            third = solve(n - 3, costs, dp) + 9;

        return dp[n] = Math.min(first, Math.min(second, third))
                        + costs[n - 1];
    }
}