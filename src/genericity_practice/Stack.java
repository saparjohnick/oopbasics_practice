package genericity_practice;

public class Stack<E> {
    private E item;
    private class StackNode {
        Object data;
        StackNode next;
        // rest of the class not shown
    }

    public void push(E item) {
        // implementation not shown
    }

    public E pop() {
        return item;
    }

    public static void main (String[] args) {
        Stack<Integer>myIntStack = new Stack<Integer>();
//        myIntStack.push("A string"); wrong because it's String
        myIntStack.push(7); // Fine
    }
}


