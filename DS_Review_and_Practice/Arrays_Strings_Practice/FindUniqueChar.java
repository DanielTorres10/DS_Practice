import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;


public class FindUniqueChar {
	
	public static void main(String[] args) {
		// Find out if string has unique characters
		String s1 = "mwo";
		String s2 = "data";
		System.out.println(findUniqueChars(s1));
		System.out.println(findUniqueChars(s2));
		
		// Find out if one string is a permutation of another string
		
		//false
		String s3 = "ABC";
		String s4 = "dsaBsACds";
		
		//true
		String s5 = "ABC";
		String s6 = "CAB";
		
		//true
		String s7 = "ABC";
		String s8 = "djdjdSNBACs";
	
		
//		System.out.println(findPermutation(s3, s4));
//		System.out.println(findPermutation(s5, s6));
//		System.out.println(findPermutation(s7, s8));
		
	}

	
	private static boolean findUniqueChars(String s) {
		Hashtable<Character,Integer> ht = new Hashtable<>();
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			if(!ht.containsKey(c[i])) ht.put( c[i], 0);
			else return false;
		}
		return true;
	}
	
	

}
