package com.training.ques9;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwodimSum {

	public static void main(String[] args) {
		int startval=0;
		Integer arr[][]= new Integer[][] {{12,13},{14,15},{16,17}} ;
		Stream<Integer[]> intstream = Arrays.stream(arr);
		Stream<Integer> onestream = intstream.flatMap(one->Arrays.stream(one));
		int sum = onestream.reduce(startval, (x,y)->(x+y));
		System.out.println(sum);
		

	}

}
