package za.ac.cput;

import junit.framework.TestCase;
import org.junit.*;

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
}
