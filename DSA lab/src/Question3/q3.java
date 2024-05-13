package Question3;

public class q3 {
    private int[] elements;
    private int top;
    private int capacity;

    // Constructor
    public q3(int size) {
        elements = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        elements[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return elements[top];
        } else {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }
}

public class Question4 {
    private q3 s1;
    private q3 s2;

    public Question4(int capacity) {
        s1 = new q3(capacity);
        s2 = new q3(capacity);
    }


    public void enqueue(int item) {
        s1.push(item);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return -1; // This line will never execute
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front item: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
