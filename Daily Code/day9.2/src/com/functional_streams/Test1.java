package com.functional_streams;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int [] data= {1,2,3,45,67,-100,5,6,120};
		//attach IntStream to the array n display elems
		
		Arrays.stream(data).forEach(i->System.out.print(i+" ")); //src: IntStream
		System.out.println();
		
		Arrays.stream(data) //src: IntStream
		.filter(i->i%2==0)//IntStream --even nos
		.forEach(i->System.out.print(i+" ")); 
		}
	}

