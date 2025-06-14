class MyQueue {
    Stack<Integer> si ;
    Stack<Integer> so;

    public MyQueue() {
        si= new Stack<>();
        so= new Stack<>();
        
    }
    
    public void push(int x) {
        si.push(x);
        
    }
    
    public int pop() {
        if(so.isEmpty()){
            while(!si.isEmpty()){
                so.push(si.pop());
            }
        }
        return so.pop();
        
    }
    
    public int peek() {if(so.isEmpty()){
            while(!si.isEmpty()){
                so.push(si.pop());
            }
        }
        return so.peek();
        
    }
    
    public boolean empty() {
        return si.isEmpty()&&so.isEmpty();
        
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