class Solution {
    int index=0;

    public TreeNode helper(int depth,String str) {
        if(index>=str.length()) return null;
        int j=index;
        int dashes=0;
        while(j<str.length() && str.charAt(j)=='-') {
            dashes++;
            j++;
        }
        if(dashes!=depth) return null;
        index=j;
        int value=0;
        while(index<str.length() && Character.isDigit(str.charAt(index))) {
            value=value*10+(str.charAt(index)-'0');
            index++;
        }
        TreeNode temp=new TreeNode(value);
        temp.left=helper(depth+1,str);
        temp.right=helper(depth+1,str);
        return temp;
    }

    public TreeNode recoverFromPreorder(String traversal) {
        index=0;
        return helper(0,traversal);
    }
}