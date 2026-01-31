import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void testPushAndPop(){
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(Integer.valueOf(20), stack.pop());
        assertEquals(Integer.valueOf(10), stack.pop());  
    };
}
    

