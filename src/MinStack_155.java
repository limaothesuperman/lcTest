import java.util.Stack;

public class MinStack_155 {

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    public static void main(String[] args) {
        MinStack_155 obj = new MinStack_155();
        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        obj.pop();
        System.out.println(obj.getMin());

    }

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack_155() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);

        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());

        minStack.push(val);

    }

    public void pop() {
        stack.pop();
        minStack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();

    }
}
