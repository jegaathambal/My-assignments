package week3.day2;

public class JavaDailyExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str = "Hello World";
		String str2 ="   fly me   to   the moon  ";
		String str3 = 	"luffy is still joyboy";
		String[] word = str.split(" ");
		String[] word2 = str2.split(" ");
		String[] word3 = str3.split(" ");
		// length() helps to get length of the string
		
		
		System.out.println("the length of last word is " + word[word.length-1].length());
		System.out.println("the length of last word is " + word2[word2.length-1].length());
		System.out.println("the length of last word is " + word3[word3.length-1].length());
	
}
}