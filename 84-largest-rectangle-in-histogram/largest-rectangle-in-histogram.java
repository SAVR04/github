class Solution
 {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        List<Integer> answer=new ArrayList<>();
        int[] next=new int[n];

        for(int i=0;i<arr.length;i++)//find prev smaller element;
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                answer.add(-1);
                st.push(i);
            }
            if(arr[i]>arr[st.peek()])
            {
                answer.add(st.peek());
                st.push(i);
            }
        }
        st.clear();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                next[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

     
        while (!st.isEmpty()) {
            next[st.peek()] = -1;
            st.pop();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int right;
            if (next[i] == -1) {
                right = n;
            } else {
                right = next[i];
            }
            int width = right - answer.get(i) - 1;
            int area = width * arr[i];
            max = Math.max(max, area);
        }

        return max;
    }
}
