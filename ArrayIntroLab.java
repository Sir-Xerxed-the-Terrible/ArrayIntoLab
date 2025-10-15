/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ArrayIntroLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Arraysize = new int[5]; //Declaration of the array
        int[] numbers = {0, 1, 2, 3, 4}; //Initialization of the array

        int choice;

        do {
            System.out.println("\n Options regarding the Array: ");
            System.out.println("1. Array using for-loop.");
            System.out.println("2. Array using while-loop.");
            System.out.println("3. Array using do-while loop.");
            System.out.println("4. Sum of all the elements in the Array.");
            System.out.println("5. The Largest element in the Array.");
            System.out.println("6. Array in the Reverse Order..");
            System.out.println("9. Close");
            System.out.println("\nPlease input a number to choose an action.");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {

                    System.out.println(numbers[0]);
                    System.out.println("Array size: " + numbers.length);

                    System.out.println("Array using for-loop: ");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println("Index" + i + ":" + numbers[i]);
                    }
                }

                case 2 -> {

                    System.out.println("Array using while-loop: ");
                    int i = 0;
                    while (i < numbers.length) {
                        System.out.println("Index " + i + ":" + numbers[i]);
                        i++;
                    }
                }

                case 3 -> {

                    System.out.println("Array using do-while loop: ");
                    int i = 0;
                    do {
                        System.out.println("Index " + i + ":" + numbers[i]);
                        i++;
                    } while (i < numbers.length);
                }
                case 4 -> {
                    int sum = 0; 


                    for (int i = 0; i < numbers.length; i++) {
                        sum += numbers[i];
                    }

                    System.out.println("The Sum of all the inegers: " + sum);
                }

                case 5 -> {
                    int largest = numbers[4];
                    System.out.println("The largest element in the array is: " + largest);
                }
                case 6 -> {
                    int start = 0;
                    int end = numbers.length - 1;

                    while (start < end) {
                        int temp = numbers[start];
                        numbers[start] = numbers[end];
                        numbers[end] = temp;
                        start++;
                        end--;

                        for (int num : numbers) {
                            System.out.print(num);
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Thank You And Goodbye.");
                    System.exit(0);
                }
                default ->
                    System.out.println("\nInvalid Choice");
            }

        } while (choice != 0);
    }
}
