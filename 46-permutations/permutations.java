class Solution {

    public void backtrack(int index,int[] nums,List<Integer> temp,List<List<Integer>> answer)
    {
        if(temp.size()==nums.length)
        {
            answer.add(new ArrayList<>(temp));

        return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!temp.contains(nums[i]))
            {
            temp.add(nums[i]);
            backtrack(i+1,nums,temp,answer);
            temp.remove(temp.size()-1);
            }
        }



    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        backtrack(0,nums,temp,answer);

        return answer;


        
    }
}