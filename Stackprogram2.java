import java.util.Scanner;

public class Stackprogram2{
	private int top;
	private int[] stackArray;
	private static final int MAX_SIZE=5;
	
	public Stackprogram2() {
		top=-1;
		stackArray = new int[MAX_SIZE];
	}
	
	public void push(int value) {
		if(top<MAX_SIZE-1) {
			stackArray[++top]=value;
			System.out.println("Pushed "+value);
		}else {
			System.out.println("Stack Overflow. Cannot Push "+value+".");
		}
	}
	
	public int pop() {
		if(top>=0) {
			int poppedValue = stackArray[top--];
			System.out.println("Popped "+poppedValue);
			return poppedValue;
		}else {
			System.out.println("Stack is empty. ERR: Stack_underflow");
			return -1;
		}
	}
	
	public void display() {
		if(top>=0) {
			System.out.println("Stack contents: ");
			for(int i=0;i<=top;i++) {
				System.out.println(stackArray[i]+"");
			}
		}else {
			System.out.println("Stack is empty");
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==MAX_SIZE-1;
	}
	
	public static void main(String args[]) {
		Stackprogram2 stack = new Stackprogram2();
		Scanner scanner = new Scanner(System.in);
	    int choice;
        do { 
            System.out.println("\nStack Menu:"); 
            System.out.println("1. Push"); 
            System.out.println("2. Pop"); 
            System.out.println("3. Display Stack Contents"); 
            System.out.println("4. Check if the stack is empty"); 
            System.out.println("5. Check if the stack is full"); 
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter the value to push: "); 
                    int valueToPush = scanner.nextInt(); 
                    stack.push(valueToPush); 
                    break; 
                case 2: 
                    stack.pop(); 
                    break; 
           
                case 3: 
                    stack.display(); 
                    break; 
                case 4: 
                    System.out.println("Is the stack empty? " + stack.isEmpty()); 
                    break; 
                case 5: 
                    System.out.println("Is the stack full? " + stack.isFull()); 
                    break; 
                case 0: 
                    System.out.println("Exiting the program. Goodbye!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            }
        }while(choice!=0);
        
        scanner.close();
	
}
}