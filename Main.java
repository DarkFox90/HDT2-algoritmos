public class Main {
    public static void main(String[] args) {
        VectorStack<Integer> stack = new VectorStack<>();
        //ArrayStack<Integer> stack = new ArrayStack<>();
        PostfixCalculator calculator = new PostfixCalculator(stack);

        Controller controller = new Controller(calculator);

        controller.ReadFile();
    }

}
