package com.example.quiz1tolentino;

public class Main {
    public static void main(String[] args) {

        // array (from Sir Dale's lec)
        int[] numbers = new int[10];
        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        // array before sorting
        System.out.print("BEFORE sorting: ");
        printArray(numbers);
        System.out.print("\n\n");

        // array after bubble sorting
        System.out.print("AFTER Bubble sorting: ");
        bubbleSort(numbers);
        printArray(numbers);
        System.out.print("\n");

        //array after selection sorting
        System.out.print("AFTER Selection sorting: ");
        selectionSort(numbers);
        printArray(numbers);
        System.out.print("\n");
    }

    // function to print the array
    private static void printArray(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    // function for bubble sort
    private static void bubbleSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    // swap the adjacent elements
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
    // function for selection sort
    private static void selectionSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (numbers[i] < numbers[smallestIndex]) {
                    smallestIndex = i;
                }
            }


            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[lastSortedIndex];
            numbers[lastSortedIndex] = temp;
        }
    }
}