import samminhch.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The BogoSort class contains functions for randomly sorting an int[], with the added (and really useless)
 * function of multithreading! Now you can BogoSort on multiple threads! (WIP)
 *
 * @author samminhch
 * @since 2021
 */
public class BogoSort implements Runnable {
    private final int threadNum;
    private final int[] nums;

    /**
     * Instantiates a new BogoSort class.
     *
     * @param arr       the arr
     * @param threadNum the thread num
     */
    public BogoSort(int[] arr, int threadNum) {
        this.threadNum = threadNum;
        nums = arr;
    }

    /**
     * This function is just used to test debug multithreading.
     *
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        int[] arr;
        int resp, numThreads;
        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to sort randomly generated array (0) or would you like to give your own array (1)?");
        resp = in.nextInt();
        while (resp != 0 && resp != 1) {
            System.out.println("Please provide a valid response.");
            resp = in.nextInt();
        }

        if (resp == 0) {
            System.out.println("How large do you want the array to be?");
            arr = new int[in.nextInt()];
            ArrayUtils.randoFill(arr, 0, Integer.MAX_VALUE);
        } else {
            System.out.println("Please enter your array elements.");
            System.out.println("Once you reach the end of the array, enter 'endarray'.");
            ArrayList<Integer> list = new ArrayList<>();
            String input = in.next();
            while (!input.equals("endarray")) {
                if (input.matches("\\d"))
                    list.add(Integer.valueOf(input));
                else
                    System.out.println("That's not a number. Try again.");
                input = in.next();
            }

            arr = list.stream().mapToInt(i -> i).toArray();
        }

        System.out.println("How many threads would you like to run?");
        numThreads = in.nextInt();

        System.out.printf("Original Array: %s\n", Arrays.toString(arr));
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.printf("Sorted Array: %s\n", Arrays.toString(temp));

        for (int i = 0; i < numThreads; i++) {
            BogoSort bogoSort = new BogoSort(arr, i);
            Thread thread = new Thread(bogoSort);
            thread.start();
        }
    }

    /**
     * Sorts the array.
     *
     * @return the number of shuffles it took to sort the array.
     */
    public int sort() {
        int numShuffles = 0;
        while (!isSortedAscended()) {
            ArrayUtils.shuffle(nums, 1);
            numShuffles++;
        }
        return numShuffles;
    }

    /**
     * Checks if <code>nums</code> is sorted in ascending order.
     *
     * @return a boolean indicating whether <code>nums</code> is sorted
     */
    private boolean isSortedAscended() {
        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] > nums[i])
                return false;
        return true;
    }

    /**
     * Runs a thread to sort <code>nums</code>
     *
     * @return void
     */
    @Override
    public void run() {
        long startTime = System.nanoTime();
        System.out.printf("""
                From Thread %-3d:
                \tIt took %s shuffles and %.4g seconds to sort the array.
                \tSorted array: %s
                """, threadNum, sort(), (System.nanoTime() - startTime) / Math.pow(10, 9), Arrays.toString(nums)
        );
    }
}