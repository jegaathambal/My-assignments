package week4.day1homeassignment;

import java.util.ArrayList;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      list1.add(3);list1.add(2);list1.add(11);list1.add(4);list1.add(6);list1.add(7);
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      list2.add(1);list2.add(2);list2.add(8);list2.add(4);list2.add(9);list2.add(7);
	System.out.println(list1);
	System.out.println(list2);
      System.out.println("new list: "+ intersect(list1,list2));
	}
	

	private static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(list1.size()==list2.size())
           {for(int i=0; i<list1.size(); i++)
           { int temp =list1.get(i);
           if (list2.contains(temp)){ list.add(temp);
           
           }
           }
           }	
					
		return list;
	}

}
