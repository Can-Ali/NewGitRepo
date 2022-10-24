package practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String []x= {"esra","likes","coding"};
        String []y= {"but","not","when","she","is","hungry"};
        System.out.println(combineR(x,y));

    }

    public static String combineR(String [] r1, String r2[]) {
        String sum="";
// <String> myarr= new ArrayList<>();
//
//		for(String s: r1) {
//			myarr.add(s);
//		}
//
//		for(String s: r2) {
//			myarr.add(s);
//		}
//
//		for(int i=0; i<myarr.size();i++) {
//			sum+=myarr.get(i)+" ";
//		}
//
//		return sum;

        ArrayList<String > a= new ArrayList<>(Arrays.asList(r1));
        ArrayList <String > b= new ArrayList<>(Arrays.asList(r2));
        a.addAll(b);

        for(int i=0; i<a.size();i++) {
            sum+=a.get(i)+" ";
        }
        return sum;


    }

}
