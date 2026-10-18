class Solution {
    public List<List<Integer>> permuteUnique(int[]nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums); 
        boolean[]visited=new boolean[nums.length]; 
        backtrack(nums,new ArrayList<>(),visited,result);
        return result;
    }
    private void backtrack(int[]nums,List<Integer>subanswer,boolean[]visited,List<List<Integer>>result) {
        if(subanswer.size()==nums.length) {
            result.add(new ArrayList<>(subanswer));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(visited[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])continue;
            visited[i]=true;
            subanswer.add(nums[i]);
            backtrack(nums,subanswer,visited,result);
            visited[i]=false;
            subanswer.remove(subanswer.size()-1);
        }
    }
}

