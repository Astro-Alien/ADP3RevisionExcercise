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

    /*public double div(double number1, double number2){
        return number1 / number2;
    }*/
    //Farai Section
    public int addition(int a , int b){
        return a+b;
    }
}
