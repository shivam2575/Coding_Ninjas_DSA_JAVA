package Stack;

public class stack_use {
    public static void main(String[] args) throws stack_empty_exception {
        stack_ll<Integer> st = new stack_ll<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println("size is: "+st.size());
        System.out.println(st.pop());
        System.out.println("size after pop is: "+st.size());
        System.out.println(st.is_empty());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
