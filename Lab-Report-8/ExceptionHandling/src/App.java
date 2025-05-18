import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr={10,20,30,40,50};
//first solution
        try{
            int output = a/b;
            System.out.println("The result is: " + output);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }finally{
            System.out.println("Operation complete");
        }
//2nd solution
        try{
            System.out.println("Enter index number to show the  value(0-4): ");
            int index = scanner.nextInt();
            System.out.println("Array value: " + arr[index]);

            String str = null;
            System.out.println(str.length());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter within 0 to 4");
        }catch(NullPointerException e){
            System.out.println("Index can't be null value");
        }
//3rd solution
        StackADT stack = new ArrayStack();
        try{
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);
        }catch(StackOverflowException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
        }catch(StackUnderflowException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
