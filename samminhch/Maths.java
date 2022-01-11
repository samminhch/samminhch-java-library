package samminhch;

import samminhch.utils.StringUtils;

/**
 * The Maths class contains functions for Math functions that I wish Java had.
 *
 * @since September 16, 2021
 */
public class Maths {
    /**
     * Returns a decimal integer number in scientific notation. This is literally useless you could just use
     * String.format() for this.
     *
     * @param num            the number you want to convert to Scientific Notation
     * @param decimalsToKeep the number of decimals you want to keep in the conversion
     * @return the number in scientific notation
     * @deprecated Just use String.format ;-;
     */
    public static String toScientificNotation(int num, int decimalsToKeep) {
//        if (decimalsToKeep < 0 || decimalsToKeep >= numSigFigs(Integer.toString(num)))
//            throw new IllegalArgumentException(String.format("The decimals you want to keep (%d) are either below " +
//                    "0 or greater than the number of sig figs a number has", decimalsToKeep));
        String numString = Integer.toString(round(num, decimalsToKeep));
        return StringUtils.insert(numString.substring(0, Math.min(1 + decimalsToKeep, numString.length())), decimalsToKeep > 0 ? "." : "", 1) +
                "e+" + (Integer.toString(num).length() - 1);
    }

    /**
     * This function rounds an integer to the nearest digit, specified by <code>pos</code>.
     *
     * @param num the num the number that's getting rounded.
     * @param pos the pos the digit to round to.
     * @return an int which is the rounded number.
     */
    // TODO: Please fix this method this is so cringe lol
    public static int round(int num, int pos) {
        String numString = Integer.toString(num);
        if (pos >= numString.length() - 2)
            return num;
        else if (pos < 0)
            return pos == -1 && Integer.parseInt(numString.substring(0, 1)) >= 5 ? (int) Math.pow(10, numString.length()) : 0;

        if (Integer.parseInt(numString.substring(pos + 1, pos + 2)) >= 5) {
            numString = StringUtils.set(numString, Integer.toString(numberInPos(num, pos) + 1), pos);
            return Integer.parseInt(StringUtils.replace(numString, pos + 1, "0"));
        }
        return Integer.parseInt(StringUtils.replace(numString, pos + 1, "0"));
    }


    /**
     * Returns the number of significant figures the String decimal number contains
     *
     * @param num the number, in String form
     * @return an int indicating the number of significant figures the number (as a String) contains
     */
    public static int numSigFigs(String num) {
        num = num.trim();
        if (!num.matches("[0-9.]+"))
            throw new IllegalArgumentException(String.format("The String you passed (%s) through contains illegal " +
                    "characters and cannot be turned into a number", num));
        if (!num.contains("."))
            return StringUtils.trim(num, "0").length();
        else {
            String answer = Double.toString(Double.parseDouble(num));
            return Double.parseDouble(answer.substring(0, answer.indexOf("."))) > 0 ? answer.length() - 1 :
                    Integer.toString(Integer.parseInt(answer.substring(answer.indexOf(".") + 1))).length();
        }
    }

    /**
     * Number in pos int.
     *
     * @param number the number
     * @param index  the index
     * @return the int
     */
    public static int numberInPos(int number, int index) {
        return Integer.parseInt(Integer.toString(number).substring(index, index + 1));
    }

    //09-16-21

    /**
     * Returns the absolute value of a number.
     *
     * @param num the number given.
     * @return <code>byte</code>-- The absolute value of byte num.
     */
    public static byte abs(byte num) {
        return num < 0 ? (byte) -num : num;
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param num the number given.
     * @return <code>short</code>-- The absolute value of short num.
     */
    public static short abs(short num) {
        return num < 0 ? (short) -num : num;
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param num the number given.
     * @return <code>int</code>-- The absolute value of int num.
     */
    public static int abs(int num) {
        return num < 0 ? -num : num;
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param num the number given.
     * @return <code>long</code>-- The absolute value of long num.
     */
    public static long abs(long num) {
        return num < 0 ? -num : num;
    }

    /**
     * This method finds the greatest common denominator (gcd) of the two integers provided. The method used to find the
     * gcd of the two numbers is Euclid's Algorithm but with repeated subtraction.
     *
     * @param a the first integer given
     * @param b the second integer given
     * @return <code>int</code>-- The greatest common denominator between two integers; or -1 if the sum of the parameters is greater than Integer.MAX_VALUE.
     */
    public static int gcd(int a, int b) {
        a = abs(a);
        b = abs(b);

        //checking for overflow
        if ((long) a + (long) b >= Integer.MAX_VALUE)
            return -1;

        //gcd of the pair is the non-zero number if one number is zero.
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
