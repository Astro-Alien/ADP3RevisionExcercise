package za.ac.cput;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    }

    public int Subtraction(int first, int last){
        int ans = 0;
        if (first > last){
            ans = first - last;
        } else if(last > first){
            ans  = last - first;
        }

        return ans;
    }
    public int Multiplication(int first, int last){
        int ans = first * last;
        return ans;
    }

    public static double div(double number1, double number2){
        if (number2 ==0){
            throw new IllegalArgumentException("Number2 can not be 0!");
        }
        return number1 / number2;
    }
}
