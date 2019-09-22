package pl.sda;

import pl.sda.fibonacci.*;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        int n = Integer.parseInt(args[0]);
        String param2 = args[1];

        FibonacciFactory factory = new FibonacciFactory();
        Fibonacci fibonacci = factory.produce(AlgorithmType.valueOf(param2));

        BigDecimal result = fibonacci.getN(n);

        System.out.println(n + " wyraz ciągu Fibonacciego to: "+ result);

        boolean isIterational = fibonacci instanceof FibonacciIterational;

        String text = isIterational ?
                "Wartość została obliczona iteracyjnie" :
                "Wartość została obliczona rekurencyjnie";
        System.out.println(text);

    }
}
