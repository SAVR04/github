class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i<=k)
            {
                if(arr[i]>arr[k])
                {
                    count+=arr[k];
                }
            
                else
            {
                count+=arr[i];
            }
            }
            else
            {
                if(arr[i]>=arr[k]-1)
                {
                    count+=arr[k]-1;
                }
                else
            {
                count+=arr[i];
            }

            }
        }
        return count;   
            
        
    }
}