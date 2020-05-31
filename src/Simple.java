import static java.lang.Math.*;

public class Simple {

    enum Size {SMALL, MEDIUM, LARGE};

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

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
        letters[0] = 'A';
        letters[1] = 'b';
        letters[2] = 'c';
        System.out.printf("%s %s %s%n", letters[0], letters[1], letters[2]);

        String miniAlpha = new String(letters);
        System.out.println(miniAlpha);

        char[] newLetters = miniAlpha.toCharArray();
        for (char c: newLetters) {
            System.out.println(c);
        }

        Size s = Size.MEDIUM;
        System.out.println("Size is " + s);

        String greeting = "Hello";
        String subGreeting = greeting.substring(0, 4);
        System.out.println(subGreeting);

        if (args.length == 1) {
            System.out.println("First argument from command line: " + args[0]);
            float a = (Float.valueOf(args[0])).floatValue(); // returns object
            float b = Float.parseFloat(args[0]); // returns primitive
            System.out.println(a + b);
        }

        byte mask = 0b101;
        System.out.print("mask with padding: ");
        System.out.println(String.format("%4s", Integer.toBinaryString(mask)).replace(' ', '0'));


    }
}
