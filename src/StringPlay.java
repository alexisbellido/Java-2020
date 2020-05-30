public class StringPlay {

    public static String extension(String filename) {
        int dot = filename.lastIndexOf(".");
        return "extension: " + filename.substring(dot + 1);
    }

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

        String anotherPalindrome = "Niagara. I roar again!";
        char aChar = anotherPalindrome.charAt(9);
        System.out.println("aChar: " + aChar);
        System.out.println("substring(0, 5): " + anotherPalindrome.substring(2, 7));

        String haystack = "this is the abc and I need the abc and end of abc is here";
        String[] parts = haystack.split("abc");
        for (String part: parts) {
            System.out.println("part: " + part.trim().toUpperCase());
        }
        System.out.println(haystack.replace("abc", "X"));
        String filename = "README.rst";

        // which is the correct way of calling the static method?
        // System.out.println(extension(filename));
        System.out.println(extension(StringPlay.extension(filename)));
    }
}
