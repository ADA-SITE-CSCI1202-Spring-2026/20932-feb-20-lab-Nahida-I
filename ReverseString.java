

public class ReverseString {
    public static String reverseString(String text) {

        StringBuilder reversed = new StringBuilder();

        // start from last character
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String original = "Hello World";

        String result = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result);
    }
}
