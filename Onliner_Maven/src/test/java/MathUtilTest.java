import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathUtilTest {

    MathUtil mathUtil = new MathUtil();

    @Test
    public void testPlus() {
        int a = 5;
        int b = 5;

        int result = mathUtil.plus(a, b);

        assertEquals(result, 10);

    }

    @Test
    public void testPlus2() {
        int a = 2;
        int b = 3;

        int result = mathUtil.plus(a, b);

        assertEquals(result, 5);

    }

    @Test
    public void testPlus3() {
        int a = 3;
        int b = 3;

        int result = mathUtil.plus(a, b);

        assertEquals(result, 6);
    }

    @Test
    public void testPlusZero() {
        int a = 0;
        int b = 5;

        int result = mathUtil.plus(a, b);

        assertEquals(result, 5);
    }

    @Test
    public void testPlusNegative() {
        int a = 3;
        int b = -3;

        int result = mathUtil.plus(a, b);

        assertEquals(result, 0);
    }

    @Test
    public void testMul() {
        int a = 10;
        int b = 5;

        int result = mathUtil.mul(a, b);

        assertEquals(result, 50);

    }

    @Test
    public void testMul2() {
        int a = 3;
        int b = 7;

        int result = mathUtil.mul(a, b);

        assertEquals(result, 21);

    }

    @Test
    public void testMul3() {
        int a = 2;
        int b = 3;

        int result = mathUtil.mul(a, b);

        assertEquals(result, 6);

    }

    @Test
    public void testMulZero() {
        int a = 0;
        int b = 5;

        int result = mathUtil.mul(a, b);

        assertEquals(result, 0);
    }

    @Test
    public void testMulNegative() {
        int a = -2;
        int b = 3;

        int result = mathUtil.mul(a, b);

        assertEquals(result, -6);
    }

    @Test
    public void testDiv() {

        int a = 50;
        int b = 10;

        int result = mathUtil.div(a, b);

        assertEquals(result, 5);

    }

    @Test
    public void testDiv2() {

        int a = 24;
        int b = 3;

        int result = mathUtil.div(a, b);

        assertEquals(result, 8);

    }

    @Test
    public void testDiv3() {

        int a = 36;
        int b = 6;

        int result = mathUtil.div(a, b);

        assertEquals(result, 6);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDiveZero() {
        int a = 50;
        int b = 0;

        mathUtil.div(a, b);
    }

    @Test
    public void testDiveNegative() {
        int a = -50;
        int b = 10;

        int result = mathUtil.div(a, b);

        assertEquals(result, -5);
    }

    @Test
    public void testMod() {

        int a = 5;
        int b = 2;

        int result = mathUtil.mod(a, b);

        assertEquals(result, 1);
    }

    @Test
    public void testMod2() {

        int a = 10;
        int b = 5;

        int result = mathUtil.mod(a, b);

        assertEquals(result, 0);
    }

    @Test
    public void testMod3() {

        int a = 25;
        int b = 2;

        int result = mathUtil.mod(a, b);

        assertEquals(result, 1);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testModZero() {
        int a = 25;
        int b = 0;

        mathUtil.mod(a, b);
    }

    @Test
    public void testModNegative() {
        int a = -25;
        int b = 2;

        int result = mathUtil.mod(a, b);

        assertEquals(result, -1);
    }

    @Test
    public void testMin() {
        int a = 20;
        int b = 40;

        int result = mathUtil.min(a, b);

        assertEquals(result, 20);
    }

    @Test
    public void testMin2() {
        int a = 10;
        int b = 35;

        int result = mathUtil.min(a, b);

        assertEquals(result, 10);
    }

    @Test
    public void testMin3() {
        int a = 50;
        int b = 100;

        int result = mathUtil.min(a, b);

        assertEquals(result, 50);
    }

    @Test
    public void testMinWithEqualsValues() {
        int a = 50;
        int b = 50;

        int result = mathUtil.min(a, b);

        assertEquals(result, 50);
    }

    @Test
    public void testMinNegative() {
        int a = -50;
        int b = 100;

        int result = mathUtil.min(a, b);

        assertEquals(result, -50);


    }

}