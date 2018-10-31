package com.marlabs.junit.basicexamplescollections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondSmallestElementExample {

	public int getSecondSmallestElement(int inputArray[]) {
		final String METHOD_NAME = "getSecondSmallestElement";
		int outputValue = 0;
		System.out.println("Method Invoked: " + METHOD_NAME + ": " + Arrays.toString(inputArray));
		if (inputArray == null) {
			throw new NullPointerException();
		} else {
			SortedSet<Integer> arraysSet = new TreeSet<Integer>();
			for (int i : inputArray) {
				arraysSet.add(i);
			}
			System.out.println("ArraysSet" + arraysSet);
			Object objectArray[] = arraysSet.toArray();
			outputValue = (Integer) objectArray[1];
			System.out.println("outPutArray: " + outputValue);
		}

		/*
		 * else { Set<int[]> arraysSet = new TreeSet<>(); for (int arraysLength = 0;
		 * arraysLength < inputArray.length; arraysLength++) {
		 * arraysSet.add(inputArray); } int setValue [] = arraysSet.; outputValue = ; }
		 */

		System.out.println("Response from the Method: " + METHOD_NAME + ": " + outputValue);
		return outputValue;
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");

		int inputArray[] = { 10, 23, 34, 2, 23, 10, 2, 34, 56, 67, 78, 90, 45 };
		SecondSmallestElementExample example = new SecondSmallestElementExample();
		int output = example.getSecondSmallestElement(inputArray);
		System.out.println("Second Smallest Element is: " + output);
		System.out.println("Main Ends");
	}

}
