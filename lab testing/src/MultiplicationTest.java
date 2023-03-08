import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Ignore.*;
public class MultiplicationTest {
    public int multiply(int a, int b){
        return a * b;
    }
    @Ignore
    public void multTest1(){
        MultiplicationTest test = new MultiplicationTest();
        assertEquals("10 * 0 = 0", 0, test.multiply(10, 0));
    }
    @Test
    public void multTest2(){
        MultiplicationTest test = new MultiplicationTest();
        assertEquals("10 * 0 = 0", 0, test.multiply(10, 0));
    }
}