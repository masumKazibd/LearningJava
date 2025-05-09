public class App {
    public static void main(String[] args) throws Exception {
        StackADT myStack = new ArrayStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Popped: " + myStack.pop());   // 30
        System.out.println("Size: " + myStack.size());    // 2
    }
};

