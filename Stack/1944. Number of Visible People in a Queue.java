class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];
        result[n - 1] = 0;
        st.push(heights[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            int sum = 0;
            while (st.size() > 0 && heights[i] > st.peek()) {
                sum++;
                st.pop();
            }
            if (st.size() > 0) sum++;
            st.push(heights[i]);
            result[i] = sum;
        }

        return result;
    }
}