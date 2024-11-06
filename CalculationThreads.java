public class CalculationThreads {
    public static void main(String[] args) {
        int number = 4;

        SquareThread squareThread = new SquareThread(number);
        CubeThread cubeThread = new CubeThread(number);
        SquareRootThread squareRootThread = new SquareRootThread(number);

        squareThread.start();
        cubeThread.start();
        squareRootThread.start();
    }
}