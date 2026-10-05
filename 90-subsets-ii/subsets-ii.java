class Solution {
    public void backtrack(int[] nums,List<List<Integer>> answer,List<Integer> temp,int start)
    {
        // if(index==nums.length)
        // {
        //     if(answer.contains(temp))return;
        //     answer.add(new ArrayList<>(temp));
        //     return;
        // }
    //    //choosing
    //    temp.add(nums[index]);
    //    backtrack(nums,answer,temp,index+1);

    //    //removing
    //    temp.remove(temp.size()-1);

    //    //not choosing
    //    backtrack(nums,answer,temp,index+1);


    answer.add(new ArrayList<>(temp));
    for(int i=start;i<nums.length;i++)
    {
        if(i>start && nums[i]==nums[i-1])continue;
        temp.add(nums[i]);
        backtrack(nums,answer,temp,i+1);
        temp.remove(temp.size()-1);
    }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,answer,temp,0);
        return answer;

        
    }
}