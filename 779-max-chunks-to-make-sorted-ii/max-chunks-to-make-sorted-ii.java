class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty())st.push(arr[i]);
            else{
                if(arr[i]>=st.peek())
                {
                    max=arr[i];
                    st.push(arr[i]);
                }
                else
                {
                    while(!st.isEmpty() && arr[i]<st.peek())
                    {
                        st.pop();
                    }
                    st.push(max);
                }
            }
        }
        return st.size();
    }
       
}