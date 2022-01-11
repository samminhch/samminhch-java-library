import samminhch.utils.ArrayUtils;

import java.util.Arrays;

/**
 * The type Bogo sort.
 */
public class BogoSort implements Runnable {
    private final int threadNum;
    private final int[] nums;

    /**
     * Instantiates a new BogoSort class.
     *
     * @param arr the arr
     */
    public BogoSort(int[] arr, int threadNum) {
        this.threadNum = threadNum;
        nums = arr;
    }

    /**
     * Sorts the array.
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

    private boolean isSortedAscended() {
        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] > nums[i])
                return false;
        return true;
    }
}