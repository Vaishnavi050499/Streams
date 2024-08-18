package com.training.ques6;

import java.util.Arrays;
import java.util.List;

public class PrintFirstName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vaishu","Arun","Yuva","Vaishu","Yuva");
		names.stream().sorted().distinct().limit(1).forEach(str->System.out.println(str));

	}

}
