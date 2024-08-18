package com.training.ques4;

import java.util.Arrays;
import java.util.List;

public class LengthofNames {

	public static void main(String[] args) {
      	List<String> names = Arrays.asList("Vaishu","Varun","Yuva");
      	names.stream().mapToInt(str->str.length()).forEach(str->System.out.println("Length of each name"+str));
	}

}
