import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BadCalculatorTest {
    private BadCalculator calc = new BadCalculator();

    @BeforeTest
    private void start() {
        System.out.println("Start");
    }

    @AfterTest
    private void finish() {
        System.out.println("Finish");
    }

    /**
     * Сумма
     **/
    @Test
    private void testSum() throws Exception {
        Assert.assertEquals(-4, calc.sum(-9, 5));
    }
    @Test
    private void testSum2() throws Exception {
        Assert.assertEquals(-91005, calc.sum(-91000, -5));
    }
    @Test
    private void testSum3() throws Exception {
        Assert.assertEquals(5, calc.sum(2, 3));
    }
    @Test
    private void testSum4() throws Exception {
        Assert.assertEquals(0,calc.sum(0,0));
    }

    /**
     * Вычитание
     */
    @Test
    private void testSubstract() throws Exception {
        Assert.assertEquals(1, calc.substract(-1, -2));
    }
    @Test
    private void testSubstract2() throws Exception {
        Assert.assertEquals(-13, calc.substract(-11, 2));
    }
    @Test
    private void testSubstract3() throws Exception {
        Assert.assertEquals(0, calc.substract(0, 0));
    }
    @Test
    private void testSubstract4() throws Exception {
        Assert.assertEquals(90, calc.substract(310, 220));
    }

    /**
     * Деление
     */
    @Test(expectedExceptions = ArithmeticException.class)
    private void testDivZero() {
        Assert.assertEquals(0, calc.div(1, 0));
    }
    @Test(enabled = false)
    private void testDiv() {
        Assert.assertEquals(2.5, calc.div(10, 4));
    }
    @Test(enabled = false)
    private void testDiv2() {
        Assert.assertEquals(2, calc.div(20,10));
    }
    @Test
    private void testDiv3() {
        Assert.assertEquals(3.0, calc.div(90,30));
    }
    @Test
    private void testDiv4() {
        Assert.assertEquals(0.0, calc.div(0,1));
    }
    @Test
    private void testDiv5() {
        Assert.assertEquals(-2.0, calc.div(-4,2));
    }
    @Test
    private void testDiv6() {
        Assert.assertEquals(10.0, calc.div(-50,-5));
    }

    /** Умножение */
    @Test
    private void testMult(){
        Assert.assertEquals(10.5, calc.mult(5.25f, 2f));
    }
    @Test
    private void testMult2(){
        Assert.assertEquals(0.0, calc.mult(0, 0));
    }
    @Test
    private void testMult3(){
        Assert.assertEquals(-1.5625, calc.mult(1.25f, -1.25f));
    }
    @Test
    private void testMult4(){
        Assert.assertEquals(17.87483787536621, calc.mult(-10.9999f, -1.625f));
    }
}