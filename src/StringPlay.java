public class StringPlay {
    public static void main(String[] args) {
        int mask = 18;
        System.out.println("Decimal " + Integer.toString(mask));
        System.out.println("Binary " + Integer.toBinaryString(mask));
        System.out.println("Hexadecimal " + Integer.toHexString(mask));

        if (args.length == 1) {
            int inputNumber = Integer.valueOf(args[0]);
            System.out.println("Decimal from inputNumber " + Integer.toString(inputNumber));
            System.out.println("Binary from inputNumber " + Integer.toBinaryString(inputNumber));
        }
    }
}
