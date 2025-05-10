public class ArrayQueue implements Queue {
    private int arr[];
    private int front;
    private int back;

    public ArrayQueue(int sz) {
        arr = new int[sz];
        front = 0;
        back = 0;
    }

    @Override
    public void push(int num) {
        arr[back] = num;
        back++;
    }

    @Override
    public int front() {
        return arr[front];
    }

    @Override
    public int pop() {
        int num = arr[front];
        front++;

        return num;
    }

    @Override
    public int size() {
        return back - front;
    }

    @Override
    public boolean isEmpty() {
        return front == back;
    }

}