public class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        stack = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stack.length - 1) {
            resize();
        }
        stack[++top] = item;
    }

    @Override
    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    @Override
    public int size() {
        return top + 1;
    }

    private void resize() {
        int newCapacity = stack.length * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
