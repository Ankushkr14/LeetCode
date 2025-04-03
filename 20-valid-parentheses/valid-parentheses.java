class Solution {
    public boolean isValid(String s) {
        if(s.length() %2 ==1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(st.peek() == '(' && ch ==')'){
                st.pop();
            }else if(st.peek() == '{' && ch == '}'){
                st.pop();
            }else if(st.peek() =='[' && ch == ']'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        if(st.size() >0){
            return false;
        }
        return true;
    }

}