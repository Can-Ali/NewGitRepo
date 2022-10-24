package practices;

import java.util.ArrayList;

//create a method that takes a String and returns an arraylist in the reverse of that string.
public class ReturnReversArrayString {

    public static void main(String[] args) {

        String str= "hi how ya doin";
        System.out.println(backward(str));

    }

//public static ArrayList<String> backward(String str){
//
//    ArrayList <String> s = new ArrayList<>();
//    for(int i=str.length()-1; i>=0; i-- ) {
//        s.add(""+str.charAt(i));
//
//    }
//    return s;
//}

    public static ArrayList<String> backward(String str){

        ArrayList <String> s = new ArrayList<>();
        String [] arr= str.split("");


        for(int i=arr.length-1; i>=0; i-- ) {
            s.add(arr[i]);

        }
        return s;

    }
}
