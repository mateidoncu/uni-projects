import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class doubleDegTest {
    public int[] doubleDegree(int a, int b, int c){
        int[] sols = new int[2];
        double x1 = ((-b + Math.sqrt(b*b - 4 * a * c))/(2*a));
        double x2 = ((-b - Math.sqrt(b*b - 4 * a * c))/(2*a));
        if((x1 == Math.floor(x1)) && !Double.isInfinite(x1)){
            sols[0] = (int) x1;
        }
        else
            x1 = 0;
        if((x2 == Math.floor(x2)) && !Double.isInfinite(x2)){
            sols[1] = (int) x2;
        }
        else
            x2 = 0;
        return sols;
    }
    @Test
    public void test(){
        doubleDegTest dg = new doubleDegTest();
        assertEquals("x^2-4", 2, dg.doubleDegree(1, 0, -4)[0]);
        assertEquals("x^2-4", -2, dg.doubleDegree(1, 0, -4)[1]);
        assertEquals("x^2+6x+9", -3, dg.doubleDegree(1, 6, 9)[0]);
        assertEquals("x^2+6x+9", -3, dg.doubleDegree(1, 6, 9)[1]);
        assertEquals("2x^2+7x+3", 0, dg.doubleDegree(2, 7, 3)[0]);
        assertEquals("2x^2+7x+3", -3, dg.doubleDegree(2, 7, 3)[1]);
    }
}