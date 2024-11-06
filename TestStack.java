public class TestStack {

    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // Pushing numbers onto the first stack
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        // Pushing numbers onto the second stack
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        // Popping from first stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        // Popping from second stack
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}