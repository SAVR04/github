class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z' || (ch>='0' && ch<='9'))sb.append(ch);
        }
        String original=sb.toString();
        String reversed=sb.reverse().toString(); 
        return original.equals(reversed); 
        
    }
}