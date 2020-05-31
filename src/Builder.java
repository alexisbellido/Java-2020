import java.util.Date;

public class Builder {

    private int sum(int a, int b) {
        return a + b;
    }


    static int multiply(int x, int y) {
        // a static method to reference from static method main
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("Testing");
        int num1 = 5;
        int num2 = 7;

        // it's fine to create an instance of the Builder class inside the Builder's class main
        // method for testing because it is a static method
        Builder builder = new Builder();
        // it's also better to call instance methods like this
        System.out.println(builder.sum(num1, num2));
        // than declaring static methods to call via the class like this
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

        builder.simplePalindrome();
        builder.betterPalindrome();

        System.out.printf("%tc %n", new Date());
    }

    void simplePalindrome() {
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

    void betterPalindrome() {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println("== Original: " + palindrome);
        System.out.println("== Reverse: " + sb);
    }

}
