package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsUsingArrayList {

	public static void main(String[] args) {
		int[] num= {1,3,5,6,7,9};
		List<Integer> missEles = new ArrayList<Integer>();
		for (Integer integer : num) {
			missEles.add(integer);
			}
		Collections.sort(missEles);
		System.out.println(missEles);
		for (int i = 0; i < missEles.size()-1; i++) {
			if((missEles.get(i)+1)!=missEles.get(i+1)) {
				System.out.println("Missing number is :" +(missEles.get(i)+1));
			}
			
		}

	}

}
