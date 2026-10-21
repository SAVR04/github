class Trie{
    class TrieNode{
        HashMap<Character,TrieNode> mp;
        boolean isend;
        int prefixcount;
        TrieNode()
        {
            mp=new HashMap<>();
            isend=false;
            prefixcount=0;
        }
    }
    TrieNode root;
    Trie()
    {
        root=new TrieNode();
    }
    public void insert(String s)
    {
        TrieNode curr=root;
        for(char ch:s.toCharArray())
        {
            if(!curr.mp.containsKey(ch))curr.mp.put(ch,new TrieNode());
            curr=curr.mp.get(ch);
            curr.prefixcount++;
        }
        curr.isend=true;
    }

    public String prefix(String s,int n)
    {
        TrieNode curr=root;
        StringBuilder sb=new StringBuilder();
        for (char ch : s.toCharArray()) {
        if (curr.mp.containsKey(ch)) {
            TrieNode nextNode = curr.mp.get(ch);
            if (nextNode.prefixcount == n) {
                sb.append(ch);  
                curr = nextNode;
                continue;        
            }
        }
        break; 
    }
    return sb.toString();
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie obj=new Trie();
        for(String s:strs)
        {
            obj.insert(s);
        }
        return obj.prefix(strs[0],strs.length);



        
    }
}