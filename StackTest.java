import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void testPushandPopandPeek(){
        Stack<Integer> stack = new VectorStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(Integer.valueOf(20), stack.peek());
        assertEquals(Integer.valueOf(20), stack.pop());
        assertEquals(Integer.valueOf(10), stack.peek());
        assertEquals(Integer.valueOf(10), stack.pop());  
    };
}
    

