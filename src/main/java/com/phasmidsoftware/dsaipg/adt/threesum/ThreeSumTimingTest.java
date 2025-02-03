package com.phasmidsoftware.dsaipg.adt.threesum;

import java.util.Arrays;
import java.util.Random;

public class ThreeSumTimingTest {

    public static void main(String[] args) {
        int[] testSizes = {100, 200, 400, 800, 1600};  // Values of N
        for (int N : testSizes) {
            int[] a = generateRandomArray(N);
            System.out.println("\nTesting N = " + N);

            // Measure time for Quadratic approach
            ThreeSumQuadratic quadratic = new ThreeSumQuadratic(a);
            long startTime = System.nanoTime();
            quadratic.getTriples();
            long endTime = System.nanoTime();
            System.out.println("Quadratic Execution Time: " + (endTime - startTime) / 1e6 + " ms");

            // Measure time for Quadrithmic approach
            ThreeSumQuadrithmic quadrithmic = new ThreeSumQuadrithmic(a);
            startTime = System.nanoTime();
            quadrithmic.getTriples();
            endTime = System.nanoTime();
            System.out.println("Quadrithmic Execution Time: " + (endTime - startTime) / 1e6 + " ms");

            // Measure time for Cubic approach (if implemented)
            ThreeSumCubic cubic = new ThreeSumCubic(a);
            startTime = System.nanoTime();
            cubic.getTriples();
            endTime = System.nanoTime();
            System.out.println("Cubic Execution Time: " + (endTime - startTime) / 1e6 + " ms");
        }
    }

    // Method to generate a random sorted array of size N
    private static int[] generateRandomArray(int N) {
        Random rand = new Random();
        int[] array = rand.ints(N, -10000, 10000).toArray();
        Arrays.sort(array);
        return array;
    }

    
}
