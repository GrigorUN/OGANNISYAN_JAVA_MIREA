import java.math.BigInteger;

public class zadanie7 
{
    public static void main(String[] args) 
    {
        int number = 1000;
        BigInteger factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static BigInteger calculateFactorial(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) 
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}