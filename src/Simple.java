import static java.lang.Math.*;

public class Simple {
    public static void main(String[] args) {
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println("square root: " + y);
        double z = Math.pow(2, 4);
        System.out.println(z);
        System.out.println(Math.log10(1000));

        // this is possible thanks to import static
        System.out.println(pow(3, 4));


    }
}
