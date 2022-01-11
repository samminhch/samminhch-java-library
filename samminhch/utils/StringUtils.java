package samminhch.utils;

/**
 * This class contains additional methods for modifying Strings.
 *
 * @author samminhch
 * @since 2019
 */
public class StringUtils {
    /**
     * Returns a String without target values in the beginning of the array and at the end of the array.
     *
     * @param str    the string that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>String</code>- a new String with trimmed value, or the array itself if the target value does not exist in the array.
     */
    public static String trim(String str, String target) {
        if(!str.contains(target))
            return str;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < str.length(); i++)
            if (!str.substring(i, i + 1).equals(target)) {
                leftBound = i;
                break;
            }

        for (int i = str.length() - 1; i >= 0; i--)
            if (!str.substring(i, i + 1).equals(target)) {
                rightBound = i + 1;
                break;
            }
        return str.substring(leftBound, rightBound);
    }

    /**
     * Inserts a String in another String from the former string's index.
     *
     * @param str   The string that's getting modified.
     * @param value The string that's getting appended to str.
     * @param index The index
     * @return <code>String</code>- a new String with the modified values.
     */
    public static String insert(String str, String value, int index) {
        boundCheck(str, index);
        return str.substring(0, index) + value + str.substring(index);
    }

    /**
     * Changes a character in a string into a user-defined character. This method
     * shouldn't be confused with the replace method. For example, calling
     * <code>set("Hello!", "no", 2)</code> will return the String "Henolo!" while calling
     * <code>replace("Hello!", "no", 2)</code> will return "Heno".
     *
     * @param str   The string that's getting modified.
     * @param value The string that's being set to.
     * @param index The index of which it's getting set from.
     * @return <code>String</code>- a new String with modified values.
     */
    public static String set(String str, String value, int index) {
        boundCheck(str, index);
        return str.substring(0, index) + value + str.substring(index + 1);
    }

    /**
     * This method replaces all characters starting from a user-defined index to a user-defined string.
     * This method is not to be confused with the <code>set</code> method. Calling
     * <code>replace("Hello!", "no", 2)</code> will return "Heno", while calling
     * <code>set("Hello!", "no", 2)</code> will return the String "Henolo!".
     *
     * @param str   The string that's getting modified.
     * @param index The starting index to replace the characters in str.
     * @param value The string that's going to be replacing.
     * @return <code>String</code>- a new String with modified values.
     */
    public static String replace(String str, int index, String value) {
        boundCheck(str, index);
        return replace(str, index, str.length(), value);
    }

    /**
     * This method replaces all characters from <code>startIndex</code> to <code>endIndex</code> with
     * the user-specified String. For example, calling <code>replace("Hello, World!", 2, 5, "Goodbye, World!")</code>
     * will return the String "HeGoo, World!".
     *
     * @param str        The string getting modified
     * @param startIndex The beginning of the substring that's getting replaced
     * @param endIndex   The end index of the substring that's getting replaced
     * @param value      The value to replace str.substring(startIndex, endIndex) with
     * @return a new String with its substring from startIndex, endIndex containing value
     */
    public static String replace(String str, int startIndex, int endIndex, String value) {
        //checking for exceptions.
        boundCheck(str, startIndex);
        if (endIndex < 0 || endIndex > str.length())
            throw new IllegalArgumentException(String.format("endIndex %d > str \"%s\" length of %d.", endIndex, str, str.length()));
        if (endIndex <= startIndex)
            throw new IllegalArgumentException(String.format("endIndex %d is <= startIndex %d.", endIndex, startIndex));

        //actually doing stuff.
        if (value.length() > endIndex - startIndex){
            char[] strReplacement = str.toCharArray();
            for (int i = startIndex, count = 0; i < endIndex; i++, count++)
                strReplacement[i] = value.charAt(count % value.length());
            return String.valueOf(strReplacement);
        }

        return str.substring(0, startIndex) + value + (endIndex < str.length() - 1 ? str.substring(endIndex + 1) : "");
    }

    /**
     * Reverses a String.
     *
     * @param str The String that's getting reversed.
     * @return <code>- the reversed String.
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));
        return reversed.toString();
    }

    /**
     * Checks if the given index is out of bounds for the given String.
     *
     * @param str   the String
     * @param index the index
     * @throws IllegalArgumentException if the index is < 0 or >= the length of the given String
     */
    private static void boundCheck(String str, int index) throws IllegalArgumentException {
        if (index < 0 || index >= str.length())
            throw new IllegalArgumentException(String.format("Index %d is out of bounds for %s length %d", index, str, str.length()));
    }
}
