package com.example.helloworld;

public class HelloWorld {

    // static constant that can be used in other methods of the same class
    // or, because it's public, from other classes as HelloWorld.INITIAL_SCORE
    public static final int INITIAL_SCORE = 100;

    public static void main(String[] args) {
        double salary;
        salary = 12500.50;
        System.out.println(salary);
        int i, j;
        i = 1; j = 5;
        System.out.println(i + j);

        // constants named in all uppercase
        final double CM_PER_INCH = 2.54;
        System.out.println("50 inches in centimeters: " + (50 * CM_PER_INCH));
        System.out.println("Initial score set to " + INITIAL_SCORE);

        // convert Hex color to RGB
        int color = 0xf5e942; // Hex: #f5e942, RGB: 245, 233, 66
        System.out.println("colorHex " + Integer.toHexString(color));
        System.out.println("colorBinary " + Integer.toBinaryString(color));

        // Shift 16 bits to the right, and then binary AND to obtain 8 bits for red
        // the binary mask of eight ones is 0b11111111 == 0xFF == 255
        int binaryMask = 0b11111111;
        int red = ((color >> 16) & binaryMask);
        // TODO pad to print eight bits
        String redBinary = Integer.toBinaryString(red);
        String redHex = Integer.toHexString(red);
        System.out.println("Red: " + red + " Binary: " + redBinary +
                " Hex: " + redHex);

        // Shift 8 bits to the right, and then binary AND to obtain 8 bits for green
        int green = ((color >> 8) & binaryMask);
        String greenBinary = Integer.toBinaryString(green);
        String greenHex = Integer.toHexString(green);
        System.out.println("Green: " + green + " Binary: " + greenBinary +
                " Hex: " + greenHex);

        // Binary AND to obtain 8 bits representing blue
        int blue = color & binaryMask;
        String blueBinary = Integer.toBinaryString(blue);
        String blueHex = Integer.toHexString(blue);
        System.out.println("Blue: " + blue + " Binary: " + blueBinary +
                " Hex: " + blueHex);

        int n = 11;
        // n AND a mask containing a one in position I want to keep
        // the mask is just a one shifted three bits to the left
        // then when the only active bit is the one I want, the fourth,
        // shift three positions to the right
        int fourthBitFromRight = (n & (1 << 3)) >> 3;
        System.out.println("fourthBitFromRight: " + fourthBitFromRight);

//        int num = 0b1110;
//        int mask = 0b0011;
//        int result;
//        System.out.println("Using a mask of ones with logical and select just bits in those positions");
//        result = num & mask;
//        System.out.println("Result: " + result);
//
//        // binary full of ones using bit shifting
//        int original = 0b1;
//        int shiftBy = 5;
//        System.out.println("Shift " + original + " by " + shiftBy + " bits");
//        System.out.println(Integer.toBinaryString((original << shiftBy)));
//        System.out.println("and subtract 1 to fill with ones");
//        System.out.println(Integer.toBinaryString((original << shiftBy) -1));
//
//        // char describes individual characters and has an integer value
//        char letter = 'A';
//        System.out.println(letter);
//        System.out.println(letter + 10);
//        char aChar = '\u2122'; // trademark symbol
//        System.out.println(aChar);



    }
}
