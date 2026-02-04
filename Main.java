public class Main {
    public static void main(String[] args) {
        StackO<Double> stack = new StackO<>();
        //ArrayStack<Integer> stack = new ArrayStack<>();
        Calculator calculator = new Calculator(stack);

        Controller controller = new Controller(calculator);

        controller.ReadFile();
    }

}