class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast:asteroids){
            boolean alive = true;
            while(!st.isEmpty()&&st.peek()>0&&ast<0){
                int curr = st.peek();
                if(curr<-ast){
                    st.pop();

                }else if(curr==-ast){
                    st.pop();
                    alive=false;
                    break;
                }else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}