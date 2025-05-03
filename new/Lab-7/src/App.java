
public class App {
    public static void main(String[] args) throws Exception {
        Queue q = new ArrayQueue(5);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        System.out.println(q.front());
        System.out.println(q.pop());
        System.out.println(q.front());
        System.out.println(q.size());

    }
}
