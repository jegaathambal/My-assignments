package week3.day1;

import java.util.Arrays;
public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] num={2, 5, 7, 7, 5, 9, 2, 3}; 
			PrintDuplicates dups = new PrintDuplicates();
//			dups.getDuplicateNumbersByNestedLoop(num);
			dups.getDuplicateNumbersBySingleLoop(num);
			
		}
		
		public void getDuplicateNumbersBySingleLoop(int[] x) {
			//sort the Array
			Arrays.sort(x);// 2,2,3,5,5,7,7,9
			for (int i = 0; i < x.length-1; i++) {
				if(x[i]==x[i+1]) {
					System.out.println(x[i]);
				}
			}
			
		}
		
		public void getDuplicateNumbersByNestedLoop(int[] x) {
			for(int i=0; i<x.length; i++) {
				for (int j = i+1; j < x.length; j++) {
					if(x[i]==x[j]) {
						System.out.println(x[i]);
						break;
					}
				}
			}
		}
		
		
	}

