package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        int num = 0b1110;
        int mask = 0b0011;
        int result;
        System.out.println("Using a mask of ones with logical and select just bits in those positions");
        result = num & mask;
        System.out.println("Result: " + result);

        // binary full of ones using bit shifting
        int original = 0b1;
        int shiftBy = 5;
        System.out.println("Shift " + original + " by " + shiftBy + " bits");
        System.out.println(Integer.toBinaryString((original << shiftBy)));
        System.out.println("and subtract 1 to fill with ones");
        System.out.println(Integer.toBinaryString((original << shiftBy) -1));

        // char describes individual characters and has an integer value
        char letter = 'A';
        System.out.println(letter);
        System.out.println(letter + 10);
        char aChar = '\u2122'; // trademark symbol
        System.out.println(aChar);



    }
}
