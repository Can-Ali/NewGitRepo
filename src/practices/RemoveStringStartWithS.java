package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringStartWithS {

    //create a method that takes a string arraylist and removes all the strings that starts with s

	public static void main(String[] args) {
		ArrayList <String> arr= new ArrayList <>(Arrays.asList("string","java","sebze","soft","pencil"));
		removeS(arr);
	}

	public static void removeS(ArrayList<String> s) {
		for(int i=0; i<s.size();i++) {
			if(s.get(i).startsWith("s")) {
				s.remove(i);
				i--;
			}
		}
		System.out.println(s);
	}


}
