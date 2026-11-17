class Solution {
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp=new int[days.length+1];
        Arrays.fill(dp,-1);
        return helper(days,0,costs);
        
    }
    public int helper(int[] days,int id,int[] costs)
    {
        if(id>=days.length)return 0;
        if(dp[id]!=-1)return dp[id];

        int a =helper(days,id+1,costs)+costs[0];
        int i=id;
        while(i<days.length && days[i]<=days[id]+6)i++;
        int b=helper(days,i,costs)+costs[1];
        i=id;
        while(i<days.length && days[i]<=days[id]+29)i++;
        int c=helper(days,i,costs)+costs[2];

        return dp[id]=Math.min(a,(Math.min(b,c)));


        
    }
}