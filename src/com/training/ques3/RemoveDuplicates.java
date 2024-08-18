
package com.training.ques3;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
      List<String> names = Arrays.asList("Saibaba","Srimathi","Sam","Vaishu","Varun","Saibaba","Vaishu","Sam");
      names.stream().distinct().filter(str->str.startsWith("S")).forEach(str->System.out.println(str));
	}

}
