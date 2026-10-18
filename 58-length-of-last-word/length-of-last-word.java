class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split("\\s+");
        System.out.println(arr[arr.length-1]);
        return arr[arr.length-1].length();
        
    }
}