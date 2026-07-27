class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for (int j = 1; j < asteroids.length ; j++) {
            stack.push(asteroids[j]);
            while (stack.size() > 1) {
                 int i = stack.pop();
                 int last = stack.pop();
                 if (last > 0 && i < 0) {
                    if (Math.abs(i) > Math.abs(last)) stack.push(i);
                    else if (Math.abs(i) < Math.abs(last)) stack.push(last);
                 
                 } else {
                    stack.push(last);
                    stack.push(i);
                    break;
                 }

                
            }

        }
        int [] arr = new int[stack.size()];
        for ( int i = stack.size() -1 ; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}