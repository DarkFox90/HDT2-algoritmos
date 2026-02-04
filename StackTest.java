import org.junit.*;

public class StackTest {

    @Test
    public void testPushandPopandPeek(){
        Stack<Integer> stack = new StackO<>();
        stack.push(10);
        stack.push(20);
        Assert.assertEquals(Integer.valueOf(20), stack.peek());
        Assert.assertEquals(Integer.valueOf(20), stack.pop());
        Assert.assertEquals(Integer.valueOf(10), stack.peek());
        Assert.assertEquals(Integer.valueOf(10), stack.pop());  
    }

    @Test
    public void sumTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("1 3 +");
        Assert.assertEquals(4, outcome, 0.0001);
    }

    @Test
    public void substractionTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("6 2 -");
        Assert.assertEquals(4, outcome, 0.0001);
        
    }
    
    @Test
    public void multiplicationTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("6 7 *");
        Assert.assertEquals(42, outcome, 0.0001);
        
    }

    @Test
    public void divisionTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("50 10 /");
        Assert.assertEquals(5, outcome, 0.0001);
        
    }

    @Test
    public void incorrectOperatorTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("1 3 x");
        Assert.assertEquals(4, outcome, 0.0001);
    }

    @Test
    public void excesiveOperatorsTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("1 3 + -");
        Assert.assertEquals(4, outcome, 0.0001);
        
    }

    @Test
    public void divisionByZeroTest() {
        Stack<Double> stack2 = new StackA<>();
        Calculator calc = new Calculator(stack2);
        double outcome = calc.operate("1 0 /");
        Assert.assertEquals(0, outcome, 0.0001);
        
    }
}
    

