package com.training.ques8;

import java.util.List;
import java.util.stream.Stream;

public class GenerateStream {

	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(()->Math.random());
		stream.limit(5).forEach(num->System.out.println(num));


	}

}
