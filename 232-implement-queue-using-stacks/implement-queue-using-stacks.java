class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
            s1.push(x);
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.peek());
                s2.pop();
            }
        }
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        int n = s1.peek();
        s1.pop();
        return n;
    }
    
    public int peek() {
        if(s1.isEmpty()){
            return -1;
        }
        return s1.peek();
    }

    
    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */