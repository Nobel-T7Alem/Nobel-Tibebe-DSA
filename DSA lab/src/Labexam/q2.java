package Labexam;
public class q2{
    private int maxSize;
    private int top = -1;
    int [] numArray;

    q2(int size){
        maxSize = size;
        numArray = new int[maxSize];
    }
    int size(){
        if (top >= 0){
            return(top+1);
        }
        else{
            return(-1);
        }

    }
    void pushInto (int num){
        if (top < maxSize-1){
            numArray[top + 1] = num;
            top++;
        }
        else
            System.err.println("Stack is full");
    }

    int popOut (){
        if (top >= 0){
            int temp = numArray[top--];
            return(temp);
        }
        else{
            return(-1);
        }
    }
    int peak(){
        if (top >= 0){
            return(numArray[top]);
        }else{
            return(-1);
        }
    }
    boolean isFull(){
        return(top == maxSize-1);
    }
    boolean isEmpty(){
        return(top == -1);
    }

    public static void main(String[] args) {
        q2 stack = new q2(5);
        stack.pushInto(1);
        stack.pushInto(2);
        stack.pushInto(3);
        stack.pushInto(4);
        stack.pushInto(5);
        for (int i = 0; i < stack.maxSize; i++){
            System.out.println(stack.peak());
            stack.popOut();
        }
        
    }
}