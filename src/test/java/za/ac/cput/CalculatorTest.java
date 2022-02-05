package za.ac.cput;

import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest extends TestCase {
    private Calculator calc;
    private int a, b;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Set up class fixture");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tear down class fixture");
    }

    @Before
    public void setUp() {
        System.out.println("Set up method fixture");
        this.calc = new Calculator();
        this.a = 5;
        this.b = 10;
    }

    @After
    public void tearDown() {
        System.out.println("Tear down method fixture");
    }

    //Joshua Section
    public void testSubtraction(){
        calc.Subtraction(a, b);
        //  --failed test--
        //  assertSame(5, calc.Subtraction(a, 90));

        assertSame(5, calc.Subtraction(a, b));
    }
    //Charles Section
    public void testMultiplication(){
        calc.Multiplication(a,b);
        //  --failed test--
        //  assertSame(51, calc.Multiplication(a,b));
        assertSame(50,calc.Multiplication(a,b));
    }
    //Chadrack Section
    @Test
    @DisplayName("Passing Test")
    void calTestPass() {

        assertEquals(2, Calculator.div(10,5));
        assertEquals(9, Calculator.div(18,2));
        assertEquals(6, Calculator.div(18, 3));
    }
    @Test
    @DisplayName("Failing Test of two numbers divided")
    void calTestFail(){

        assertEquals(6, Calculator.div(4,3));
        assertEquals(5, Calculator.div(6,5));
        assertEquals(6.1, Calculator.div(4.2, 5.3));
    }
    @Test
    @DisplayName("Ensure correct handling of Exception")
    void calTestException(){

        assertEquals(4, Calculator.div(3,0));
        assertEquals(5, Calculator.div(6,5));
        assertEquals(4.1, Calculator.div(6.2, 9));
    }
}
