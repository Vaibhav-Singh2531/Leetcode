class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();

        for ( int i = 0 ; i < s.length() ; i++ ) {
            if (stack.size() == 0) {
                stack.push(s.charAt(i));
                continue;
            } 

            if (s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        StringBuilder sb = new StringBuilder();

        while ( stack.size() > 0 ) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();

    }
}