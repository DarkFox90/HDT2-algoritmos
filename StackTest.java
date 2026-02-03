import org.junit.*;

public class StackTest {

    @Test
    public void testPushandPopandPeek(){
        Stack<Integer> stack = new VectorStack<>();
        stack.push(10);
        stack.push(20);
        Assert.assertEquals(Integer.valueOf(20), stack.peek());
        Assert.assertEquals(Integer.valueOf(20), stack.pop());
        Assert.assertEquals(Integer.valueOf(10), stack.peek());
        Assert.assertEquals(Integer.valueOf(10), stack.pop());  
    }

    @Test
    public void sumTest() {
        Stack<Integer> stack2 = new ArrayStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack2);
        int outcome = calc.operate("1 3 +");
        Assert.assertEquals(4, outcome);
    }

    @Test
    public void substractionTest() {
        Stack<Integer> stack2 = new ArrayStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack2);
        int outcome = calc.operate("6 2 -");
        Assert.assertEquals(4, outcome);
        
    }
    
    @Test
    public void multiplicationTest() {
        Stack<Integer> stack2 = new ArrayStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack2);
        int outcome = calc.operate("6 7 *");
        Assert.assertEquals(42, outcome);
        
    }

    @Test
    public void divisionTest() {
        Stack<Integer> stack2 = new ArrayStack<>();
        PostfixCalculator calc = new PostfixCalculator(stack2);
        int outcome = calc.operate("50 10 /");
        Assert.assertEquals(5, outcome);
        
    }
}
    

