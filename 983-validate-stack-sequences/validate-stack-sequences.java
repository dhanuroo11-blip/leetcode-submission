class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int ind=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty()&&ind<popped.length&&stack.peek()==popped[ind]){
                stack.pop();
                ind++;
            }
        }
        return stack.isEmpty();
    }
}