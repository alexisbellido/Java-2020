import java.math.BigInteger;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class Factorial {

    // Compile and run with classpath to use Apache Commons Math https://commons.apache.org/proper/commons-math/
    // $ javac -cp ".:/Users/alexis/java-libraries/commons-math3-3.6.1/commons-math3-3.6.1.jar" Factorial.java
    // $ $ java -cp ".:/Users/alexis/java-libraries/commons-math3-3.6.1/commons-math3-3.6.1.jar" Factorial

    // Compile and run in one go
    // $ java -cp ".:/Users/alexis/java-libraries/commons-math3-3.6.1/commons-math3-3.6.1.jar" Factorial.java

    public long factorial(int number) {
        // will overflow with number > 25 and result in a negative
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public long recursiveFactorial(int number) {
        if (number >= 1) {
            return number * recursiveFactorial(number - 1);
        } else {
            return 1;
        }
    }

    public BigInteger addBig(BigInteger a,  BigInteger b) {
        return a.add(b);
    }

    public BigInteger bigFactorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);
        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n;
        if ( args.length > 0 && args[0] != null) {
            //n = Integer.valueOf(args[0]);
            n = Integer.parseInt(args[0]);
        } else {
            n = 1;
        }
        System.out.printf("factorial(%d): %d %n", n, f.factorial(n));
        System.out.printf("recursiveFactorial(%d): %d %n", n, f.recursiveFactorial(n));
        System.out.printf("addBig(%d): %d %n", n, f.addBig(BigInteger.valueOf(n), BigInteger.valueOf(n)));
        System.out.printf("bigFactorial(%d): %d %n", n, f.bigFactorial(BigInteger.valueOf(n)));
        System.out.printf("CombinatoricsUtils.factorial(%d): %d %n", n, CombinatoricsUtils.factorial(n));
    }
}
