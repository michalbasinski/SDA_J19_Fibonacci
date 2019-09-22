package pl.sda.fibonacci;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciIterationalTest {

    private Fibonacci fibonacci = new FibonacciIterational();

    @Test
    public void shouldReturn8WhenNIs6() {
        //given
        final int n = 6;
        final BigDecimal expectedValue = new BigDecimal(8);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn0WhenNIs0() {
        //given
        final int n = 0;
        final BigDecimal expectedValue = new BigDecimal(0);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldReturn1WhenNIs1() {
        //given
        final int n = 1;
        final BigDecimal expectedValue = new BigDecimal(1);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedValue, result);
    }

    @Test(expected = FibonacciArgumentException.class)
    public void shouldThrowExceptionWhenNIsNegative() {
        //given
        final int n = -10;

        //when
        BigDecimal result = fibonacci.getN(n);
    }

    @Test
    public void shouldThrowExceptionWhenNIsNegativeAlt() {
        //given
        final int n = -6;

        //when
        try {
            BigDecimal result = fibonacci.getN(n);
            fail("Wyjątek nie został rzucony");
        } catch (FibonacciArgumentException e) {
            int i = 0;
            //Wyrzucono wyjątek
        }
    }
}