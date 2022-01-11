import samminhch.utils.ArrayUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)throws IOException {
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
}