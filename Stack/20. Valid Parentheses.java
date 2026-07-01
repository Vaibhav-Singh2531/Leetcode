class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();

        for (int i = 0 ; i < s.length() ; i++) {
            char a = s.charAt(i);
            if (a == ')') {
                if ( !temp.isEmpty() && temp.peek() == '(') {
                    temp.pop();
                } else {
                    return false;
                }
            }
            if (a == '}') {
                if ( !temp.isEmpty() && temp.peek() == '{') {
                    temp.pop();
                } else {
                    return false;
                }
            }
            if (a == ']') {
                if ( !temp.isEmpty() && temp.peek() == '[') {
                    temp.pop();
                } else {
                    return false;
                }
            }
            if (a == '(' || a == '{' || a == '[') {
                temp.push(a);
            }

        }

        if (temp.isEmpty()) {
            return true;
        } else {return false;}
    }
}