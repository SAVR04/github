class Solution {
    public int sumDecoded(long[] nums) {
        long sum=0;
        long MOD = 1_000_000_007L; 
        for(int i=0;i<nums.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(nums[i]);

            int width = Character.digit(sb.charAt(sb.length() - 1), 10);
            sb.deleteCharAt(sb.length() - 1);

            int x = Integer.parseInt(sb.substring(0, width));
            int y=Integer.parseInt(sb.substring(width));

            sum = (sum + power(x, y, MOD)) % MOD;
        }
        return (int) sum;
        
        
    }
    private long power(long base, long exp, long mod) {
    long res = 1;
    base = base % mod;
    while (exp > 0) {
        if (exp % 2 == 1) {
            res = (res * base) % mod;
        }
        base = (base * base) % mod;
        exp /= 2;
    }
    return res;
}
}