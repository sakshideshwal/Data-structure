import java.util.Stack;
/*
stack[10]

top=-1

*/
class Stack_1{

    public static void main(String[] args) {
        Stack<Integer> st=new Stack(); 
        st.push(2);
        st.push(3);
        st.pop();
        st.push(55);
        System.out.println(st);
        System.out.println(st.peek());
    }
}