public class Main {
    public static void main(String[] args) {
        String input1 = "123456";
        String input2 = "123a12";

        System.out.println(input1 + ": " + containsOnlyDigits(input1));
        System.out.println(input2 + ": " + containsOnlyDigits(input2));
    }
    public static String containsOnlyDigits(String str) {
        return containsOnlyDigitsHelper(str, 0);
    }

    /**
     * Recursive helper function to check if the substring from index 'start' onwards
     * contains only digits.
     *
     * @param str   The input string.
     * @param start The current index in the string.
     * @return Yes if the substring contains only digits, No otherwise.
     */
    private static String containsOnlyDigitsHelper(String str, int start) {
        if (start >= str.length()) {
            // Base case: Reached the end of the string
            return "Yes";
        }

        char currentChar = str.charAt(start);
        if (Character.isDigit(currentChar)) {
            // Recursive case: Check the next character
            return containsOnlyDigitsHelper(str, start + 1);
        } else {
            // The current character is not a digit
            return "No";
        }


    }

}