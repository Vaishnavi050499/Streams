package com.training.ques1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumofNumbers {

	public static void main(String[] args) {
		IntStream instream = Arrays.stream(new int[] {20,30,40,50,60});
		int sum = instream.sum();
		System.out.println("Sum of elements in the stream \t"+sum);

	}

}
