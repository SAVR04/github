class Solution {
    public int searchInsert(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target)
            {
                ans=mid;
                low=mid+1;
            }
            if(arr[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }

        }
        return low;
        
    }
}