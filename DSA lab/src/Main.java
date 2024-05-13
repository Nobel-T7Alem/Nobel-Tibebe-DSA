public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Current top: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.push(4);
        System.out.println("Current top: " + stack.peek());
    }
}