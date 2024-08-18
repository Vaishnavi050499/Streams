package com.training.ques7;

import java.util.stream.Stream;

public class ArrtoString {

	public static void main(String[] args) {
          String arr[]= {"90","100","200","300"};
         int sum =  Stream.of(arr).mapToInt(num->Integer.parseInt(num)).sum();
         System.out.println(sum);
	}

}
