package lengthOfLastWord;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWordBestAttempt("   fly me   to   the moon  "));

    }
    public static int lengthOfLastWordBestAttempt(String s) {
        //Edge case: The string has one word.
        if (s.indexOf(' ') == -1) {
            return s.length();
        }

        StringBuilder builder = new StringBuilder();

        builder.append(s);

        builder.reverse();

        Boolean leadingSpaces = true;

        builder = new StringBuilder(builder.toString().trim());

        //Edge case: No spaces left in the modified string.
        if (builder.indexOf(" ") == -1) {
            return builder.length();
        }

        return builder.indexOf(" ");
    }

    public static int lengthOfLastWordBestOption(String s) {
        s = s.trim();

        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
