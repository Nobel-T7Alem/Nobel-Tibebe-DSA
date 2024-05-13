package Question2;

public class q2 {
    private int[] stackArray;
    private int top;
    private int capacity;

    public q2(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(1);
        }
        System.out.println("Pushing " + element);
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        System.out.println("Popping " + stackArray[top]);
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    public int size() {
        return top + 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.exit(1);
        }
        return -1;
    }
}

