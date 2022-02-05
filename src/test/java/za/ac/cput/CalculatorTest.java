package za.ac.cput;

import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import java.util.concurrent.TimeUnit;

public class CalculatorTest extends TestCase {
    private Calculator calc;
    private Calculator calc2;
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
        this.calc2=new Calculator();
        calc=calc2;
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
    @Test
    public void testMultiplication(){
        calc.Multiplication(a,b);
        assertEquals(calc,calc2);
        //  --failed test--
        //  assertSame(51, calc.Multiplication(a,b));

    }
    //Chadrack Section
    public void testDiv() {
        assertEquals(2, Calculator.div(10,5));
    }
    
    //Farai Section
    public void testAddition() {
        calc.addition(a,b);
        fail("this will  fail");
    }


    //Farai Section
    @Test(timeout = 500)
    public void testTimeout() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(1);
    }


}
