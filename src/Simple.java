import static java.lang.Math.*;

public class Simple {
    public static void main(String[] args) {
        double x = 4;
        double y = sqrt(x);
        System.out.println("square root: " + y);
        double z = pow(2, 4);
        System.out.println(z);
        System.out.println(log10(1000));

        // this is possible thanks to import static
        System.out.println(pow(3, 4));

        double original = 3.53;
        int justInt = (int) original;
        System.out.println(justInt);

        // to round to nearest integer
        int nearestInt = (int) round(original);
        System.out.println(nearestInt);

        char[] letters = new char[3];
        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';
        System.out.printf("%s %s %s%n", letters[0], letters[1], letters[2]);

        String miniAlpha = new String(letters);
        System.out.println(miniAlpha); // test


    }
}
