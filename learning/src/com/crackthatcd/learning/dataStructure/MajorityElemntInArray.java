package com.crackthatcd.learning.dataStructure;

/*
 * this program finds majority element in an array
 * 
 * two approaches exist
 * 		1: using Moores voting algorithm  O(n) O(1)
 * 		2: using auxiliary space of hashmap O(n) O(n)
 * 		3: nested loop for each element O(n*2)
 * 
 */

public class MajorityElemntInArray {

	public static int getMazorityElement(int[] arr) {

		return isCandidateMazor(getCandidate(arr), arr);

	}

	private static int isCandidateMazor(int candidate, int[] arr) {
		int threshold = arr.length / 2;
		int count = 0;
		for (int i : arr) {
			if (i == candidate) {
				count++;
			}
		}
		return count >= threshold ? candidate : null;
	}

	private static int getCandidate(int[] arr) {
		int count = 1;
		int mazorindex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[mazorindex])
				count++;
			else
				count--;

			if (count == 0) {
				mazorindex = i;
				count = 1;
			}

		}

		return arr[mazorindex];
	}

	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4, 3, 3, 3, 3, 4, 4, 4, 5, 3, 3, 3, 3, 3 };

		/*
		 * with Moores voting approach
		 */
		System.out.println("Mazority element is : " + getMazorityElement(arr));

		/*
		 * Using hashmap Approach
		 */

	}
}
