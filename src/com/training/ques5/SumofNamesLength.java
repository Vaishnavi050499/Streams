package com.training.ques5;

import java.util.Arrays;
import java.util.List;

public class SumofNamesLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vaishu","Varun","Yuva");
      	int sum = names.stream().mapToInt(str->str.length()).sum();
        System.out.println(sum);


	}

}
