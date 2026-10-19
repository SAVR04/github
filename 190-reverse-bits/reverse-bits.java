class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder();
        int ans=0;
        while(n>0)
        {
            sb.append(n%2);
            n/=2;
        }
        while(sb.length()<32)
        {
            sb.append(0);
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
        if(sb.charAt(i)=='1') ans|=(1<<i);
        }
        return ans;
        
    }
}