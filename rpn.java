class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                int b = st.pop();
                int a = st.pop();
                switch(tokens[i].charAt(0)){
                    case '+':
                        int resplus = a+b;
                        st.push(resplus);
                        break;
                    
                    case '-':
                        int resdiff = a-b;
                        st.push(resdiff);
                        break;
                        
                    case '/':
                        int resdiv = a/b;
                        st.push(resdiv);
                        break;
                        
                    case '*':
                        int resmul = a*b;
                        st.push(resmul);
                        break;
                        
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }return st.pop();
    }
}
