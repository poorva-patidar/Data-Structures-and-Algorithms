import java.util.*;

public class JCFExamples {

    public static void main(String[] args) {

        // LinkedList using JCF
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);  // Adds the element at the end of the linked list.
        ll.add(2);
        ll.add(3);
        System.out.println("" + ll);

        // Stack using JCF
        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println("" + st);
        st.add(2, 7);
        System.out.println("" + st);

        // Queue using JCF
        Queue<Integer> q = new LinkedList<>(st);

        System.out.println("" + q);
    }

}