public class StringBuilderPlay {

    public static void main(String[] args) {
        System.out.println("Testing");
        Helper hp = new Helper();
        int num1 = 5;
        int num2 = 7;
        System.out.println(hp.sum(num1, num2));
        System.out.println(multiply(num1, num2));

        // create empty build, default capacity 16
        StringBuilder sb = new StringBuilder();
        sb.append("Greetings");
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
        sb.delete(4, 6);
        System.out.println(sb);
        sb.append("nish");
        System.out.println(sb);
        sb.reverse();
        String reverseWord = sb.toString().toUpperCase();
        System.out.println(reverseWord);

        simplePalindrome();
        betterPalindrome();

    }

    static void simplePalindrome() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        // print to verify tempCharArray element
//        for (char c: tempCharArray) {
//            System.out.println(c);
//        }

        for (int j = 0; j < len; j++) {
//            System.out.println(len - 1 - j);
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println("= Original: " + palindrome);
        System.out.println("= Reverse: " + reversePalindrome);
    }

    static void betterPalindrome() {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println("== Original: " + palindrome);
        System.out.println("== Reverse: " + sb);
    }

    static int multiply(int x, int y) {
        // should be static to reference it from static method main
        return x * y;
    }

}

class Helper {
    // just for testing, there should be just one class per file
    int sum(int a, int b) {
        return a + b;
    }
}
