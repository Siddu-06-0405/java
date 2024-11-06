class SquareRootThread extends Thread {
    private int number;
    public SquareRootThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square root of " + number + " is: " + Math.sqrt(number));
    }
}