public class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 5;

    public ArrayStack() {
        stack = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stack.length - 1) {
            throw new StackOverflowException("Stack overflow!! can't push!!");
        }
        stack[++top] = item;
    }

    @Override
    public int pop() {
        if (top == -1) {
            throw new StackUnderflowException("Stack underflow!! Stack is empty");
        }
        return stack[top--];
    }

    @Override
    public int size() {
        return top + 1;
    }
}
    