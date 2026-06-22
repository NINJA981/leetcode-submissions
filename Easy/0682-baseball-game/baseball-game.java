class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int popped = 0;
        int peeked= 0;
        for (String op : operations){
            
            if (op.equals("C")){
                stack.pop();
            }
            else if (op.equals("D")){
                stack.push(stack.peek() * 2);
            }
            else if (op.equals("+")){
                popped = stack.pop();
                peeked= stack.peek();
                stack.push(popped);
                stack.push(peeked+popped);
                
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int a:stack){
            sum +=a;
        }
        return sum;
    }
}