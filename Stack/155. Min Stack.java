class Pair {
    int val = -1;
    int min = -1;

    public Pair(int cur, int prev) {
        val = cur;
        min = prev;
    }
}



class MinStack {
    Stack<Pair> s = new Stack<>();

    public MinStack() {
        // return s;
    }
    
    public void push(int value) {
        if (s.size() == 0) {
            s.push(new Pair(value, value));
        } else {

        Pair tmp = s.peek();
        int min = value < tmp.min ? value : tmp.min;

        Pair p = new Pair(value, min);
        s.push(p);

        }

    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
       Pair p = s.peek();
       return p.val;
    }
    
    public int getMin() {
       Pair p = s.peek();
       return p.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */