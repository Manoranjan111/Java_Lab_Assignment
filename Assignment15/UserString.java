public class UserString {
    private String str;

    public UserString(String str) {
        this.str = str;
    }

    public int countCharacters() {
        return str.length();
    }

    public int countWords() {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public boolean compareStrings(String otherString) {
        return str.equals(otherString);
    }

    public String toUpperCase() {
        return str.toUpperCase();
    }

    public String toLowerCase() {
        return str.toLowerCase();
    }

    public String concatenate(String otherString) {
        return str.concat(otherString);
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public int findCharacter(char ch) {
        return str.indexOf(ch);
    }

    public String substring(int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }

    public boolean containsSubstring(String substring) {
        return str.contains(substring);
    }

    public String replaceSubstring(String oldSubstring, String newSubstring) {
        return str.replace(oldSubstring, newSubstring);
    }

    public String swapSubstrings(String str1, String str2) {
        int index1 = str.indexOf(str1);
        int index2 = str.indexOf(str2);

        if (index1 != -1 && index2 != -1) {
            String swapped = str.substring(0, index1) + str2 + str.substring(index1 + str1.length(), index2) +
                    str1 + str.substring(index2 + str2.length());
            return swapped;
        }

        return str;
    }

    public static void main(String[] args) {
        UserString userString = new UserString("Hello, World!");

        System.out.println("Number of characters: " + userString.countCharacters());
        System.out.println("Number of words: " + userString.countWords());
        System.out.println("Compare strings: " + userString.compareStrings("Hello, World!"));
        System.out.println("Uppercase: " + userString.toUpperCase());
        System.out.println("Lowercase: " + userString.toLowerCase());
        System.out.println("Concatenation: " + userString.concatenate(" Welcome!"));
        System.out.println("Is palindrome: " + userString.isPalindrome());
        System.out.println("Position of 'o': " + userString.findCharacter('o'));
        System.out.println("Substring: " + userString.substring(0, 5));
        System.out.println("Contains substring 'lo': " + userString.containsSubstring("lo"));
        System.out.println("Replace substring: " + userString.replaceSubstring("World", "Universe"));
        System.out.println("Swap substrings: " + userString.swapSubstrings("Hello", "Welcome"));
    }
}
