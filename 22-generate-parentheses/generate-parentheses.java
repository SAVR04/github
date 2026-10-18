class Solution {
    public boolean isvalid(String s)
    {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')st.push('(');
            else
            {
                if(st.isEmpty())return false;
                st.pop();
            }
                
        }
        return st.isEmpty();
    }
    public void helper(StringBuilder s,int n,List<String> answer)
    {
        if(n==0)
        {
            if(isvalid(s.toString()))answer.add(s.toString());
            return;
        }
        s.append('(');
        helper(s,n-1,answer);
        s.deleteCharAt(s.length()-1);
        s.append(')');
        helper(s,n-1,answer);
        s.deleteCharAt(s.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> answer=new ArrayList<>();
        helper(new StringBuilder(),n*2,answer);
        return answer;
        
    }
}