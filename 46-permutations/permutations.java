class Solution {
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    public void backtrack(int index,int[] nums,List<List<Integer>> answer)
    {
       
        if(index==nums.length-1)
        {
             List<Integer> temp=new ArrayList<>();
            for(int x:nums){
                
                temp.add(x);
                }
            answer.add(temp);

        return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            backtrack(index+1,nums,answer);
            swap(nums,i,index);
            
        }



    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();

        backtrack(0,nums,answer);

        return answer;


        
    }
}