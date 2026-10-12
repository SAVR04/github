class Trie {
    class TrieNode{
        HashMap<Character,TrieNode> mp;
        boolean isend;

        public TrieNode()
        {
            mp=new HashMap<>();
            isend=false;
        
        }

    }

    TrieNode root;
    public Trie() {
       root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char ch: word.toCharArray())
        {
            if(!curr.mp.containsKey(ch))
            {
                curr.mp.put(ch,new TrieNode());
            }
            curr=curr.mp.get(ch);
        }
        curr.isend=true;
       
        
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char ch: word.toCharArray())
        {
            if(!curr.mp.containsKey(ch))return false;
            curr=curr.mp.get(ch);
        }
        return curr.isend;
        
    }
    
    public boolean startsWith(String word) {
       TrieNode curr=root;
        for(char ch: word.toCharArray())
        {
            if(!curr.mp.containsKey(ch))return false;
            curr=curr.mp.get(ch);
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */