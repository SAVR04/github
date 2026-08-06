class Solution {

    void backtrack(int[] nums,List<List<Integer>> answer,List<Integer> temp,int start) {
    // if(index == nums.length) {
    //     answer.add(new ArrayList<>(temp));
    //     return;
    // }

    // // Include
    // temp.add(nums[index]);
    // backtrack(index + 1,nums,answer,temp);

    // // Undo
    // temp.remove(temp.size() - 1);

    // // Exclude
    // backtrack(index + 1,nums,answer,temp);
    // }
    answer.add(new ArrayList<>(temp));
     for(int i=start;i<nums.length;i++)
    {
        temp.add(nums[i]);
        backtrack(nums,answer,temp,i+1);
        temp.remove(temp.size()-1);
    }
    }


   
         
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();

        List<Integer> temp =new ArrayList<>();

        

        backtrack(nums,answer,temp,0);
        return answer;

        
    }
}
