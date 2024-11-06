public class Stack {

    int stck[] = new int[10];
    int tos;

    // Constructor to initialize the stack
    Stack() {
        tos = -1;
    }

    // Push method to add an element to the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    // Pop method to remove and return the top element of the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stck[tos--];
        }
    }
}