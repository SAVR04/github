class Solution {
    class TrieNode{
        HashMap<Character,TrieNode> mp;
        boolean isend;
        TrieNode(){
            mp=new HashMap<>();
            isend=false;
        }
    }

    class Trie{
        TrieNode root;
        Trie()
        {
            root=new TrieNode();
        }
        public void insert(String word)
        {
            TrieNode curr=root;
            for(char ch:word.toCharArray())
            {
                if(!curr.mp.containsKey(ch))curr.mp.put(ch,new TrieNode());
                curr=curr.mp.get(ch);
            }
            curr.isend=true;
        }

        public String  prefix(String word)
        {
            TrieNode curr=root;
            String prefix="";
             for(char ch:word.toCharArray())
            {
                if(!curr.mp.containsKey(ch))return word;
                curr=curr.mp.get(ch);
                prefix+=ch;

                if(curr.isend)
                {
                    return prefix;
                }
            }
            return word;

        }

    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = sentence.split("\\s+");
        Trie obj = new Trie();
        for (String s : dictionary) {
            obj.insert(s);
        }

        StringBuilder ans = new StringBuilder();
        for (String s : arr) {
            ans.append(obj.prefix(s)).append(" ");
        }
        return ans.toString().trim();
    }
}