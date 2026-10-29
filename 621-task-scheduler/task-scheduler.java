
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c-'A']++;
        }
        int maxFreq=0;
        for (int x : freq) {
            maxFreq = Math.max(maxFreq, x);
        }
        int countMax=0;
        for (int x:freq){
            if (x == maxFreq)countMax++;
        }
        int slots=(maxFreq-1)*(n + 1)+countMax;
        return Math.max(tasks.length,slots);
    }
}