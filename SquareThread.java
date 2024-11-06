class SquareThread extends Thread {
    private int number;
    public SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}