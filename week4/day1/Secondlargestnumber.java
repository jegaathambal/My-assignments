package week4.day1homeassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(3);number.add(2);number.add(11);number.add(4);number.add(8);number.add(7);
		//int number[] ={3, 2, 11, 4, 8, 7};
		Collections.sort(number);
		System.out.println(number);
		int seclargenum = number.size()+1;
		for (int i : number) {
			if(seclargenum < i) {
				
			
				System.out.println("The second largest number is " + seclargenum);
	}

}
	}
	}

