class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root == null) return answer;
        StringBuilder subanswer = new StringBuilder(); 
        backtrack(root, answer, subanswer);
        return answer;
    }

    private void backtrack(TreeNode root, List<String> answer, StringBuilder subanswer) {
        if (root == null) return;
        int len = subanswer.length();
        subanswer.append(root.val);
        if (root.left == null && root.right == null) {
            answer.add(subanswer.toString());
        } else {
            subanswer.append("->");
            backtrack(root.left, answer, subanswer);
            backtrack(root.right, answer, subanswer);
        }
        subanswer.setLength(len);
    }
}
