Sorting Algorithm Implementation

This project provides a simple implementation of the Selection Sort algorithm in Java. The project consists of three main files: Main.java, Sorter.java, and SorterTest.java.
Main.java

This file contains the Main class with the main method, serving as the entry point for the application. The program takes an array of integers as command-line arguments, validates the input, and if valid, performs the selection sort on the array.
Usage

	java Main 5 3 1 4 2

Replace the numbers with the desired array elements.

The Sorter class provides the implementation of the Selection Sort algorithm. It includes methods to print an array, swap elements, and perform the selection sort.
Methods

    printArray(int[] args): Print the elements of an array.
    swap(int[] args, int left, int right): Swap two elements in an array.
    selectSort(int[] args): Perform the Selection Sort algorithm on the given array.

The SorterTest class contains JUnit tests for the Sorter class. The existing test, selctSort1(), can be extended with additional tests to cover more scenarios and validate the correctness of the sorting algorithm.
Example Test

	@Test
	void selctSort2() {
   	 int[] in = {5, 2, 8, 1, 7, 3};
   	 int[] result = {1, 2, 3, 5, 7, 8};
     
   	 Assertions.assertArrayEquals(result, Sorter.selectSort(in));
	}
