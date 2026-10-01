class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        int answer=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!mp.containsKey(nums[i]))
            {
                mp.put(nums[i],1);
                answer++;
            }
            else if(mp.get(nums[i])<2)
            {
                mp.put(nums[i],2);
                answer++;
             }
        }
        int j=0;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            for(int i=0;i<entry.getValue();i++)
            {
                nums[j]=entry.getKey();
                j++;
            }
        }
        return answer;
        
    }
}