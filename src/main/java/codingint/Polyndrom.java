package codingint;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by borisgurtovyy on 11/2/17.
 */
public class Polyndrom {

    // 1234321

    public boolean isPoly(int x) {

        int xOld = x;
        int res = 0;

        while(x > 0) {
            int remainder = x % 10;
            res = res * 10 + remainder;
            x /= 10;
        }
        return xOld == res;
    }

    @Test
    public void testPoly() {
        int x  = 1234321;
        System.out.println(isPoly(x));
    }
}
