class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> a=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int b=a.pop()+a.pop();
                a.push(b);
            }
            else if(tokens[i].equals("-")){
                int b=a.pop();
                int c=a.pop();
                int d=c-b;
                a.push(d);
            }
            else if(tokens[i].equals("*")){
                int b=a.pop()*a.pop();
                a.push(b);
            }
            else if(tokens[i].equals("/")){
                int b=a.pop();
                int c=a.pop();
                int d=c/b;
                a.push(d);
            }
            else{
                int b=Integer.valueOf(tokens[i]);
                a.push(b);
            }
        }
        return a.pop();
        
    }
}
