package com.functional_streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test3 {
	public static void main(String[] args) {
			//create stream of ints in range 1-50 in display all nos
			IntStream.range(1, 51) //src
			.forEach(i-> System.out.print(i+" ")); //terminal op
			// display all ints from 1-51
		
			
			System.out.println();
			IntStream.rangeClosed(1,50) //src
			.filter(i->i%2!=0) //IntStream --odd no 1 3 4 ...49 intervals
			.forEach(i-> System.out.print(i+" ")); //terminal op
		
		
		}

}
