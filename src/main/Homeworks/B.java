package main.Homeworks;


import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.abs;

public class B {

    // sort array with O(n^2) complexity
     public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    // generate array of n random numbers within range [0, k)
    public static int[] randomArray(int n, int k) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = abs(random.nextInt()) % k;
        return arr;
    }

    // prints array into console
    public static void print(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // returns runtime of the 'randomArray' method in milliseconds within n = 10000, k = 100
    public static long evaluateRuntime() {
        long start = System.currentTimeMillis();
        randomArray(10000, 100);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = scan.nextInt();
//
//        bubbleSort(arr);
//        print(arr);
//        int n = scan.nextInt(), k = scan.nextInt();
//        int[] arr = randomArray(n, k);
//        print(arr);
     }

}
