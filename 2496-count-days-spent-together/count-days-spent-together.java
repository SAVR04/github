class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startAlice = toDays(arriveAlice, months), endAlice = toDays(leaveAlice, months);
        int startBob = toDays(arriveBob, months), endBob = toDays(leaveBob, months);
        return Math.max(0, Math.min(endAlice, endBob) - Math.max(startAlice, startBob) + 1);
    }
    
    private int toDays(String s, int[] months) {
        int m = Integer.parseInt(s.substring(0, 2)), d = Integer.parseInt(s.substring(3, 5));
        for (int i = 0; i < m - 1; i++) d += months[i];
        return d;
    }
}
