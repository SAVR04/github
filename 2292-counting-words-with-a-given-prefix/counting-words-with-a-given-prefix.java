class TrieNode
{
    HashMap<Character,TrieNode> mp;
    boolean isEnd;
    int prefix;

    TrieNode()
    {
        mp=new HashMap<>();
        isEnd=false;
        prefix=0;
    }
}

class Trie
{
    TrieNode root;
    Trie(){
        root=new TrieNode();
    }

    public void insert(String word)
    {
        TrieNode curr=root;
        for(char ch:word.toCharArray())
        {
            if(!curr.mp.containsKey(ch))
            {
                curr.mp.put(ch,new TrieNode());
                // curr.prefix++;
            }
            curr=curr.mp.get(ch);
            curr.prefix++;
        }
        curr.isEnd=true;
        
    }

    
    public int search(String word) {
        TrieNode curr=root;
        for(char ch: word.toCharArray())
        {
            if(!curr.mp.containsKey(ch))return 0;
            curr=curr.mp.get(ch);
        }
        return curr.prefix;
    }

    
        
    
}



class Solution {

    public int prefixCount(String[] words, String pref) {
        if(pref.length()==0)return 0;
        Trie obj=new Trie();
        for(String s:words)
        {
            obj.insert(s);
        }
        return obj.search(pref);
        
    }
}