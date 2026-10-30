class Solution {
    public int rob(int[] nums) {
        int r1 = 0, r2 = 0;
        for (int n : nums) {
            int tmp = Math.max(n + r1, r2);
            r1 = r2;
            r2 = tmp;
        }
        return r2;
    }
}
