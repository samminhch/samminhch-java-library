package samminhch.utils;

import java.util.Arrays;

/**
 * This class adds more methods for arrays that I think that the Arrays class doesn't have. They're for your convenience.
 */
public class ArrayUtils {

    /*
     * COUNT METHOD: returns the number of times an element appears in an array
     */

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(Object[] a, Object target) {
        int count = 0;
        for (Object element : a)
            count += element.equals(target) ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(byte[] a, byte target) {
        int count = 0;
        for (byte b : a)
            count += b == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(short[] a, short target) {
        int count = 0;
        for (short s : a)
            count += s == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(int[] a, int target) {
        int count = 0;
        for (int i: a)
            count += i == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(long[] a, long target) {
        int count = 0;
        for (long l: a)
            count += l == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(float[] a, float target) {
        int count = 0;
        for (float f: a)
            count += f == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(double[] a, double target) {
        int count = 0;
        for (double d: a)
            count += d == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(boolean[] a, boolean target) {
        int count = 0;
        for (boolean b: a)
            count += b == target ? 1 : 0;
        return count;
    }

    /**
     * @param a the array being used.
     * @param target the target that's getting counted.
     * @return <code>int</code>- the number of times an element appears in an array.
     */
    public static int count(char[] a, char target) {
        int count = 0;
        for (char c: a)
            count += c == target ? 1 : 0;
        return count;
    }

    /*
     * SWAP METHOD: swaps two elements in an array.
     */

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(Object[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        Object temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(byte[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        byte temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(short[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        short temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(int[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));

        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(long[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        long temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(float[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        float temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(double[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        double temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(boolean[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        boolean temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /**
     * swaps two values in an array as long as both the
     * @param a the array that's getting its values swapped
     * @param b index of the element that's getting swapped
     * @param c index of the second element that's getting swapped
     * @throws IndexOutOfBoundsException if b or c is < 0 or >= a.length
     */
    public static void swap(char[] a, int b, int c)throws IndexOutOfBoundsException {
        if (b < 0 || b >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your second parameter is out of bounds", b));
        if (c < 0 || c >= a.length)
            throw new IndexOutOfBoundsException(String.format("%d, your third parameter is out of bounds", c));
        char temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    /*
     * TRIM METHOD: acts like the String.trim() method, except that it works with arrays, and you can specify what you
     * want to trim.
     */

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>Object[]</code> a new array with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static Object[] trim(Object[] a, Object target){
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(target)) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (!a[i].equals(target)) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>byte[]</code> a new array with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static byte[] trim(byte[] a, byte target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>short[]</code> a new array with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static short[] trim(short[] a, short target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>int[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static int[] trim(int[] a, int target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>long[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static long[] trim(long[] a, long target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>float[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static float[] trim(float[] a, float target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>double[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static double[] trim(double[] a, double target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>boolean[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static boolean[] trim(boolean[] a, boolean target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /**
     * Returns an array without target values in the beginning of the array and at the end of the array.
     * @param a the array that's getting trimmed.
     * @param target the target value to trim.
     * @return <code>char[]</code> a new Object[] with trimmed value, or the array itself if the target value
     * does not exist in the array.
     */
    public static char[] trim(char[] a, char target) {
        if(!contains(a, target))
            return a;
        int leftBound = -1, rightBound = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] != target) {
                leftBound = i;
                break;
            }
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] != target) {
                rightBound = i + 1;
                break;
            }
        return Arrays.copyOfRange(a, leftBound, rightBound);
    }

    /*
     * INDEXOF METHOD: returns the index of an element
     */

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(Object[] a, Object target) {
        for (int i = 0; i < a.length; i++)
            if (a[i].equals(target))
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(byte[] a, byte target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(short[] a, short target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(long[] a, long target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(float[] a, float target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(double[] a, double target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(boolean[] a, boolean target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from 0->a.length-1 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int indexOf(char[] a, char target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(Object[] a, Object target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i].equals(target))
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(byte[] a, byte target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(short[] a, short target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(int[] a, int target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(long[] a, long target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(float[] a, float target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(double[] a, double target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0 and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(boolean[] a, boolean target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /**
     * @param a array that's being searched
     * @param target the target value that the method is searching for
     * @return <code>int</code>- searches the array from a.length-1->0.length and returns the index where the target element is
     * and -1 if target isn't in the array.
     */
    public static int lastIndexOf(char[] a, char target) {
        for (int i = a.length-1; i >= 0; i--)
            if (a[i] == target)
                return i;
        return -1;
    }

    /*
     * CONTAINS METHOD: returns whether an array contains an element.
     */

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(Object[] a, Object target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(byte[] a, byte target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(short[] a, short target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(int[] a, int target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(long[] a, long target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(float[] a, float target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(double[] a, double target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(boolean[] a, boolean target) {
        return indexOf(a, target) != -1;
    }

    /**
     * checks array to see if it contains the target value
     * @param a the array being searched.
     * @param target the value that the method is searching for.
     * @return <code>boolean</code> whether the array contains the target value.
     */
    public static boolean contains(char[] a, char target) {
        return indexOf(a, target) != -1;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(Object[] a, Object[] b) {
        int count = 0;
        for (Object o : a)
            count += contains(b, o) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(byte[] a, byte[] b) {
        int count = 0;
        for (byte by : a)
            count += contains(b, by) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(short[] a, short[] b) {
        int count = 0;
        for (short s : a)
            count += contains(b, s) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(int[] a, int[] b) {
        int count = 0;
        for (int i : a)
            count += contains(b, i) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(long[] a, long[] b) {
        int count = 0;
        for (long l : a)
            count += contains(b, l) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(float[] a, float[] b) {
        int count = 0;
        for (float f : a)
            count += contains(b, f) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(double[] a, double[] b) {
        int count = 0;
        for (double d : a)
            count += contains(b, d) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(boolean[] a, boolean[] b) {
        int count = 0;
        for (boolean bo : a)
            count += contains(b, bo) ? 1 : 0;
        return count == b.length;
    }

    /**
     * @return <code>boolean</code>- if all elements in array b are present in the array, regardless of order or duplicates
     */
    public static boolean containsArray(char[] a, char[] b) {
        int count = 0;
        for (char c : a)
            count += contains(b, c) ? 1 : 0;
        return count == b.length;
    }

    /*
     * SHUFFLE METHOD: shuffles elements in array a specified number of times.
     */

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(Object[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(byte[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length));
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(short[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(int[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(long[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(float[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(double[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(boolean[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }

    /**
     * shuffles all elements in the array by randomly swapping places in the array.
     * @param a the array that's getting shuffled
     * @param numShuffles the number of times the method will shuffle
     */
    public static void shuffle(char[] a, int numShuffles) {
        for (int i = 0; i < numShuffles; i++)
            swap(a,(int)(Math.random() * a.length), (int)(Math.random() * a.length) );
    }


    /*
     * RANDOFILL METHOD: fills array with random values.
     */

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers
     * @see Math#random()
     */
    public static void randoFill(byte[] a, byte min, byte range)throws IllegalArgumentException {
        for (int i = 0; i < a.length; i++)
            a[i] = (byte)(Math.random() * range + min);
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers
     * @see Math#random()
     */
    public static void randoFill(int[] a, int min, int range) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random() * range + min);
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers
     * @see Math#random()
     */
    public static void randoFill(long[] a, long min, long range) {
        for(int i = 0; i < a.length; i++)
            a[i] = (long)(Math.random() * range + min);
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers
     * @see Math#random()
     */
    public static void randoFill(float[] a, float min, float range) {
        for (int i = 0; i < a.length; i++)
            a[i] = (float)(Math.random() * range + min);
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers
     * @see Math#random()
     */
    public static void randoFill(double[] a, double min, double range) {
        for (int i = 0; i < a.length; i++)
            a[i] = Math.random() * range + min;
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @see Math#random()
     */
    public static void randoFill(boolean[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 2) == 1;
    }

    /**
     * Fills the given array with random values. Does not check for number overflow when doing calculations.
     * @param a the array to fill with random values with
     * @param min the minimum value of the array
     * @param range the range of random numbers. It's best to cast range from a number to a character and pass it to this method.
     * @see Math#random()
     */
    public static void randoFill(char[] a, char min, char range) {
        for (int i = 0; i < a.length; i++)
            a[i] = (char) (Math.random() * range + min);
    }
}