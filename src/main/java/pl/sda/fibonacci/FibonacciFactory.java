package pl.sda.fibonacci;

public class FibonacciFactory {

    public Fibonacci produce(AlgorithmType type) {
        if (AlgorithmType.RECURSIVE.equals(type)) {
            return new FibonacciRecursive();
        }
        if (AlgorithmType.ITERATIONAL.equals(type)) {
            return new FibonacciIterational();
        }
        return null;
    }
}