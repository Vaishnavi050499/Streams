package com.training.ques2;

import java.util.stream.IntStream;

public class EvenNumbersInstream {

	public static void main(String[] args) {
	IntStream intStream = IntStream.rangeClosed(1, 100);
	intStream.filter(num->(num%2==0)).forEach(num->System.out.println(num));
	}

}
