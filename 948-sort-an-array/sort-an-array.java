class Solution {
   private void heapifydown(int[] nums,int index,int size) {
        while (index * 2 + 1 < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int largest = leftChild;

            if (rightChild<size && nums[rightChild] > nums[leftChild]) {
                largest = rightChild;
            }

            if (nums[index] < nums[largest]) {
                swap(nums,index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }
      
   private void swap(int[] nums,int i, int j) 
   {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

   public void pop(int[] nums,int size) { 
        swap(nums,0,size-1); 
        if (size>1) {
            heapifydown(nums,0,size-1); 
        }
    } 
    public int[] sortArray(int[] nums) {
        
        int parent=(nums.length/2)-1;
        for(int i=parent;i>=0;i--)
        {
            heapifydown(nums,i,nums.length);
        }

        int size=nums.length;
        
        while(size>0)
        {
            pop(nums,size);
            size--;
        }

        return nums;
        
        
    }
}